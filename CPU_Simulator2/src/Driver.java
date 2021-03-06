import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

public class Driver {

	static CreateNextProcess creationQueue;
	static EventQueue eventQueue;
	static ReadyQueue readyQueue;
	static CPU cpu;
	static SimulationStats stats;
	static Clock clock;
	public static void main(String[] args) {
		//DEFUALT FILE PATH = "UserParamFolder\\UserParams"
		Scanner scan = new Scanner(System.in);
		System.out.println("Input File Name/Path: ");
		if(Utili.init(scan.nextLine())){
		//Starts the process
			creationQueue = new CreateNextProcess();
			creationQueue.add(0.0);
			eventQueue = new EventQueue();
			readyQueue = new ReadyQueue();
			stats = new SimulationStats();
			cpu = new CPU();
			clock = new Clock();
			startSimulation();
			System.out.println("Left Simulation");
		//------------------
		}
		scan.close();
	}
	
	
	
	
	static int pid=0;
	public static void startSimulation(){
		createNewProcessEvent(creationQueue.remove());
		
		createCPU_ReadyEvent(0.0, 0, null, null);
		while(Clock.getCurrentTime()<Utili.simulationDuration){
			//checks to see if any process need to be created
			if(creationQueue.peek()!=null){
			if(creationQueue.peek()<=Clock.currentTime){
				createNewProcessEvent(creationQueue.remove());
			}
			}
			//removes the next event from the event queue and process it
			Events event = eventQueue.remove();;
			
			switch (event.eventType) {
			case Events.newProcess:
				Process p = new Process(event.getTimeStamp(), event.getPid(), event.getNextProcess(), event.getCpu_Time(), event.getIO__Bound(), event.getCurrentBurst());
				creationQueue.add(p.nextProcessCreateTime);
				readyQueue.enqueue(p);
				p.setAddedToQueue(Clock.currentTime);
				event.printEvent();
				break;
				
			case Events.cpuReady:
				Process p2 = readyQueue.remove();
				p2.setRemovedFromQueue(Clock.getCurrentTime());
				p2.updateReadyWaiting(p2.getAddedToQueue(), p2.getRemovedFromQueue());
				p2.setFirstBurstTime(Utili.firstBurstLength(p2.processType));
				CPU.putOnCpu(p2);
				p2 = CPU.removeFromCPU();
				if(p2!=null){
				event.setPid(p2.getPid());
				event.setCurrentBurst(p2.getFirstBurstTime());
				event.setCpu_Time_Remaining(p2.getCpuTimeRemaining());
				event.printEvent();
				p2.setAddedToQueue(Clock.getCurrentTime());
				readyQueue.enqueue(p2);
				}
				break;
			case Events.ioInterupt:
				//Updates the event
				double serverTime = Utili.getioServiceTime();
				event.setServiceTime(Utili.getioServiceTime());
				event.setTimeStamp(Clock.getCurrentTime());
				//updates the Clock
				Clock.currentTime = Clock.getCurrentTime() + event.getServiceTime()+Utili.contextSwitch;
				event.printEvent();
				createIO_CompleteEvent(Clock.currentTime, event.getPid());
				break;
			case Events.ioComplete:
				event.printEvent();
				createCPU_ReadyEvent(Clock.getCurrentTime(), event.getPid(), null, null);
				break;
			case Events.quantumExpired:
				event.printEvent();
				createCPU_ReadyEvent(Clock.getCurrentTime(), event.getPid(), null, null);
				break;
			case Events.processComplet:
				stats.updateAvg_CPU_Ready_Wait(event.getWaitReady());
				createCPU_ReadyEvent(Clock.getCurrentTime(), event.getPid(), null, null);
				if(event.getIO__Bound()){
					stats.updateIO_Completed(1);
				}else{
					stats.updateCPU_Completed(1);
				}
				event.printEvent();
				break;
			default:
				break;
			}
			
			//If there are no process to be exicuted simulation wil speed up to next creation time
			if(readyQueue.isEmpty()){
				double temp = creationQueue.peek();
				Clock.currentTime = Clock.getCurrentTime() + (temp-Clock.getCurrentTime());
			}
			
		}
		
		//Prints out all the stats
		stats.printStats();
	}
	
	
	
	//Creates all the event objects
	
	//Creates New Process Event
	public static void createNewProcessEvent(double timeStamp){
		boolean pType = Utili.processType();
		Events event = new Events(timeStamp, pid, Utili.getprocessLength(), Utili.nextCreationTime(), pType, Utili.firstBurstLength(pType), null, null, null, null, Events.newProcess);
		pid++;
		System.out.println("CALLED_1");
		eventQueue.enqueue(event);
	}
	
	//Creates New CPU Ready Event
	public static void createCPU_ReadyEvent(double timeStamp, int pid2, Double currentburst, Double cpuTimeRemaining){
		Events event = new Events(timeStamp, pid2, null, null, null, currentburst, null, cpuTimeRemaining, null, null, Events.cpuReady);
		System.out.println("CALLED_2");
		eventQueue.enqueue(event);
	}
	
	//Creates New IO_Interrupt Event
	public static void createIO_InterruptEvent(Double timeStamp, int pid2, Double serviceTime){
		Events event = new Events(timeStamp, pid2, null, null, null, null, serviceTime, null, null, null, Events.ioInterupt);
		System.out.println("CALLED_3");
		eventQueue.enqueue(event);
	}
	
	//Creates New IO_Complete Event
	public static void createIO_CompleteEvent(Double timeStamp, int pid2){
		Events event = new Events(timeStamp, pid2, null, null, null, null, null, null, null, null, Events.ioComplete);
		System.out.println("CALLED_4");
		eventQueue.enqueue(event);
	}
	
	//Creates New IO_Complete Event
	public static void createQuantumExpiredEvent(Double timeStamp, int pid2){
		Events event = new Events(timeStamp, pid2, null, null, null, null, null, null, null, null, Events.quantumExpired);
		System.out.println("CALLED_5");
		eventQueue.enqueue(event);
	}
	
	//Creates New IO_Complete Event
	public static void createProcessCompleteEvent(Double timeStamp, int pid2, Double TotalCPUTime, Double waitReady, boolean processType){
		Events event = new Events(timeStamp, pid2, TotalCPUTime, null, processType, null, null, null, waitReady, null, Events.processComplet);
		System.out.println("CALLED_6");
		eventQueue.enqueue(event);
	}
	
	static int newMade =0;
	public static int newMade(){
		newMade = newMade+1;
		return newMade;
	}
}

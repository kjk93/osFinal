
public class Controler {

	/**
	 * Creates the first process, sends it to the queue and and starts the CPU and timer
	 * @throws InterruptedException 
	 */
	CPU cpu;
	static EventQueue eventQeueu;
	static ReadyQueue readyQueue;
	public void start() throws InterruptedException{
		cpu = new CPU();
		eventQeueu = new EventQueue();
		readyQueue = new ReadyQueue();
		Process firstProcess = new Process(Clock.getCurrentTime(),0);
		readyQueue.add(firstProcess);
		eventQeueu.add(firstProcess.getProcessEvent());
		cpu.putOnCPU(eventQeueu.dequeue());
		cpu.start();
	}
	
	public void sendToCPU(){
		
	}
	
	public static void createCPU_READY(int pid2, float currentBurst, float totalTimeRemaining){
		System.out.println("CPU TIME REMAINING " + totalTimeRemaining);
		Events cpuReady = new Events(Clock.getCurrentTime(), pid2, null, null, null, currentBurst, null, totalTimeRemaining, null, null, Events.cpuReady);

		
	}
	
	public static void createIO_Interrupt(){
		
	}
}

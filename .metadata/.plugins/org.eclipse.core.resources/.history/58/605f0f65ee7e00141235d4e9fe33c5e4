
public class CPU {
	Process processOnCpu;
	float cpuTime=0;
	public CPU() {
		
	}
	
	
	public void putOnCPU(Process process){
		//cpuTime =0;
if(Clock.currentTime<Utili.simulationDuration){
		processOnCpu = process;
		float burstLength = Utili.BurstLength(processOnCpu.isProcessType());
		if(burstLength<Utili.quantum){
			float cpuRemain = processOnCpu.getCpuTimeRemaining();
			if(cpuRemain>burstLength){
			processOnCpu.setCpuTimeRemaining(burstLength);
			float servicetime = Utili.serviceTime();
			Controler.createIO_Interrupt(processOnCpu.pid,servicetime);
			Controler.ioComplete(processOnCpu.getPid());
			Clock.currentTime = Clock.currentTime + cpuTime + Utili.contextSwitch + servicetime;
			//generate an io complete
			Controler.createCPU_READY(processOnCpu.getPid(), burstLength, processOnCpu.getCpuTimeRemaining());
			}else{
				Clock.currentTime = Clock.currentTime + processOnCpu.getCpuTimeRemaining();
				Controler.processComplete(processOnCpu.getPid(), processOnCpu.getCPU_Time(), processOnCpu.processType);
			}
		}else{
			float cpuRemain = processOnCpu.getCpuTimeRemaining();
			if(cpuRemain>burstLength){
			processOnCpu.setCpuTimeRemaining(Utili.quantum);
			cpuTime = Utili.quantum;
			Clock.currentTime = Clock.currentTime + cpuTime + Utili.contextSwitch+ Utili.contextSwitch;
			Controler.quantumExpired(processOnCpu.getPid());
			Controler.createCPU_READY(processOnCpu.getPid(), burstLength, processOnCpu.getCpuTimeRemaining());
			}else{
				Clock.currentTime = Clock.currentTime + processOnCpu.getCpuTimeRemaining()+Utili.contextSwitch;
				Controler.processComplete(processOnCpu.getPid(), processOnCpu.getCPU_Time(), processOnCpu.processType);
			}
		}		
		//Generate IO Interrupt
		
	}else{
		System.out.println("DONE");//
	}
}
		//Generate Quantum Expired
	
	public Process removeFromCPU(){
		return processOnCpu;
	}
	
	public void updateProcessStates(Process process){
		//process.updateReadyWaiting(process.getAddedToQueue(), Clock.getCurrentTime());
	}
	
	public static void processEvent(Events event){
		if(event.eventType.equals(Events.newProcess)){
			if(event.getCpu_Time_Remaining()>Utili.quantum){
				event.setCpu_Time_Remaining(event.getCpu_Time_Remaining()-Utili.quantum);
			}else{
				
			}
		}
	}
}

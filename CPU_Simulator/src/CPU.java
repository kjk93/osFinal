
public class CPU {
	Process processOnCpu;
	float cpuTime=0;
	public CPU() {
		
	}
	
	
	public void putOnCPU(Process process){
		//cpuTime =0;
		processOnCpu = process;
		float burstLength = Utili.BurstLength(processOnCpu.isProcessType());
		
		if(burstLength<Utili.quantum&&cpuTime<Utili.quantum){
			float cpuRemain = processOnCpu.getCpuTimeRemaining();
			if(cpuRemain>burstLength){
			processOnCpu.setCpuTimeRemaining(burstLength);
			float servicetime = .05f;
			Controler.createIO_Interrupt(processOnCpu.pid,servicetime);
			Controler.ioComplete(processOnCpu.getPid());
			Clock.currentTime = Clock.currentTime + cpuTime + Utili.contextSwitch + servicetime;
			//generate an io complete
			Controler.createCPU_READY(processOnCpu.getPid(), burstLength, processOnCpu.getCpuTimeRemaining());
			}else{
				Clock.currentTime = Clock.currentTime + processOnCpu.getCpuTimeRemaining();
				//Add all of the process stats!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				Controler.processComplete(processOnCpu.getPid(), processOnCpu.getCPU_Time(), processOnCpu.processType, .054f/*waitReady*/, .09f /*inIO*/);
			}
		}else{
			float cpuRemain = processOnCpu.getCpuTimeRemaining();
			if(cpuRemain>burstLength){
			processOnCpu.setCpuTimeRemaining(Utili.quantum);
			cpuTime = Utili.quantum;
			Controler.createCPU_READY(processOnCpu.getPid(), burstLength, processOnCpu.getCpuTimeRemaining());
			Clock.currentTime = Clock.currentTime + cpuTime + Utili.contextSwitch+ Utili.contextSwitch;
			Controler.quantumExpired(processOnCpu.getPid());
			}else{
				Clock.currentTime = Clock.currentTime + processOnCpu.getCpuTimeRemaining()+Utili.contextSwitch;
				//Add all of the process stats!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				Controler.processComplete(processOnCpu.getPid(), processOnCpu.getCPU_Time(), processOnCpu.processType, .054f/*waitReady*/, .09f /*inIO*/);
			}
		}		
		//Generate IO Interrupt
		
		//
		}
		//Generate Quantum Expired
	
	public Process removeFromCPU(){
		return processOnCpu;
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

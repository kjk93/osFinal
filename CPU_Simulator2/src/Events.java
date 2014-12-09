import com.sun.glass.ui.Pixels.Format;


public class Events {
	
	//Event Tags
	static final String newProcess = "NEW_PROCESS";
	static final String cpuReady = "CPU_READY";
	static final String ioInterupt = "IO_INTERRUPT";
	static final String ioComplete = "IO_COMPLETE";
	static final String processComplet = "PROCESS_COMPLETE";
	static final String quantumExpired = "QUANTUM_EXPIRED";
	//
	private Double timeStamp;
	private Integer pid;
	private Double cpu_Time;
	private Double nextProcess;
	private Boolean IO__Bound;
	private Double currentBurst;
	public Double getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(double timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public double getCpu_Time() {
		return cpu_Time;
	}


	public void setCpu_Time(double cpu_Time) {
		this.cpu_Time = cpu_Time;
	}


	public double getNextProcess() {
		return nextProcess;
	}


	public void setNextProcess(double nextProcess) {
		this.nextProcess = nextProcess;
	}


	public Boolean getIO__Bound() {
		return IO__Bound;
	}


	public void setIO__Bound(Boolean iO__Bound) {
		IO__Bound = iO__Bound;
	}


	public double getCurrentBurst() {
		return currentBurst;
	}


	public void setCurrentBurst(double currentBurst) {
		this.currentBurst = currentBurst;
	}


	public double getServiceTime() {
		return serviceTime;
	}


	public void setServiceTime(double serviceTime) {
		this.serviceTime = serviceTime;
	}


	public double getCpu_Time_Remaining() {
		return cpu_Time_Remaining;
	}


	public void setCpu_Time_Remaining(double burstTime) {
		this.cpu_Time_Remaining = burstTime;
	}


	public double getWaitReady() {
		return waitReady;
	}


	public void setWaitReady(double waitReady) {
		this.waitReady = waitReady;
	}


	public double getInIO() {
		return inIO;
	}


	public void setInIO(double inIO) {
		this.inIO = inIO;
	}


	public String getEventType() {
		return eventType;
	}


	public void setEventType(String eventType) {
		this.eventType = eventType;
	}


	private Double serviceTime;
	public void setServiceTime(Double serviceTime) {
		this.serviceTime = serviceTime;
	}


	private Double cpu_Time_Remaining;
	private Double waitReady;
	private Double inIO;
	public String eventType;

	public Events(Double timeStamp2, Integer pid2, Double cPU_Time,
			Double nextProcess2, Boolean iO_Bound, Double currentBurst2,
			Double serviceTime2, Double cpu_Time_Remaining2, Double waitReady2, Double inIO2, String eventType2) {
		// TODO Auto-generated constructor stub
		timeStamp = timeStamp2;
		pid = pid2;
		cpu_Time = cPU_Time;
		nextProcess = nextProcess2;
		IO__Bound = iO_Bound;
	    currentBurst = currentBurst2;
		serviceTime = serviceTime2;
		cpu_Time_Remaining = cpu_Time_Remaining2;
		waitReady = waitReady2;
		inIO =  inIO2;
		eventType = eventType2;
	}



	public  void printEvent(){
		switch (eventType) {
		case newProcess:
			if(IO__Bound){
				System.out.println("Time:	" + timeStamp + " Event 'New Process': pid="+pid+" totalCPU=" + cpu_Time + " IO-Bound; Next new at " + nextProcess );
			}else{
			System.out.println("Time:	" + timeStamp + " Event 'New Process': pid=0 totalCPU=" + cpu_Time + " CPU-Bound; Next new at " + nextProcess );
			}
			break;

		case cpuReady:
			System.out.println("Time:	" +  timeStamp + " Event 'Ready -> CPU' pid=" +pid+ " currentBurst="+ currentBurst + " cpuTimeRemaining: " + cpu_Time_Remaining);
			break;
			
		case ioInterupt:
			System.out.println("Time:	"  +timeStamp+ " Event 'I/O Interrupt': pid="+pid + " svctime="+serviceTime);
			break;
			
		case ioComplete:
			System.out.println("Time:	"+ timeStamp + " Event 'I/O Completed': pid="+pid);
			break;
		case processComplet:
			if(IO__Bound){
				System.out.println("Time:	" + timeStamp + " Event 'Process Finished': pid="+pid+" totalCPU=" + cpu_Time + " IO-Bound " +" waitready="+waitReady );
			}else{
			System.out.println("Time:	" + timeStamp + " Event 'Process Finished': pid="+pid+" totalCPU=" + cpu_Time + " CPU-Bound " +" waitready="+waitReady  );
			}			
			break;
		case quantumExpired:
				System.out.println("Time:	" + timeStamp + " Event 'Quantum Expired': pid="+pid);	
			break;
		default:
			break;
		}
	}
	

	public static double formatTime(double timeStamp){
		double temp = (double) timeStamp;
		return temp/10000;
	}
}
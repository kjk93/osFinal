import com.sun.glass.ui.Pixels.Format;


public class Events {
	
	public static void newProcessEvent(float timeStamp, int pid, float cPU_Time, float nextProcess, boolean IO_Bound){
		if(IO_Bound){
			System.out.println("Time:	" + timeStamp + " Event 'New Process': pid="+pid+" totalCPU=" + cPU_Time + " IO-Bound; Next new at " + nextProcess );
		}else{
		System.out.println("Time:	" + timeStamp + " Event 'New Process': pid=0 totalCPU=" + cPU_Time + " CPU-Bound; Next new at " + nextProcess );
		}
	}
	
	public static void CPU_Ready(float timeStamp, int pid, float cPU_Time, float currentBurst, float cpuTimeRemaining){
			System.out.println("Time:	" +  timeStamp + " Event 'Ready -> CPU' pid=" +pid+ " currentBurst="+ currentBurst +" totalCPURem="+cpuTimeRemaining );
		
	}
	
	public static void IO_Interrupt(float timeStamp, int pid, float svcTime){
		System.out.println("Time:	"  +timeStamp+ " Event 'I/O Interrupt': pid="+pid + " svctime="+svcTime);
	
	}
	
	public static void IO_Complete(float timeStamp, int pid){
		System.out.println("Time:	"+ timeStamp + " Event 'I/O Completed': pid="+pid);
	
	}
	
	public static void process_Complete(float timeStamp, int pid, float cPU_Time, boolean IO_Bound, float waitready, float inI_O){
		if(IO_Bound){
			System.out.println("Time:	" + timeStamp + " Event 'Process Finished': pid="+pid+" totalCPU=" + cPU_Time + " IO-Bound " +" waitready="+waitready + " inI/O="+ inI_O );
		}else{
		System.out.println("Time:	" + timeStamp + " Event 'Process Finished': pid="+pid+" totalCPU=" + cPU_Time + " CPU-Bound " +" waitready="+waitready + " inI/O="+ inI_O );
		}
	}
	public static float formatTime(float timeStamp){
		float temp = (float) timeStamp;
		return temp/10000;
	}
}

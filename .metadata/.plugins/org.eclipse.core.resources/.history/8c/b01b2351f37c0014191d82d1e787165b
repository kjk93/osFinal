import com.sun.glass.ui.Pixels.Format;


public class Events {
	
	public static void newProcessEvent(float timeStamp, float cPU_Time, float nextProcess, boolean IO_Bound){
		if(IO_Bound){
			System.out.println("Time:	" + timeStamp + " Event 'New Process': pid=0 totalCPU=" + cPU_Time + " IO-Bound; Next new at " + nextProcess );
		}else{
		System.out.println("Time:	" + timeStamp + " Event 'New Process': pid=0 totalCPU=" + cPU_Time + " CPU-Bound; Next new at " + nextProcess );
		}
	}
	
	public static float formatTime(float timeStamp){
		float temp = (float) timeStamp;
		return temp/10000;
	}
}

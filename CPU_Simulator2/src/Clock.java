import java.util.Timer;
import java.util.TimerTask;



public class Clock extends Timer{
	static double currentTime;
	static double totalTimeRemaining;
	public Clock() {
		currentTime = 0;
		totalTimeRemaining = Utili.getSimulationDuration();
		//Calls a event to be run once ever secon
	}
	
	public static void upDateTimeRemaining(float time){
		totalTimeRemaining = totalTimeRemaining - time;
	}
	
	public static double getTimeRemaining(){
		return totalTimeRemaining;
	}
	public void incrmentSimulationClock(int incrementClockBy){
		currentTime = currentTime + incrementClockBy;
	}
	
	/*Method to terminate the simulation once current time 
	* is the same as or grater than simulation duration  
	*/
	public void terminateSimulation(){
		System.out.println("\n Simulation Finished");
		this.cancel();
	}
	
	public static double getCurrentTime(){
		return currentTime;
	}
}
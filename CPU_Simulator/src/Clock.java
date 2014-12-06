import java.util.Timer;
import java.util.TimerTask;



public class Clock extends Timer{
	static long currentTime;
	SimulationStats stats;
	
	public Clock() {
		currentTime = 0;
		stats = new SimulationStats();
		stats.printStats();
		//Calls a event to be run once ever secon
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
	
	public static long getCurrentTime(){
		return currentTime;
	}
}
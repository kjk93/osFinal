import java.util.Timer;
import java.util.TimerTask;



public class Clock extends Timer{
	int currentTime;
	
	public Clock() {
		currentTime = 0;
		//Calls a event to be run once ever second
		//this.scheduleAtFixedRate(new ClockTick(), 0, 1000);
	}
	
	public void incrmentClock(int incrementClockBy){
		currentTime = currentTime + incrementClockBy;
		checkSimulationcompleteness();
	}
	
	/*Method to terminate the simulation once current time 
	* is the same as or grater than simulation duration  
	*/
	public void checkSimulationcompleteness(){
		if(currentTime<Utili.getSimulationDuration()){
		}else{
			//!!!!---Code To terminate simulation---!!!//
		}
	}
	
	
	
	
	//Dont know if we need a actual clock or just a virtuial on?????
	//So we may not need this class
	class ClockTick extends TimerTask{
		
		//Code that will be executed once every second 
		@Override
		public void run() {
			currentTime++;
			if(currentTime<Utili.getSimulationDuration()){
				System.out.println(currentTime);
			}else{
				//!!--Code To Kill Simulation--!!!!//
			}
			
		}
		
	}
}
import java.util.Timer;
import java.util.TimerTask;



public class Clock extends Timer{
	int currentTime;
	
	public Clock() {

		//Calls a event to be run once ever second
		this.scheduleAtFixedRate(new ClockTick(), 0, 1000);
	}
	
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
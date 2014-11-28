import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Utili {

	static Scanner fileRead;
	
	//---User Supplied Param's---//
	static int simulationDuration = 5;									//The amount of time the simulation should run
	static int quantum;											//The quantum used in the Round Robin algo
	static int contextSwitch;										//????
	static int avgProcessLength;									//The average used to calculate the total CPU time of a newly created process 
	static int creationMean;										//The mean value used to calculate the time till next process creation									
	static int i_oServTime;
	//---------------------------//
	
	
	/**
	 * Initializes all the user entered parameters of the CPU Scheduler
	 * for the information in the file provided to the method
	 * @param fileName
	 * @return True if file read was successful, False otherwise
	 */
	public static boolean init(String fileName) {
		File file = new File(fileName);
		try {
			fileRead = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}


/*
 * User Supplied param get/set methods
 * BEGIN
 */
	public static int getSimulationDuration() {
		return simulationDuration;
	}


	public void setSimulationDuration(int simulationDuration) {
		Utili.simulationDuration = simulationDuration;
	}


	public int getQuantum() {
		return quantum;
	}


	public void setQuantum(int quantum) {
		Utili.quantum = quantum;
	}


	public int getContextSwitch() {
		return contextSwitch;
	}


	public void setContextSwitch(int contextSwitch) {
		Utili.contextSwitch = contextSwitch;
	}


	public int getAvgProcessLength() {
		return avgProcessLength;
	}


	public void setAvgProcessLength(int avgProcessLength) {
		Utili.avgProcessLength = avgProcessLength;
	}


	public int getCreationMean() {
		return creationMean;
	}


	public void setCreationMean(int creationMean) {
		Utili.creationMean = creationMean;
	}


	public int getI_oServTime() {
		return i_oServTime;
	}


	public void setI_oServTime(int i_oServTime) {
		Utili.i_oServTime = i_oServTime;
	}
	
	/*
	 * User Supplied param get/set methods
	 * END
	 */
}

import java.io.File;
import java.util.Scanner;


class Utili {

	Scanner fileReaad;
	
	//---User Supplied Param's---//
	int simulationDuration;									//The amount of time the simulation should run
	int quantum;											//The quantum used in the Round Robin algo
	int contextSwitch;										//????
	int avgProcessLength;									//The average used to calculate the total CPU time of a newly created process 
	int creationMean;										//The mean value used to calculate the time till next process creation									
	int i_oServTime;
	//---------------------------//
	
	
	/**
	 * Initializes all the user entered parameters of the CPU Scheduler
	 * for the information in the file provided to the method
	 * @param fileName
	 * @return True if file read was successful, False otherwise
	 */
	public boolean init(String fileName) {
		File file = new File(fileName);
		
		return true;
	}


/*
 * User Supplied param get/set methods
 * BEGIN
 */
	public Scanner getFileReaad() {
		return fileReaad;
	}


	public void setFileReaad(Scanner fileReaad) {
		this.fileReaad = fileReaad;
	}


	public int getSimulationDuration() {
		return simulationDuration;
	}


	public void setSimulationDuration(int simulationDuration) {
		this.simulationDuration = simulationDuration;
	}


	public int getQuantum() {
		return quantum;
	}


	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}


	public int getContextSwitch() {
		return contextSwitch;
	}


	public void setContextSwitch(int contextSwitch) {
		this.contextSwitch = contextSwitch;
	}


	public int getAvgProcessLength() {
		return avgProcessLength;
	}


	public void setAvgProcessLength(int avgProcessLength) {
		this.avgProcessLength = avgProcessLength;
	}


	public int getCreationMean() {
		return creationMean;
	}


	public void setCreationMean(int creationMean) {
		this.creationMean = creationMean;
	}


	public int getI_oServTime() {
		return i_oServTime;
	}


	public void setI_oServTime(int i_oServTime) {
		this.i_oServTime = i_oServTime;
	}
	
	/*
	 * User Supplied param get/set methods
	 * END
	 */
}

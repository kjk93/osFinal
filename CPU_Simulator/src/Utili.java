import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


class Utili {

	static Scanner fileRead;
	
	//---User Supplied Param's---//
	static int simulationDuration=-1;								//The amount of time the simulation should run
	static int quantum=-1;											//The quantum used in the Round Robin algo
	static int contextSwitch=-1;									//The time it takes to store and restore a process so it can be used at a later time (MicroSeconds)
	static int avgProcessLength=-1;									//The average used to calculate the total CPU time of a newly created process 
	static int creationMean=-1;										//The mean value used to calculate the time till next process creation									
	static int IO_Percent=-1;										//The percentage of processes that are I/O Bound, the rest will be CPU bound
	static int i_oServTime=-1;										//The time need for service an I/O fault. Generated randomly based on a user supplied parameter 
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
			try{
				if(scanFile(fileRead)){
					printUserParams();
				}else{
					throw new Exception("Class: Utili Method: ScanFile: scanner had null value or did not meet required user inputs");
				}
				
			} catch(Exception e){
				e.printStackTrace();
			}
			
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
	
	//Scans through the file and extracts all of the user supplied parameters
	public static boolean scanFile(Scanner scanner){
		
		if(scanner!=null){
			System.out.println("File comment: " + scanner.nextLine());
			simulationDuration = scanner.nextInt();
			scanner.nextLine();
			quantum = scanner.nextInt();
			scanner.nextLine();
			contextSwitch = scanner.nextInt();
			scanner.nextLine();
			avgProcessLength = scanner.nextInt();
			scanner.nextLine();
			creationMean = scanner.nextInt();
			scanner.nextLine();
			IO_Percent = scanner.nextInt();
			scanner.nextLine();
			i_oServTime = scanner.nextInt();
			scanner.nextLine();
			//Checks to verify all required user params have been meet. 
			if(simulationDuration>=0&&quantum>=0&&contextSwitch>=0&&avgProcessLength>=0&&creationMean>=0&&IO_Percent>=0&&i_oServTime>=0){
			return true;
			}else{
				return false;
			}
		}
		else{
		return false;
		}
	}
	
	
	
	//Prints the user parameters
	public static void printUserParams(){
		System.out.println("File parameters:");
		System.out.println("	Total Simulation Time:		    " + simulationDuration + "s");
		System.out.println("	Quantum: 			    " + quantum + "us");
		System.out.println("	Context Switch Time: 		    " + contextSwitch + "us");
		System.out.println("	Average total CPU time per process: " + avgProcessLength + "us");
		System.out.println("	Average time between new processes: " + creationMean + "us");
		System.out.println("	Percentage of I/O-bound processes:  " + IO_Percent + "%");
		System.out.println("	Average I/O service time: 	    " + i_oServTime + "us");
		//For Testing can delete 
		System.out.println("-----Process One----------");
		Process p = new Process(0);
		p.printValues();
		//--------------
	}
	
	
	/*
	 * New Process creation parameter calculations
	 * BEGIN
	 */
	
	/**
	 * Time when next new process will be created, in microseconds: (exponential
	 * centered on input parameter)
	 * 
	 * @return
	 */
	public static int nextCreationTime(){
		return calXDistribution(creationMean);
	}
	
	/**
	 * total CPU time of this process, in microseconds: exponential (centered on input parameter)
	 * @return
	 */
	public static int totalCPU_Time(){
		return calXDistribution(avgProcessLength);
	}
	
	/**
	 * Whether this process is I/O bound or CPU-bound: pick based on a random number and the given percentage input parameter
	 * 
	 * -!Returns true if it is a IO bound process and false if it is a CPU bound process
	 * @return
	 */
	public static boolean processType(){
		Random rand = new Random();
		if(rand.nextInt(100)<=IO_Percent){
			//If the random generated number is less than or equal to the 
			//Number enter by the user for IO process percentage than the 
			//Process is an IO bound process.
			return true;
		}else{
			//The process is an CPU bound process
			return false;
		}
		
	}
	
	public static int firstBurstLength(boolean isIO_Bound){
		Random rand = new Random();
		if(isIO_Bound){
			return rand.nextInt(2000)+2000;
		}else{
		return rand.nextInt(10000)+10000;
		}
	}
	//Calculates The exponential distributed random number
	public static int calXDistribution(int mean){
		return  (int) (-mean * Math.log(Math.random()));
	}
	/*
	 * New Process creation parameter calculations
	 * BEGIN
	 */
}

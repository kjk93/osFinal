/**
 * Keeps track of all the process statistics 
 * @author goodwinj14
 *
 */
public class SimulationStats {
//All Overall Stats
float TotalCreadtedProcesses;
float CPUutilization;					//Total time cpu is used
float switvhTime;

//All IO bound Stats
float Total_I_O;
float IO_Completed;
float total_IO_Cpu_Time;
float avg_IO_Cpu_Time;
float total_IO_Ready_Wait;
float avg_IO_Ready_Wait;
float total_IO_Serve;
float avg_IO_Serve;
float total_IO_TurnAround;
float avg_IO_TurnAround;
float total_IO_Interrupts;
float avg_IO_Interrupts;

//All CPU bound process Stats
float Total_CPU;
float CPU_Completed;
float total_CPU_Cpu_Time;
float avg_CPU_Cpu_Time;
float total_CPU_Ready_Wait;
float avg_CPU_Ready_Wait;
float total_CPU_Serve;
float avg_CPU_Serve;
float total_CPU_TurnAround;
float avg_CPU_TurnAround;
float total_CPU_Interrupts;
float avg_CPU_Interrupts;

public SimulationStats() {
	TotalCreadtedProcesses = 0;
	CPUutilization = 0;
	
	Total_I_O = 0;
	IO_Completed = 0;
	avg_IO_Cpu_Time = 0;
	avg_IO_Ready_Wait = 0;
	avg_IO_Serve = 0;
	avg_IO_TurnAround = 0;
	avg_IO_Interrupts = 0;
	
	Total_CPU = 0;
	CPU_Completed = 0; 
	avg_CPU_Cpu_Time = 0;
	avg_CPU_Ready_Wait = 0;
	avg_CPU_Serve = 0;
	avg_CPU_TurnAround = 0;
	avg_CPU_Interrupts = 0;
}

/**
 * @param totalCreadtedProcesses the totalCreadtedProcesses to set
 */
public void updateTotalCreadtedProcesses(float totalCreadtedProcesses) {
	TotalCreadtedProcesses = TotalCreadtedProcesses + totalCreadtedProcesses;
}

/**
 * @param cPUutilization the cPUutilization to set
 */
public void updateCPUutilization(float cPUutilization) {
	CPUutilization = CPUutilization + cPUutilization;
}

/**
 * @param switvhTime the switvhTime to set
 */
public void updateSwitvhTime(float switvhTime) {
	this.switvhTime = this.switvhTime + switvhTime;
}

/**
 * @param total_I_O the total_I_O to set
 */
public void updateTotal_I_O(float total_I_O) {
	Total_I_O = Total_I_O+ total_I_O;
}

/**
 * @param iO_Completed the iO_Completed to set
 */
public void updateIO_Completed(float iO_Completed) {
	IO_Completed = IO_Completed + iO_Completed;
}

/**
 * @param avg_IO_Cpu_Time the avg_IO_Cpu_Time to set
 */
public void updateAvg_IO_Cpu_Time(float new_IO_Cpu_Time) {
	this.total_IO_Cpu_Time = total_IO_Cpu_Time + new_IO_Cpu_Time;
	this.avg_IO_Cpu_Time = this.total_IO_Cpu_Time/IO_Completed;
}

/**
 * @param avg_IO_Ready_Wait the avg_IO_Ready_Wait to set
 */
public void updateAvg_IO_Ready_Wait(float new_IO_Ready_Wait) {
	this.total_IO_Ready_Wait = this.total_IO_Ready_Wait + new_IO_Ready_Wait;
	this.avg_IO_Ready_Wait = this.total_IO_Ready_Wait/IO_Completed;
}

/**
 * @param avg_IO_Serve the avg_IO_Serve to set
 */
public void updateAvg_IO_Serve(float new_IO_Serve) {
	this.total_IO_Serve = this.total_IO_Serve + new_IO_Serve;
	this.avg_IO_Serve = this.total_IO_Serve/IO_Completed;
}

/**
 * @param avg_IO_TurnAround the avg_IO_TurnAround to set
 */
public void updateAvg_IO_TurnAround(float new_IO_TurnAround) {
	this.total_IO_TurnAround = this.total_CPU_TurnAround + new_IO_TurnAround;
	this.avg_IO_TurnAround = this.total_IO_TurnAround/IO_Completed;
}

/**
 * @param avg_IO_Interrupts the avg_IO_Interrupts to set
 */
public void updateAvg_IO_Interrupts(float new_IO_Interrupts) {
	this.total_IO_Interrupts = this.total_IO_Interrupts + new_IO_Interrupts;
	this.avg_IO_Interrupts = this.total_IO_Interrupts/IO_Completed;
}

/**
 * @param total_CPU the total_CPU to set
 */
public void updateTotal_CPU(float total_CPU) {
	Total_CPU = Total_CPU+ total_CPU;
}

/**
 * @param cPU_Completed the cPU_Completed to set
 */
public void updateCPU_Completed(float cPU_Completed) {
	CPU_Completed = CPU_Completed + cPU_Completed;
}

/**
 * @param avg_CPU_Cpu_Time the avg_CPU_Cpu_Time to set
 */
public void updateAvg_CPU_Cpu_Time(float new_CPU_Cpu_Time) {
	this.total_CPU_Cpu_Time = this.total_CPU_Cpu_Time + new_CPU_Cpu_Time;
	this.avg_CPU_Cpu_Time = this.total_CPU_Cpu_Time/CPU_Completed;
}

/**
 * @param avg_CPU_Ready_Wait the avg_CPU_Ready_Wait to set
 */
public void updateAvg_CPU_Ready_Wait(float new_CPU_Ready_Wait) {
	this.total_CPU_Ready_Wait = this.total_CPU_Ready_Wait + new_CPU_Ready_Wait;
	this.avg_CPU_Ready_Wait = this.total_CPU_Ready_Wait/CPU_Completed;
}

/**
 * @param avg_CPU_Serve the avg_CPU_Serve to set
 */
public void updateAvg_CPU_Serve(float new_CPU_Serve) {
	this.total_CPU_Serve = this.total_CPU_Serve + new_CPU_Serve;
	this.avg_CPU_Serve = this.total_CPU_Serve/CPU_Completed;
}

/**
 * @param avg_CPU_TurnAround the avg_CPU_TurnAround to set
 */
public void setAvg_CPU_TurnAround(float new_CPU_TurnAround) {
	this.total_CPU_TurnAround = this.total_CPU_TurnAround + new_CPU_TurnAround;
	this.avg_CPU_TurnAround = this.total_CPU_TurnAround/CPU_Completed;
}

/**
 * @param avg_CPU_Interrupts the avg_CPU_Interrupts to set
 */
public void updateAvg_CPU_Interrupts(float new_CPU_Interrupts) {
	this.total_CPU_Interrupts = this.total_CPU_Interrupts + new_CPU_Interrupts; 
	this.avg_CPU_Interrupts = this.total_CPU_Interrupts/CPU_Completed;
}

public void printStats(){
	//Prints Overall Stats
	System.out.println("");
	System.out.println("OVERALL");
	System.out.println("Simulation time:	 	 " + Utili.getSimulationDuration() + " seconds");
	System.out.println("Created:	 		 " + TotalCreadtedProcesses + " processes.");
	System.out.println("Average CPU time:		 " +((avg_CPU_Cpu_Time+avg_IO_Cpu_Time)/2) + " seconds");
	System.out.println("CPU utilization: 		 " + ((CPUutilization + Utili.getSimulationDuration())/2) + "% ("+ CPUutilization + " seconds)");
	System.out.println("Total time in context switches:  " + switvhTime + " seconds");
	System.out.println("TOTAL number of proc. completed: " + (CPU_Completed+IO_Completed) + " processes");
	System.out.println("Ratio of I/O-bound completed: 	" + "THIS NEEDS TO BE FINISHED");
	System.out.println("Average ready waiting time: 	 " + ((avg_CPU_Ready_Wait+avg_IO_Ready_Wait)/2) + " seconds");
	System.out.println("Average turnaround time: 	 " + ((avg_CPU_TurnAround+avg_IO_TurnAround)/2) + " seconds");
	
	//Prints out I/0 bound stats
	System.out.println("");
	System.out.println("I/O Bound Stats");
	System.out.println("Number of I/O-BOUND proc. completed: 	" + IO_Completed + " processes");
	System.out.println("Average CPU time: 			" + avg_IO_Cpu_Time + " seconds");
	System.out.println("Average ready waiting time: 		" + avg_IO_Ready_Wait + " seconds");
	System.out.println("Average I/O service time: 		" + avg_IO_Serve + " seconds");
	System.out.println("Average turnaround time: 		" + avg_IO_TurnAround + " seconds");
	System.out.println("Average I/O interrupts/proc.: 		" + total_IO_Interrupts );

	//Prints out CPU bound stats
	System.out.println("");
	System.out.println("CPU Bound Stats");
	System.out.println("Number of CPU-BOUND proc. completed: 	" + CPU_Completed + " processes");
	System.out.println("Average CPU time:		 	" + avg_CPU_Cpu_Time + " seconds");
	System.out.println("Average ready waiting time: 		" + avg_CPU_Ready_Wait + " seconds");
	System.out.println("Average CPU service time: 		" + avg_CPU_Serve + " seconds");
	System.out.println("Average turnaround time: 		" + avg_CPU_TurnAround + " seconds");
	System.out.println("Average I/O interrupts/proc.: 		" + total_CPU_Interrupts);
}
}

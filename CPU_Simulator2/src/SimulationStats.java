/**
 * Keeps track of all the process statistics 
 * @author goodwinj14
 *
 */
public class SimulationStats {
//All Overall Stats
double TotalCreadtedProcesses;
double CPUutilization;					//Total time cpu is used
double switvhTime;

//All IO bound Stats
double Total_I_O;
double IO_Completed;
double total_IO_Cpu_Time;
double avg_IO_Cpu_Time;
double total_IO_Ready_Wait;
double avg_IO_Ready_Wait;
double total_IO_Serve;
double avg_IO_Serve;
double total_IO_TurnAround;
double avg_IO_TurnAround;
double total_IO_Interrupts;
double avg_IO_Interrupts;

//All CPU bound process Stats
double Total_CPU;
double CPU_Completed;
double total_CPU_Cpu_Time;
double avg_CPU_Cpu_Time;
double total_CPU_Ready_Wait;
double avg_CPU_Ready_Wait;
double total_CPU_Serve;
double avg_CPU_Serve;
double total_CPU_TurnAround;
double avg_CPU_TurnAround;
double total_CPU_Interrupts;
double avg_CPU_Interrupts;

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

public double getAvg_IO_Serve() {
	return avg_IO_Serve;
}

public void setAvg_IO_Serve(double avg_IO_Serve) {
	this.avg_IO_Serve = avg_IO_Serve;
}

/**
 * @param totalCreadtedProcesses the totalCreadtedProcesses to set
 */
public void updateTotalCreadtedProcesses(double totalCreadtedProcesses) {
	TotalCreadtedProcesses = TotalCreadtedProcesses + totalCreadtedProcesses;
}

/**
 * @param cPUutilization the cPUutilization to set
 */
public void updateCPUutilization(double cPUutilization) {
	CPUutilization = CPUutilization + cPUutilization;
}

/**
 * @param switvhTime the switvhTime to set
 */
public void updateSwitvhTime(double switvhTime) {
	this.switvhTime = this.switvhTime + switvhTime;
}

/**
 * @param total_I_O the total_I_O to set
 */
public void updateTotal_I_O(double total_I_O) {
	Total_I_O = Total_I_O+ total_I_O;
}

/**
 * @param iO_Completed the iO_Completed to set
 */
public void updateIO_Completed(double iO_Completed) {
	IO_Completed = IO_Completed + iO_Completed;
}

/**
 * @param avg_IO_Cpu_Time the avg_IO_Cpu_Time to set
 */
public void updateAvg_IO_Cpu_Time(double new_IO_Cpu_Time) {
	this.total_IO_Cpu_Time = total_IO_Cpu_Time + new_IO_Cpu_Time;
	this.avg_IO_Cpu_Time = this.total_IO_Cpu_Time/IO_Completed;
}

/**
 * @param avg_IO_Ready_Wait the avg_IO_Ready_Wait to set
 */
public void updateAvg_IO_Ready_Wait(double new_IO_Ready_Wait) {
	this.total_IO_Ready_Wait = this.total_IO_Ready_Wait + new_IO_Ready_Wait;
}

/**
 * @param avg_IO_Serve the avg_IO_Serve to set
 */
public void updateAvg_IO_Serve(double new_IO_Serve) {
	this.total_IO_Serve = this.total_IO_Serve + new_IO_Serve;
}

/**
 * @param avg_IO_TurnAround the avg_IO_TurnAround to set
 */
public void updateAvg_IO_TurnAround(double new_IO_TurnAround) {
	this.total_IO_TurnAround = this.total_CPU_TurnAround + new_IO_TurnAround;
}

/**
 * @param avg_IO_Interrupts the avg_IO_Interrupts to set
 */
public void updateAvg_IO_Interrupts(double new_IO_Interrupts) {
	this.total_IO_Interrupts = this.total_IO_Interrupts + new_IO_Interrupts;
	this.avg_IO_Interrupts = this.total_IO_Interrupts/IO_Completed;
}

/**
 * @param total_CPU the total_CPU to set
 */
public void updateTotal_CPU(double total_CPU) {
	Total_CPU = Total_CPU+ total_CPU;
}

/**
 * @param cPU_Completed the cPU_Completed to set
 */
public void updateCPU_Completed(double cPU_Completed) {
	CPU_Completed = CPU_Completed + cPU_Completed;
}

/**
 * @param avg_CPU_Cpu_Time the avg_CPU_Cpu_Time to set
 */
public void updateAvg_CPU_Cpu_Time(double new_CPU_Cpu_Time) {
	this.total_CPU_Cpu_Time = this.total_CPU_Cpu_Time + new_CPU_Cpu_Time;
}

/**
 * @param avg_CPU_Ready_Wait the avg_CPU_Ready_Wait to set
 */
public void updateAvg_CPU_Ready_Wait(double new_CPU_Ready_Wait) {
	this.total_CPU_Ready_Wait = this.total_CPU_Ready_Wait + new_CPU_Ready_Wait;
}

/**
 * @param avg_CPU_Serve the avg_CPU_Serve to set
 */
public void updateAvg_CPU_Serve(double new_CPU_Serve) {
	this.total_CPU_Serve = this.total_CPU_Serve + new_CPU_Serve;
}

/**
 * @param avg_CPU_TurnAround the avg_CPU_TurnAround to set
 */
public void setAvg_CPU_TurnAround(double new_CPU_TurnAround) {
	this.total_CPU_TurnAround = this.total_CPU_TurnAround + new_CPU_TurnAround;
	this.avg_CPU_TurnAround = this.total_CPU_TurnAround/CPU_Completed;
}

/**
 * @param avg_CPU_Interrupts the avg_CPU_Interrupts to set
 */
public void updateAvg_CPU_Interrupts(double new_CPU_Interrupts) {
	this.total_CPU_Interrupts = this.total_CPU_Interrupts + new_CPU_Interrupts; 
	this.avg_CPU_Interrupts = this.total_CPU_Interrupts/CPU_Completed;
}

public void printStats(){
	//Prints Overall Stats
	System.out.println("");
	System.out.println("OVERALL");
	System.out.println("Simulation time:	 	 " + Utili.getSimulationDuration() + " seconds");
	System.out.println("Created:	 		 " + Driver.pid + " processes.");
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
	System.out.println("Average CPU time: 			" + total_IO_Cpu_Time/IO_Completed + " seconds");
	System.out.println("Average ready waiting time: 		" + total_IO_Ready_Wait/IO_Completed + " seconds");
	System.out.println("Average I/O service time: 		" + total_IO_Serve/IO_Completed + " seconds");
	System.out.println("Average turnaround time: 		" + ((total_IO_Ready_Wait/IO_Completed)+(total_IO_Cpu_Time/IO_Completed)+(IO_Completed*Utili.contextSwitch)) + " seconds");
	System.out.println("Average I/O interrupts/proc.: 		" + total_IO_Interrupts/IO_Completed );

	//Prints out CPU bound stats
	System.out.println("");
	System.out.println("CPU Bound Stats");
	System.out.println("Number of CPU-BOUND proc. completed: 	" + CPU_Completed + " processes");
	System.out.println("Average CPU time:		 	" + total_CPU_Cpu_Time/CPU_Completed + " seconds");
	System.out.println("Average ready waiting time: 		" + total_CPU_Ready_Wait/CPU_Completed + " seconds");
	System.out.println("Average CPU service time: 		" + total_CPU_Serve/CPU_Completed + " seconds");
	System.out.println("Average turnaround time: 		" + ((avg_CPU_Ready_Wait/CPU_Completed)+(total_CPU_Cpu_Time/CPU_Completed)+(CPU_Completed*Utili.contextSwitch)));
	System.out.println("Average I/O interrupts/proc.: 		" + total_CPU_Interrupts);
}
}
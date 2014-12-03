/**
 * Keeps track of all the process statistics 
 * @author goodwinj14
 *
 */
public class SimulationStats {
//All Overall Stats
float TotalCreadtedProcesses;
float CPUutilization;
float switvhTime;

//All IO bound Stats
float Total_I_O;
float IO_Completed;
float avg_IO_Cpu_Time;
float avg_IO_Ready_Wait;
float avg_IO_Serve;
float avg_IO_TurnAround;
float avg_IO_Interrupts;

//All CPU bound process Stats
float Total_CPU;
float CPU_Completed;
float avg_CPU_Cpu_Time;
float avg_CPU_Ready_Wait;
float avg_CPU_Serve;
float avg_CPU_TurnAround;
float avg_CPU_Interrupts;

public SimulationStats() {
	TotalCreadtedProcesses = 0;
	CPUutilization = 0;
	
	Total_I_O = 0;
	avg_IO_Cpu_Time = 0;
	avg_IO_Ready_Wait = 0;
	avg_IO_Serve = 0;
	avg_IO_TurnAround = 0;
	avg_IO_Interrupts = 0;
	
	Total_CPU = 0;
	avg_CPU_Cpu_Time = 0;
	avg_CPU_Ready_Wait = 0;
	avg_CPU_Serve = 0;
	avg_CPU_TurnAround = 0;
	avg_CPU_Interrupts = 0;
}

public void printStats(){
	System.out.println("OVERALL");
	System.out.println("Simulation time: " + Utili.getSimulationDuration());
	System.out.println("Created: " + TotalCreadtedProcesses);
	System.out.println("Average CPU time:" +((avg_CPU_Cpu_Time+avg_IO_Cpu_Time)/2));
	System.out.println("CPU utilization: ");
	System.out.println("OVERALL");
}
}

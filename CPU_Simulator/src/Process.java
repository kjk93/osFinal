import java.awt.Event;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;


public class Process {
	
	float timeStamp;												//The time at which the process was created (microseconds)
	float nextProcessCreateTime;									//The time at which the next process will be created (microseconds)
	float CPU_Time;												//The total amount of CPU time required by the process (microseconds)
	boolean processType;										//Process type (IO bound or CPU bound)
	float firstBurstTime;											//The length of the process first cpu burst 
	Events processEvent;
	int pid;
	/**
	 * Process type is based on the boolean "processType"
	 * if "process type" has a value of true then it is 
	 * an IO bound process, otherwise it is CPU bound
	 * @param f
	 */
	
	public Process(float f, int processid) {
		timeStamp = f;
		pid = processid;
		nextProcessCreateTime = Utili.nextCreationTime();
		CPU_Time = Utili.totalCPU_Time();
		processType = Utili.processType();
		firstBurstTime = Utili.firstBurstLength(processType);
		processEvent = createEvent();
	}
	
	public Events getProcessEvent(){
		return processEvent;
	}
	//Creates the event object for this process based on the process type
	public Events createEvent(){
			Events event = new Events(timeStamp, pid, CPU_Time, nextProcessCreateTime, processType, firstBurstTime, null, CPU_Time, null, null, "NEW_PROCESS");
		return event;
	}
		
	//Prints out the process values
	public void printValues(){
		System.out.println("timeStamp: " + timeStamp);
		System.out.println("nextProcessCreateTime: " + nextProcessCreateTime);
		System.out.println("CPU_Time: " + CPU_Time);
		System.out.println("processType: " + processType);
		System.out.println("firstBurstTime: " + firstBurstTime);
	}
}

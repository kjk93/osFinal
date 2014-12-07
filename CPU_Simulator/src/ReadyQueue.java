import sun.misc.Queue;


public class ReadyQueue extends Queue<Process>{

	public void add(Process process) {
		this.enqueue(process);
	}
}

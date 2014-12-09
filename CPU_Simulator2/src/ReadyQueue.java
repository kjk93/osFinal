import sun.misc.Queue;


public class ReadyQueue extends Queue<Process>{

	public Process remove(){
		try {
			return this.dequeue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

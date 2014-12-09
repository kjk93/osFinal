import sun.misc.Queue;

public class EventQueue extends  Queue<Events>{

	public Events remove(){
		try {
			return this.dequeue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}

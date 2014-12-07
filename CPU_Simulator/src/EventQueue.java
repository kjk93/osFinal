import sun.misc.Queue;

/**
 * The Queue to hold all created events.
 * The Events will be sorted by creation time
 * by consequence making this a FIFO queue 
 * "A specific event will have a higher time stamp 
 * than an event that was added to the queue prior to it and vice versa"
 * @author goodwinj14
 *
 */
public class EventQueue extends Queue<Events>{
	
	public void add(Events event){
		this.enqueue(event);
	}
}

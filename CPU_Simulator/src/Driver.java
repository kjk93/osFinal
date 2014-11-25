import java.lang.reflect.Executable;


public class Driver {

	interface ExecutableOne{
		public void execute();
	}
	static class Runner{
		public void run(ExecutableOne e){
			e.execute();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
		/*Lambda expressions allow for simpler syntax when trying to pass 
		* in a block of code to a method. A interface is still required in 
		* order to achieve this though. 
		*/
		
		//--Java 8 using Lambda expressions--//
		runner.run(() -> System.out.println("Hello Lambda World"));
		//----------------------------------//
		
		
		
		//-----------Old java-----------// 
		runner.run(new ExecutableOne() {
			
			@Override
			public void execute() {
				System.out.println("Hello not lambda World");	
			}
		});
		//-------------------------------//
	}

}

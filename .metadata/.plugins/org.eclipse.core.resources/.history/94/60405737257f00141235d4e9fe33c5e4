import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Executable;
import java.util.Scanner;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;


public class Driver {
	static Controler controler;
	public static void main(String[] args) {
		//DEFUALT FILE PATH = "UserParamFolder\\UserParams"
		Scanner scan = new Scanner(System.in);
		System.out.println("Input File Name/Path: ");
		if(Utili.init(scan.nextLine())){
		//Starts the process
			controler = new Controler();
			try {
				controler.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Clock mainClock = new Clock();
			mainClock.terminateSimulation();
		//------------------
		}
		
	}
}

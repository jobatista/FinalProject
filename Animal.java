import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;
public class Animal{ //implements ActionListener {
  
	/*Timer tm = new Timer(5, this);
	int x = 0;
	
	public void actionPerformed(ActionEvent e){
				
		x = x + 1;
		tm.start();
		
	}*/

	
	public static void main( String[] args ){
		Human human1 = new Human("J", "monkey", 5, 125, 5, 3, 1, 1);
		
		//Monkey monkey1 = new Monkey("J", "monkey", 5, 125, 5, 3, 1, 1);
		//Robot robot1 = new Robot("z", "robot", 5, 125, 5, 3, 1, 1);
		
		human1.talk();
		human1.print();
		human1.walk();
		human1.printSpeed();
		//monkey1.print();
		//robot1.print();
	}
}

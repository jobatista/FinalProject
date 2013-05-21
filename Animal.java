import javax.swing.JOptionPane;

public class Animal{

	
	public static void main( String[] args ){
		Human human = new Human("Jack", "Male", 16/*Age*/, 125/*Weight*/, 
				2/*BLR*/);
		
		Monkey monkey = new Monkey("Nala", "Female", 5, 90, 1);
		
		Robot robot = new Robot("R2D2", "Android", 5, 235, 6);
		
		
		human.setAccelaration();
		human.getAccelaration();
		human.talk();
		monkey.talk();
		robot.talk();
		
		
		int n = 1 + (int) ( Math.random() * 4);
		int lift = 1 + (int) ( Math.random() * 10);
		int count = 1;
		
		do{
			if(count == 1)
			{
			//////////////HUMAN//////////////HUMAN///////
				if ( n == 1)
				{
					System.out.println("H. Walked");
					human.walk();
					human.printSpeed();
					
				}
				else if(n == 2 )
				{
					System.out.println("H. Run");
					human.run();
					human.printSpeed();
				}
				else if (n == 3)
				{
					System.out.println("H. You crashed");
					human.collide();
					human.printSpeed();
				}
				
				else if (n == 4)
				{
					System.out.println("H.turn");
					human.turn();
					human.printSpeed();
				}
				if (lift == 7)
				{
					System.out.println("Lifted object");
				}
				n = 1 + (int) ( Math.random() * 4);
				lift = 1 + (int) ( Math.random() * 4);
			}
			//////////////MONKEY///////////////////MONKEY
			else if (count == 2)
			{
				if ( n == 1)
				{
					System.out.println("M. Walked");
					monkey.walk();
					monkey.printSpeed();
					
				}
				else if(n == 2 )
				{
					System.out.println("M. Run");
					monkey.run();
					monkey.printSpeed();
				}
				else if (n == 3)
				{
					System.out.println("M. You crashed");
					monkey.collide();
					monkey.printSpeed();
				}
				else if (n == 4)
				{
					System.out.println("M. turn");
					monkey.turn();
					monkey.printSpeed();
				}
				if (lift == 7)
				{
					System.out.println("Lifted object");
					monkey.printSpeed();
				}
				n = 1 + (int) ( Math.random() * 4);
				lift = 1 + (int) ( Math.random() * 4);
			}
			////////////////ROBOT????????????????ROBOT/////////////////////
			else if (count == 3)
			{
				if ( n == 1)
				{
					System.out.println("R. Walked");
					robot.walk();
					robot.printSpeed();
				}
				else if(n == 2 )
				{
					System.out.println("R. Run");
					robot.run();
					robot.printSpeed();
				}
				else if(n == 3)
				{
					System.out.println("R. You crashed");
					robot.collide();
					robot.printSpeed();
				}
				else if (n == 4)
				{
					System.out.println("R. turn");
					robot.turn();
					robot.printSpeed();
				}
				if (lift == 7)
				{
					System.out.println("Lifted object");
				}
				n = 1 + (int) ( Math.random() * 4);
				lift = 1 + (int) ( Math.random() * 4);
			}
			
			count++;
			
			if (count > 3)//reset counter
			{
				count = 1;
			}
			
		}while( human.distance() < 100 || monkey.distance() < 100 
				|| robot.distance() < 100);
	
		human.talk1();
		monkey.talk1();
		robot.talk1();
		
	}
}

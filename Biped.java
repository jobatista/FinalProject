
public class Biped {
  
	protected String name;
	protected String gender;
	protected int age;
	protected float weight;
	protected int speed;
	protected int accelaration;
	protected float runningDistance;
	protected float bodyLiftRatio;
	
	public Biped(String newName, String newGender, int newAge, float newWeight,
				int startSpeed, int startAccelaration, float startRunningDistance, float newBodyLiftRatio){
		name = newName;
		gender = newGender;
		age = newAge;
		weight = newWeight;
		speed = startSpeed;
		accelaration = startAccelaration;
		runningDistance = startRunningDistance;
		bodyLiftRatio = newBodyLiftRatio;
		
	}
	
	public void walk(){
		/*int n; //math.random()*1;
		
		if(n=1)
		{
			if (m=1)
			{
				
			}
			else{
				
			}
		}
		else*/
		/////////Most likely belongs in main();///////////////
		 
		// wf = wf + a(accelaration)
		// v = d(distance/t(time)
		speed = speed + accelaration;
		
	}
	
	public void turn(){
		//wlr = wlr + a
		//v = d/t
		////////////Look at Walk!!!!!!!!!!!!!////////////
		speed = speed + accelaration;
	}
	
	public void run(){
		
		//w = w + a*2		
		speed = speed + accelaration;
	}
	
	public void collide(int decrement){
		//w = w - decrease
		speed = speed - decrement;
	}
	
	public void lift(int liftedObjectWeight){
		bodyLiftRatio = liftedObjectWeight / weight;
	}
	
	public float distance(){
		runningDistance = speed + 2;
		return runningDistance;
	}
	/*public void print(){
		System.out.println("this is " + name + "i am a " + gender + "years old" + age 
				+ "i weigh" + weight + " i run fast" + speed + "mph" + "accelarating" + accelaration 
				+ "i run a distance of" + runningDistance + "my body lift ratio is " + bodyLiftRatio);
	}*/


}

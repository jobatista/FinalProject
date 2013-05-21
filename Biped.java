
public class Biped {
	
	protected String name;
	protected String gender;
	protected int age;
	protected float weight;
	protected int speed;
	protected int accelaration;
	protected int runningDistance;
	protected float bodyLiftRatio;
	
	private int decrement;
	
	public Biped(String newName, String newGender, int newAge, float newWeight,
				float newBodyLiftRatio){
		name = newName;
		gender = newGender;
		age = newAge;
		weight = newWeight;
		bodyLiftRatio = newBodyLiftRatio;
		
	}
	
	public void setAccelaration()
	{
		accelaration = 1 + (int) ( Math.random() * 10);
	}
	
	public int getAccelaration()
	{
		return accelaration;
	}
	
	void walk(){
		
		runningDistance = runningDistance + accelaration;
		//speed = runningDistance / time;
		
	}
	
	public void turn(){
		
		
		runningDistance = runningDistance + accelaration + 10;
		//speed = runningDistance/time;
	}
	
	public void run(){
		
		runningDistance = runningDistance + accelaration;
		//speed = runningDistance/time;
	}
	
	public void collide(){
		decrement = 1 + (int) ( Math.random() * 3);

		accelaration = -decrement;
		
		runningDistance = runningDistance + accelaration;
		
		//speed = runningDistance/time;
	}
	
	public void printSpeed(){
		System.out.println("accelaration " + accelaration + " speed " + speed 
				+" running distance " + runningDistance);
	}
	
	public void lift(int liftedObjectWeight){
		bodyLiftRatio = liftedObjectWeight / weight;
	}
	
	public float distance(){
		return runningDistance;
	}
	public void talk(){//change to talk
		System.out.println("This is " + name + " i am a " + age + " year old " + gender +"\n" 
				+ " I weigh " + weight +"lbs. my body lift ratio is " + bodyLiftRatio);
	}

}

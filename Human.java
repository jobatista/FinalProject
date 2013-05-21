
public class Human extends Biped{

  public Human(String newName, String newGender, int newAge, float newWeight,
			int startSpeed, int startAccelaration,
			float startRunningDistance, float newBodyLiftRatio) {
		super(newName, newGender, newAge, newWeight, startSpeed, startAccelaration,
				startRunningDistance, newBodyLiftRatio);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * public Human(String newName, String newGender, int newAge, float newWeight,
			int startSpeed, int startAccelaration,
			float startRunningDistance, float newBodyLiftRatio) {
		super(newName, newGender, newAge, newWeight, /*startSpeed, startAccelaration,
				startRunningDistance, newBodyLiftRatio);
		// TODO Auto-generated constructor stub
	}*/

	public void setName(String newName){
		
		name = newName;
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public void talk(){	
		
		System.out.printf( " What would you like to name me?\n%s!\n", getName());
			
	}
	
public void setRunningDistance(float newRunningDistance){
		
		runningDistance = speed + 2;
	}
	
	public void print(){
		System.out.println("this is " + name + " i am a " + gender + " years old " + age 
				+ " i weigh " + weight + " i run fast " + speed + "mph " + "accelarating " + accelaration 
				+ " i run a distance of " + runningDistance + " my body lift ratio is " + bodyLiftRatio + "\n");
	}
	
	public void printSpeed(){
		System.out.println("I walked " + runningDistance + " ft at a speed of " + speed + " ft per min. \n"  );
	}
	
	/*private String name;
	private String gender;
	private int age;
	private float weight;
	private float speed;
	private int accelaration;
	private float runningDistance;
	private float bodyLiftRatio;*/
	
}

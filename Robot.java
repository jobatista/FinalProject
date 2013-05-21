
public class Robot extends Biped {

  public Robot(String newName, String newGender, int newAge, float newWeight,
			int startSpeed, int startAccelaration,
			float startRunningDistance, float newBodyLiftRatio) {
		super(newName, newGender, newAge, newWeight, startSpeed, startAccelaration,
				startRunningDistance, newBodyLiftRatio);
		// TODO Auto-generated constructor stub
	}
	
	public void print(){
		System.out.println("this is " + name + " i am a " + gender + " years old " + age 
				+ " i weigh " + weight + " i run fast " + speed + "mph " + "accelarating " + accelaration 
				+ " i run a distance of " + runningDistance + " my body lift ratio is " + bodyLiftRatio);
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


public class Robot extends Biped {

	public Robot(String newName, String newGender, int newAge, float newWeight,
			 float newBodyLiftRatio) {
		super(newName, newGender, newAge, newWeight, newBodyLiftRatio);
	}
	
	public void talk1(){	
		System.out.println("Human " + runningDistance + " " + accelaration);
		System.out.println("I walked " + runningDistance + " ft at a speed of "
		+ speed + " ft per min. \n");	
	}
		
}

package cube;

import java.util.Random;

public class Cube {
	
	private static Random rand=new Random();
	private int Eyes;
	
	public Cube() {
		roll();
	}
	
	public int getEyes() {
		return Eyes;
	}
	
	public void roll() {
		Eyes=rand.nextInt(6)+1;
	}
	
	public String toString() {
		return ""+Eyes;
	}

}

package cupprogram;
import java.util.*;

public class cube {
	
	private static Random rand=new Random();
	private int Eyes;
	
	
	public cube() {
		roll();
	}
	
	public int getEyes() {
		return Eyes;
	}
	
	public void roll() {
		Eyes=rand.nextInt(6)+1;
	}
	
    public String toString() {
		
		return " "+Eyes;
		
	}

}

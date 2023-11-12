package cube;

public class Main {

	public static void main(String[] args) {
		Cube c1=new Cube();
		Cube c2=new Cube();
		
		do {
			c1.roll();
			c2.roll();
			System.out.println(c1 + " " + c2);
		}
		
		while(c1.getEyes()!=c2.getEyes());

	}

}

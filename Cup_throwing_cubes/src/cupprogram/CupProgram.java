package cupprogram;

public class CupProgram {

	public static void main(String[] args) {
		
		Cup cup=new Cup(5);
		do {
		cup.toss();
		System.out.println(cup);
	}
		while(!cup.check());
		
	}

	}

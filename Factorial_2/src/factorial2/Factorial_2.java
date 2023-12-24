package factorial2;
import java.util.*;
public class Factorial_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		try {
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println(factorial(n));
			System.exit(0);
		}
		else {
			System.out.println("Enter a positive number");
		}
	
		}
		catch(Exception e){
			System.out.println("Enter again");
			sc.nextInt();
			sc.close();
		}
	}

}
	private static long factorial(int n) {
		long t=1;
		for(;n>1;--n) 	t*=n;
	
		return t;
	}
	
}

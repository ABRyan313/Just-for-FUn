package ControlStatement;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers\n");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		
		if(a>b) {
			c=a;
			a=b;
			b=c;
		}
		
		System.out.println(a+" "+b);

	}

}

package ControlStatement;
import java.util.*;

public class ControlStatement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		
		if(a>b)
			System.out.println(b+" "+a);
		else{
		System.out.println(a+" "+b);
		}
		
		System.out.println("Sum is"+" "+c);
		

	}

}

package Quadratic;
import java.util.*;

public class FindingRoot {

	public static void main(String[] args) {
		
		try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a");
		double a=sc.nextDouble();
		System.out.println("Enter b");
		double b=sc.nextDouble();
		System.out.println("Enter c");
		double c=sc.nextDouble();
		sc.close();
		
		
		 
		double d=((b*b)-4*a*c);
		
		
		if(d<0) {
			double x=(-b/(2*a));
			System.out.println("root is:"+x);;
		}
		
		if(d>0) {
			double x1=((-b-Math.sqrt(d))/(2*a));
			double x2=((-b+Math.sqrt(d))/(2*a));
			
			System.out.println(x1);
			System.out.println(x2);
			
		}
		
		
		}
		
	catch(Exception e) {
		
		System.out.println("Number format exception");
	}

	}

}

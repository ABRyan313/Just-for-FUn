package problem6;
import java.util.*;
public class Problem6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double n;
		long sum=0;
		int count=0;
		double max=0;
		double min=0;
		
		try {
		do {
			 //n=Integer.parseInt(args[]);
			n=sc.nextInt();
			sum+=n;
			count++;
			
			if(n>max) {
				max=n;
			}
			if(n<min) {
				min=n;
			}
		}
		while(n!=0);
			count--;
			sc.close();
		
			
		double average=sum/count;
		
		System.out.println("you have entered"+" "+count+" "+"numbers");
		System.out.println("Sum of entered number is:"+sum);
		System.out.println("Average of entered number is:"+average);
		System.out.println("largest number entered is:"+max);
		System.out.println("Smallest number entered is:"+min);
		}
		
		catch(Exception ex) {
			System.out.println("Invalid number");
		}

	}

}

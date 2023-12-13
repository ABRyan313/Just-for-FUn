package problem7;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	int sum=0;
    	
    	int max=Integer.MIN_VALUE;
    	int min=Integer.MAX_VALUE;
    	int count=0;
    	
    	while(true) {
    		try {
    		System.out.println("Enter your number:");
    		int n=sc.nextInt();
    		if(n==0) {
    			break;
    		}
    		sum+=n;
    		count++;
    		
    		max=Math.max(max,n);
    		min=Math.min(min, n);
    		
    		    }
    		
    		catch(Exception e) {
    			System.out.println("Invalid number: Enter again");
    			sc.next();
    			
    		}	
    	}
    	
    	sc.close();
    	
    	double average=(double)sum/count;
    	System.out.println("Total numbers entered:"+count);
    	System.out.println("Sum of the numbers:"+sum);
    	System.out.println("Average of the numbers:"+average);
    	System.out.println("Maximum number:"+max);
    	System.out.println("Minimum number:"+min);
    	
    }
}
    		
    	
    	
    	
 

package arraydemo;
import java.util.*;

public class Single_D_array {
	public static Random rand=new Random();
	
	public static void test1(double[]arr1) {
		
		for (int i=0;i<arr1.length;i++)
			arr1[i]=rand.nextDouble(10);
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
	}
	
	public static void test2() {
		
		char[] arr2= {'A', 'B', 'C','D','E'};
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]); 
	}
	
	public static void test3(boolean[]arr3) {
		for(int i=0;i<arr3.length;i++)
			arr3[i]=rand.nextBoolean();
		for(int i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
			
	}

	public static void main(String[] args) {
		double [] arr1=new double[10];
		test1(arr1);
		test2();
		
		boolean[]arr3=new boolean[10];
		test3(arr3);

	}

}

package multiDimensionArray;
import java.util.*;

public class Main {
	
	
	
	public static Random rand=new Random();
	
	
	 static void test1(int[][] arr1) {
		
		
		for(int i=0;i<arr1.length;++i)
			for(int j=0;j<arr1[i].length;++j)
				arr1[i][j]=rand.nextInt(10);
	}
	
	 static void print1(int[][] arr1) {
		for(int[] row:arr1)
			System.out.println(Arrays.toString(row));
	}
	 
	 
	 static void test2(int [][]arr2) {
		 
		 for(int i=0;i<arr2.length;++i) 
			arr2[i]=new int[rand.nextInt(10)+1];
		 
	 }
	 
	 static void print2(int[][] arr2) {
		 for(int[] row:arr2)
				System.out.println(Arrays.toString(row));
	 }
	 
	 static void test3(int[][] arr3) {
		 
		 for(int i=0;i<arr3.length;++i)
			 for(int j=0;j<arr3[i].length;++j)
				 arr3[i][j]=rand.nextInt(10);
		 
	 }
	 
	 static void print3(int[][]arr3) {
		 for(int[]row:arr3)
			 System.out.println(Arrays.toString(row));
	 }
	 

	public static void main(String[] args) {
		int[][]arr1=new int[10][5];
		test1(arr1);
		print1(arr1);
		
		//int[][]arr2=new int[4][5];
		//test2(arr2);
		//print2(arr2);
		int[][]arr2=new int[5][];
		test2(arr2);
		print2(arr2);
		
		int [][]arr3=new int[5][];
		arr3[0]=new int[3];
		arr3[1]=new int[5];
		arr3[2]=new int[1];
		arr3[3]=new int[7];
		arr3[4]=new int[5];
		test3(arr3);
		print3(arr3);

	}

}

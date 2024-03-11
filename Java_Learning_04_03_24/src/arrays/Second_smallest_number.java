package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Second_smallest_number {

	public static void main(String[] args) {
		// Second smallest number in an array 
		
		// method 1  Using function 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of the array :");
		int l=sc.nextInt();
		int a[]=new int[l];
		
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();	
			//System.out.println(a[i]);
		}
		
	Arrays.sort(a);
	
	System.out.println("second smallest number is "+a[1]);
		
		

	}

}

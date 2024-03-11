package arrays;
import java.util.Scanner;
public class array_average {

	public static void main(String[] args) {
		// Write a program to calculate the average value of array elements
		
		int a[]=new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements :");
		int sum= 0;
		
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0; i < a.length ; i++)
		
			sum=sum+a[i];
			 double avg =sum/a.length;
			
			 System.out.println(avg);
		
	}
	
}

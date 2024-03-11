package FAQ;

import java.util.Scanner;

public class missing_number {

	public static void main(String[] args) {
		// Missing number in an array 
		
		
		int a[]= {1,2,4,5};
		int sum=0;
		int sum1=0;
		
		for (int i = 0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(" The sum of element is "+sum);
		for(int i=1;i<=5;i++)
		{
			sum1=sum1+i;
		}
	
		
		
		System.out.println(" The sum is "+sum1);
		
		System.out.println(" The missing element is " +(sum1-sum));
		
		
		
		
		
	}

}

package arrays;

import java.util.Scanner;

public class max_min_array {

	public static void main(String[] args) {
		//Write a program to find the maximum and minimum element in an array
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the limit");
		int l= sc.nextInt();
		System.out.println("Enter the array elements :");
		
		
		int a[]=  new int[l];
		
		for (int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		 
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<l;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if (a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("The max number is "+max );
		System.out.println("The minimum number is "+min);
	}

}

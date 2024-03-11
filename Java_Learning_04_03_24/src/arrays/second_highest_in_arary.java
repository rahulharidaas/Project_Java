package arrays;

import java.util.Scanner;

public class second_highest_in_arary 
{

	public static void main(String[] args) 
	{
		// Second highest in an array 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the lenght of the array ");
		int l=sc.nextInt();
		int max =Integer.MIN_VALUE;
		int smax =Integer.MIN_VALUE;
		
		int a[]= new int[l];
		
		for(int i=0;i<l;i++) 
		{
			for (int j = 0 ; j < l; j++) 
			{
			a[j]=sc.nextInt();
		
			if(a[j]>max)
			{
				smax=max;
				max=a[j];
				
				
			}
			else if(a[j]>smax)
			{
			  
			  	smax=a[j];
			}
		    }
			System.out.println("the second Highest number is "+smax);
		}



	}

}

package arrays;

import java.util.Scanner;

public class second_smallest_method2 {

	public static void main(String[] args) {
		// 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the lenght of the array ");
		int l=sc.nextInt();
		int min =Integer.MAX_VALUE;
		int smin =Integer.MAX_VALUE;
		
		int a[]= new int[l];
		
		for(int i=0;i<l;i++) 
		{
			for (int j = 0 ; j < l; j++) {
			a[j]=sc.nextInt();
		
			if(a[j]<min)
			{
				smin=min;
				min=a[j];
				
				
			}
			else if(a[j]<smin)
			{
			  
			  	smin=a[j];
			}
		}
			System.out.println("the second smallest number is "+smin);
		}

	}

}

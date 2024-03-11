package FAQ;

import java.util.Arrays;
import java.util.Scanner;

public class equal_arrays {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the limit");
//		int l=sc.nextInt();
//		int a[]= new int[l];
//		int a1[]= new int[l];
		
		int a[]= {1,3,4,8,9};
		int a1[]= {1,3,4,8,9};
		
		//Approach 1
		
//		boolean status = Arrays.equals(a,a1);
//		if(status==true)
//		{
//			System.out.println(" the arrays are equal");
//		}
//		else 
//		{
//			System.out.println("the arrays are not equal");
//		}
		
		//Approach 2 
		
		boolean status = true;
		
		if(a.length == a1.length) 
		{  
			for(int i=0;i<a.length;i++) 
			{
			if(a[i] != a1[i])
			{
				status= false;
			}
			}
		}
		else 
		{
			status = false;
		}
		
		if(status==true)
		{
			System.out.println(" The arrays are equal ");
		}
		
		else
		{
			 System.out.println(" The arrays are not equal");
		}
	}

}

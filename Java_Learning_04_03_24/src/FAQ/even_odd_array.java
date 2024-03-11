package FAQ;

import java.util.Scanner;

public class even_odd_array {

	public static void main(String[] args) {
		// print even or odd numbers in an array 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array limit");
		int l=sc.nextInt();
		int a[]= new int [l];
		System.out.println("Enter the array elements  ");
		
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int v:a)
		{
			if(v%2==0)
			{
				System.out.print("the even numbers are" +v);
				
				System.out.println();
			}
			
			else
				System.out.print(" The odd numbers are " );
		}
		
	}

}

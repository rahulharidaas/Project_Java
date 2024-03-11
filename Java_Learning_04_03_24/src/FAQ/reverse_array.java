package FAQ;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		// Reverse an array 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit :");
		int l= sc.nextInt();
		int a[]= new int[l];
		
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		
		for(int i:a)
		System.out.println(i);

	}
	{Ī
}

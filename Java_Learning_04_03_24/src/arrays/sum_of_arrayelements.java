package arrays;
import java.util.Scanner;

public class sum_of_arrayelements {

	public static void main(String[] args) 
	{
		// sum of elements in an array 
		
		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		int sum=0;
		System.out.println("enter the elements ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i:a)
		{
			sum +=i;
		}
 System.out.println(sum);
	}

}

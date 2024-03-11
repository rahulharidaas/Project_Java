package Loop_statements;
import java.util.Scanner;

public class print_power {

	public static void main(String[] args) {
		// Write a program to find the value of one number raised to the power of another
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		System.out.println("Enter the base number :");
		int b=sc.nextInt();
		int result = 1;
		
		for (int i=1;i<=b;i++)
		{
			result = result* n;
		}
		
		
		System.out.println(result);

	}

}

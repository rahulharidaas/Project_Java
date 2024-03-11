package FAQ;

import java.util.Scanner;

public class palindorme_number {

	public static void main(String[] args) {
		// Check a number is palindrome or not 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n  = sc.nextInt();
		
		int rev=0;
		int rem;
		int temp=n;
		
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n/=10;	
			
		}
		if(temp==rev)
		{
			System.out.println(" The number is  palindrome");
		}
		
		else 
		
			System.out.println(" The number is not a plindrome ");
		
	}

}

package FAQ;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		//to check the string is palindrome or not
		
		
		String original, reverse ="";
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the string ");
		
		original = sc.nextLine();
		
		
		for(int i=original.length()-1;i>=0;i--)
		
			
			reverse = reverse+original.charAt(i);
			if(original.equals(reverse))
				
			
				System.out.println(" The provided string is a palindrome");
		
				
			
			else 
				
			
				System.out.println("  The string is not a palindrome");
	
			System.out.println(reverse+ " is the reversed string ");
			
		
		

	}

}

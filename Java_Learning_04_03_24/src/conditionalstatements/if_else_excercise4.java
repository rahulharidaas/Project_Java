package conditionalstatements;

import java.util.Scanner;
public class if_else_excercise4 {

	public static void main(String[] args) {
		// Write a program to check whether a number is divisible by 5 and 11 or not
		
		System.out.println("Enter the number");
		
		Scanner s= new Scanner (System.in);
		int number = s.nextInt();
		
		if (number%5==0) {
			
			System.out.println("the number is divisible by 5");
		}
		
		else if ( number%11==0) {
			
			System.out.println("the number is divisible by 11");
		}
		
		else {
			System.out.println("program exited");
		}

	}

}

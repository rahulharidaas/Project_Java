package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise2 {

	public static void main(String[] args) {
		
		//Write a program that reads two integers from the keyboard.

//If both numbers are positive  then you need to display their product, 
		//otherwise print their sum.
		
		System.out.println("enter the numbers");
		Scanner scanner = new Scanner (System.in);
		
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		if( numberA * numberB > 0 )
		{
			System.out.println(numberA * numberB);
			
		}
		
		else {
			
			System.out.println(numberA+numberB);
		}
		
		

	}

}

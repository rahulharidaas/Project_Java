package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise1 {

	public static void main(String[] args) {
		//Write a program that reads two integers from the keyboard. 
		//If the first number is greater, then you need to display their difference, otherwise do nothing
		
		Scanner s= new Scanner(System.in);
		
		int numberA = s.nextInt();
		int numberB = s.nextInt();
		
		if(numberA>numberB)
		{
			System.out.println(numberA-numberB);
			
		}	
		else {
			
			System.out.println("program exited");
		}
	
	}

}

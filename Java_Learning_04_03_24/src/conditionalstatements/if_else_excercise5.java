package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise5 {

	public static void main(String[] args) {
		// to check a number is even or odd 
		
		System.out.println("Enter the number");
		
		Scanner s=new Scanner (System.in);
		int number = s.nextInt();
		
		
		if(number%2==0) 
		{
			System.out.println("the number is even");
			
		}
				
		else 
			System.out.println("the number is odd");
	}

}

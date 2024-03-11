package conditionalstatements;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		
		Scanner s= new Scanner(System.in);
		
		
       int numberA = s.nextInt();
       
       System.out.println("enter the second number");
       Scanner m= new Scanner(System.in);
		int numberB = m.nextInt();
		
		System.out.println(numberA+numberB);
		System.out.println(numberA*numberB);
	}
	
	

}

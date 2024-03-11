package conditionalstatements;
import java.util.Scanner;

public class switch_case_excercise7 {

	public static void main(String[] args) {
		// Write a program to input month number and print month Name
		
		System.out.println("Enter the month number");
		Scanner s=new Scanner(System.in);
		
		int month= s.nextInt();
		
		switch(month)
		{
			case 1 : System.out.println("january"); break;
			case 2 : System.out.println("Febraury"); break;
			case 3 : System.out.println("March"); break;
			case 4 : System.out.println("April"); break;
			case 5 : System.out.println("MAy"); break;
			case 6 : System.out.println("June"); break;
			case 7 : System.out.println("july"); break;
			case 8 : System.out.println("August"); break;
			case 9 : System.out.println("September"); break;
			case 10 : System.out.println("October"); break;
			case 11 : System.out.println("November"); break;
			case 12 : System.out.println("December");break; 
			default: System.out.println("invalid month number");
			
			
		}	
		
		

	}

}

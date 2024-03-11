package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise10 {

	public static void main(String[] args) {
		// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		//Ask user for their salary and year of service and print the net bonus amount.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your salary :");
		System.out.println("What is your years of experience :");
		float salary = sc.nextInt();
		int exp = sc.nextInt(); 
		float bonus;
	
		
		if(exp>5) 
		{
			bonus=salary*0.05f;
			salary = salary+bonus;
			
			System.out.println(salary);
			
		}
		else 
			
		{
			System.out.println("No bonus");
					
		}

	}

}

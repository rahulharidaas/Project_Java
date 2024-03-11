package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise9 {

	public static void main(String[] args) {
		// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("What is the count ?:");
		
		int count = sc.nextInt();
		float total,sum;
		
		if(count > 1000) {
		
			sum= count*100;
			total = sum-sum*0.1f;
			System.out.println("Your discount amount is"  +(100*0.1f)+ "final discounted price is" +total);
		}
		else 
		{
			total= count * 100;
			System.out.println(total);
		}
		
	}

}

package Loop_statements;
import java.util.Scanner;

public class sumofnatural_numbers {

	public static void main(String[] args) {
		// Sum of n natural number 
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the limit :");
		int f=sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=f;i++) 
		{
			sum = sum + i;
			
			
		}
		
		System.out.println(sum);
	}

}

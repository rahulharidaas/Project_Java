package Loop_statements;
import java.util.Scanner;

public class factorial_for_loop {

	public static void main(String[] args) {
		// Factorial of a number 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int f=1;
		
		for (int i=1;i<=n;i++)
		{
			f=f*i;
		}
           System.out.println(f);
	}

}

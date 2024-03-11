package Loop_statements;
import java.util.Scanner;

public class for_loop_statement {

	public static void main(String[] args) {
		// print all natural numbers using for loop
		
		Scanner sc=	new	Scanner(System.in);
		System.out.println("Ente the limit");
		int limit =sc.nextInt();
		int i;
		
		
		/*for (i=1;i<=limit;i++)
		{
			System.out.println(i);
		}*/
		
		// for reversing the numbers 
		
		for (i=10;i>=limit;i--)
		{
			System.out.println(i);
		}

	}

}

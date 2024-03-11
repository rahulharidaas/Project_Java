package Loop_statements;
import java.util.Scanner;

public class muliplcaition_table {

	public static void main(String[] args) {
		// Write a multiplication table 
		
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println("Enter the first number");
		 System.out.println("Enter rhe second number");
		 System.out.println("Enter the number ");
		 int num1= scanner.nextInt();
		 int num2 =scanner.nextInt();
		 int mul=scanner.nextInt();
		 System.out.println("Multiplication table of "+mul);
		 
		 while (num1<=num2)
		 {
			 
			 System.out.println(num1+" * "+mul+" = "+(num1*mul));
			 num1++;
		 }

		
		
		
	}

}

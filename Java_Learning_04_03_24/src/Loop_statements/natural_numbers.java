package Loop_statements;
import java.util.Scanner;
public class natural_numbers {

	public static void main(String[] args) {
		//Write a program to print all natural numbers from 1 to n
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int f1= scanner.nextInt();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the second number");
		int f2=sc.nextInt();
		
		while(f1<=f2) {
			
			System.out.println(f1);
			f1++;
		}
		

	}

}

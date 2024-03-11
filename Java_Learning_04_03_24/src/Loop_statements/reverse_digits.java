package Loop_statements;
import java.util.Scanner;

public class reverse_digits {

	public static void main(String[] args) {
		// Reverse digits 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		 
		 int rev=0;
		 int rem=0;
		 
		 while(n>0){
			 rem=n%10;
			 rev=rev*10+rem;
			 n /=10;
					 
		 }
		 System.out.println(rev);

	}

}

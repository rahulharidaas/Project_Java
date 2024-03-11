package FAQ;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// Check whether a number given is prime or not 
		
		
		 Scanner sc= new Scanner(System.in);
     	 System.out.println("enter the number :");
		 int num = sc.nextInt();
		
		 int count=0;
		 
		 if(num>1)
		 {
			 for(int i =1;i<=num;i++)
			 {
				 if(num%i==0)
				 count++;
			 }
			 if(count==2)
			 {
				 System.out.println("The number is prime ");
			 }
			 else 
			 {
				 System.out.println("The number is not prime");
			 }
		 }

	}

}

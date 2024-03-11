package Loop_statements;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		//Sum of digits
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		 
		 int rev=0;
		 
		 int sum =0;
		 
		 while(n>0){
			 rev=n%10;
			 sum=sum+rev;
			 n /=10;
			  
		 }

System.out.println(sum);

	}

}

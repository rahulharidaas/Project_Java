package arrays;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		// Decimal to binary
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the decimal  number :");
		int num=sc.nextInt();
		int rem;
		int i=0;
		int binary[] = new int [20];
		
//		while (num!=0)
//		{
//		  binary[i]=num%2;
//		  i++;
//		  num/=2;
//		  
//		}
//	 for(i=(i-1); i>=0; i--)
//		 System.out.println( binary[i]);
		
		//Using for loop 
		
		
		for(i=0;num!=0;i++) 
		
		{
			binary[i]=num%2;
			num/=2;
		}
		for(i=(i-1); i>=0; i--)
		 System.out.println( binary[i]);
	}
	

}

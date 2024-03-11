package FAQ;

import java.util.Scanner;

public class examples_1 {

	public static void main(String[] args) {
		// reverse a number 
		
		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the number");
//		int num = sc.nextInt();
//		int rem;
//		int rev=0;
//		
//		while(num>0)
//		{
//			rem= num%10;
//			
//			rev=rev*10+rem;
//			num/=10;
//		}
//		System.out.println(+rev);
//		
		
		// reverse a string 
		
		
	
		
		System.out.println("enter the string ");
		String s = sc.nextLine().toLowerCase();
		String result ="";
		String str=s;
		
		char ch[]=s.toCharArray();// this function will fetch all the string to character array and store in a variable called ch
		
		for(int i=ch.length-1;i>=0;i--) 
		{
			result+=ch[i];
			
		}
		if(str==result)
		{
			System.out.println(" it is a palindrom");
		}
		
		
	}

}

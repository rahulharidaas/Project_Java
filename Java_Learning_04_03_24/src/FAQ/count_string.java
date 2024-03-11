package FAQ;

import java.util.Scanner;

public class count_string {

	public static void main(String[] args) {
		// Count characters in a string 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s= sc.nextLine();
		int count=0;
		
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			count++;
		}
         System.out.println(" the count of this string is "+count);
	}

}

package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise6 {

	public static void main(String[] args) 
	{
		// Write a program to check whether a character is alphabet or not
		
		System.out.println("Enter the character");
		
		Scanner chara = new Scanner (System.in);
		
		char ch= chara.next().charAt(0);
		
		if (ch>='a' && ch<='z' || ch>='A' && ch <='Z') 
		{
			System.out.println("this is an Alphabet");
			
		}
		
		else 
			System.out.println("this is not an alphabet");

	}

}

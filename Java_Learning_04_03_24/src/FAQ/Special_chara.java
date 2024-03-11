package FAQ;

import java.util.Scanner;

public class Special_chara {

	public static void main(String[] args) {
		// Find number of the special characters in a string 
		
		Scanner sc= new Scanner(System.in);
		//String s = "Rahul@!&";
		System.out.println("Enter the string ");
		String s= sc.nextLine();
		int count =0;
		String SpecialCharcatersremoved= "";
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) &&!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) )
					{
				        count++;
					}
			else  {
				SpecialCharcatersremoved=SpecialCharcatersremoved+s.charAt(i);
			}
		}
		if(count==0)
		{
			System.out.println(" There are no special characters ");
		}
		else 
			
		{
			System.out.println(" The number of special characters are "+count);
		}
		System.out.println(SpecialCharcatersremoved);
	}
	

}

package arrays;

public class sample_string_array {

	public static void main(String[] args) {
		// String array 
		
		
		String s[]=new String[3];
		
		s[0]="Welcome";
		s[1]="to";
		s[2]="java";
		
		System.out.println(s.length);// to find the length of the string 

		
		for(String i:s)
		{
			System.out.println(i);
		}
	}

}

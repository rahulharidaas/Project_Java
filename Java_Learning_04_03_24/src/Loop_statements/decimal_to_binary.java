package Loop_statements;
import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		// Decimal to binary using while loop 
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the binary number :");
		int binary = sc.nextInt();
		
		int decimal=0,i=1,remainder;
		
		/*while(binary!=0)
		{
			remainder = binary%10;
			decimal = decimal +(remainder*i);
			i=i*2;
			binary /=10;
			
		}*/
		
		// using for loop 
		
		for(i=1;binary!=0;binary/=10)
		{
			remainder = binary%10;
			decimal = decimal +(remainder*i);
			i=i*2;
		}
				
		System.out.println("The corresponding decimal value is "+decimal);		
		
		

	}

}

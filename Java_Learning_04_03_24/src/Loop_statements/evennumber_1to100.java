package Loop_statements;
import java.util.Scanner;

public class evennumber_1to100 {

	public static void main(String[] args) {
		// Even number 1 to n numbers 
		
		Scanner sc=new Scanner (System.in);		
		System.out.println("Enter the limit ");
		int l=sc.nextInt();
		
		
		
		/*for(int i=1;i<=l;i++) 
		{
			if(i%2==0) {
				System.out.println(i);
			}
			
		}*/
		
           // odd number from 1 to n numbers
		for(int i=1;i<=l;i++) 
		{
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		
	}

}

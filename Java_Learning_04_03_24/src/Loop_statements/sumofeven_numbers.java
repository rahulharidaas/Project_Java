package Loop_statements;
import java.util.Scanner;

public class sumofeven_numbers {

	public static void main(String[] args) {
		//Sum of even numbers 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l= sc.nextInt();
		int sum = 0;
		
		/*for(int i=1;i<=l;i++)
		{
			if(i%2==0) 
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);*/
		
		
		// Sum of odd numbers 
		
		for(int i=1;i<=l;i++)
		{
			if(i%2==1) 
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
		
	}

}

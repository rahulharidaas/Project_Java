package conditionalstatements;
import java.util.Scanner;

public class total_note_while {

	public static void main(String[] args) {
		// Total number of notes using while loop 
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount :");
		
		int amount = sc.nextInt();
		
		while(amount>0)
		{
			if(amount>=2000) 
			{
				System.out.println("Number of 2000 notes" +(amount/2000));
				amount=amount%2000;
			}
			else if(amount>500)
			{
				System.out.println("Number of 500 notes " +(amount/500));
				amount=amount%500;
			}
			else if (amount>=200)
			{
				System.out.println("Number of 200 notes "+(amount/200));
				amount= amount%100;
			}
			else if (amount>=100)
			{
				System.out.println("Number of 100 notes"+(amount/100));
				amount= amount%100;
			}
			else if (amount>=50)
			{
				System.out.println("Number if 50 notes "+(amount/50));
				amount =amount%50;
			}
			else if (amount >=20)
			{
				System.out.println("Number of 20 notes "+(amount/20));
				amount = amount%20;
			}
			else if (amount>=10)
			{
				System.out.println("Number of 10 notes "+(amount/10));
				amount = amount%10;
			}
			else if (amount>=5) 
			{
				System.out.println("Number of 5 notes "+(amount/5));
				amount= amount%5;
				
			}
			
			else if (amount>=2) 
			{
				System.out.println("Number of 2 notes "+(amount/2));
				amount= amount%2;
				
			}
			
			else if (amount>=1) 
			{
				System.out.println("Number of 1 notes "+(amount/1));
				amount= amount%1;
				
			}
		}
		

	}

}

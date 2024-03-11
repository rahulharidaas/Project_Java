package conditionalstatements;

import java.util.Scanner;

public class bankingsystem_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double balance = 1000;
		System.out.println("Welcomer to the bank "+balance);
		
		System.out.println("Please select your transaction (deposit /withdrawal");
		String typeoftransaction = scanner.nextLine().toLowerCase();
		
		if(typeoftransaction.equals("deposit") || typeoftransaction.equals("withdrawal"))
		System.out.println("Enter the amount :");
		double amount = scanner.nextDouble();
		
		if(amount >0)
		{
			if(typeoftransaction.equals("deposit"))
			{
				balance +=amount;
				System.out.println("Transaction is successful , your new balance is "+balance);
			}
			else 
			{
				if(amount<=balance)
				{
					balance-=amount;
					System.out.println("Transaction is successful , your new balance is " +balance);
				}
				else 
				{
					System.out.println("Insufficient fund , Transation failed");
				}
				
				
			}
			
		}else {
			System.out.println("Transaction failed , invalid transaction");
			
			
		}
		
		
			
		scanner.close();
	
	}

	
	
	
}

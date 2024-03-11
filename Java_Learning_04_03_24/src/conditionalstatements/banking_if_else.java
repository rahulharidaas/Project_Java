package conditionalstatements;
import java.util.Scanner;

public class banking_if_else {

	public static void main(String[] args) {
		// banking system
		
		Scanner scanner = new Scanner(System.in);
		double balance = 1000;// initial account balance 
		
		System.out.println("Welcome to A&B bank your balance is " +balance);
		System.out.println("Enter the transaction you want to procees with(deposit/withdraw) :");
		String transactiontype= scanner.nextLine().toLowerCase();
		
		if(transactiontype.equals("deposit")|| transactiontype.equals("withdraw"))
			System.out.println("Enter the amount :");
		    double amount = scanner.nextDouble();
		    
		    if(amount> 0)
		    {
		    	if(transactiontype.equals("deposit"))
		    	{
		    		balance +=amount;
		    		System.out.println("Deposit successful , your new balance is "+balance);
		    	}
		    	
		    	else 
		    	{
		    		if(amount <=balance)
		    		{
		    			balance -=amount;
		    			System.out.println("Transaction successful , your new balance "+balance);
		    		}
		    		else 
		    		{
		    			System.out.println("Insufficient fund, withdrawal failed");
		    		}
		    	}


		    	}
		    else {
	    		System.out.println("Invalid transation, Transaction failed");
		         }
		    
			scanner.close();
	}
	
}

package arrays;

import java.util.Scanner;

public class duplaictes_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the length of the array :");
		//System.out.println("enter the elements :");
		int a[]= {2,4,5,6,3,2,3,8,2};
		
		for(int i=0;i<a.length;i++)
		   {
			for (int j = i+1 ; j < a.length; j++) 
			{
				
				if(a[i]==a[j])
					
				{
					System.out.println("The duplicated elements are" +a[i]);
					break;
					
				}
				
		     }
			
		}
		
	  
	}

}

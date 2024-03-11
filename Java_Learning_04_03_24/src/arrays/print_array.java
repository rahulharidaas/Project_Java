package arrays;
import java.util.Scanner;
					

public class print_array {

	public static void main(String[] args) {
		// Print array elements

		
		Scanner sc= new Scanner(System.in);
		int l= sc.nextInt();
		int a[] = new int[l];
		
		System.out.println("Enter the length of the array :");
		
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();	
			//System.out.println(a[i]);
		}
		
		for(int i=l-1;i>=0;--i)
		{
		
			System.out.println(a[i]);
		
		}
	}

}
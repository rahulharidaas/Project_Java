package arrays;

import java.util.Scanner;

public class two_dimensional_array1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int a[][]= new int[row][col];
		System.out.println("Enter the rows & columns ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
			}
		
		
		}
	}


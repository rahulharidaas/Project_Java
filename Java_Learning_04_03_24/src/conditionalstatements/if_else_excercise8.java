package conditionalstatements;
import java.util.Scanner;

public class if_else_excercise8 {

	public static void main(String[] args) {
		// Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
		//Calculate percentage and grade according to following:

//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks");
		
		int p = sc.nextInt();
		int c = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int co = sc.nextInt();
		int total = p+c+b+m+co;
		float per= total/5;
		
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if (per>=80)
		{
			System.out.println("Grade B");
		}
		else if (per>=70) 
		{
			System.out.println("Grade C");
		}
		else if (per>=60)
		{
			System.out.println("Grade D");
			
		}
		
		else 
			System.out.println("Grade E");
		
		}

}

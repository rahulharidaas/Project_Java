package arrays;

public class sample_array {

	public static void main(String[] args) {
		// sample array program

		int a[]=new int [5];//declaration of array with 5 elements 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		// Read elements from an array 
//		
//		for(int i=0;i<=4;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		//using for each loop or enhanced loop  
		
		
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}

}

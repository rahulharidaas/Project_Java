package arrays;

public class sample_array_1 {

	public static void main(String[] args) {
		// sum of elements in array
		
		int a[]= {100,200,300,400,500};
		int sum=0;
		
		for(int i :a)
		{
			sum=sum+i;
			//System.out.println(i);
		}
        System.out.println(sum);
	}

}

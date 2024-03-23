package oops_java;

public class calculation_method2 

{
	int a;
    int b;
    
    void sum(int x , int y)
    {
      a=x;
      b=y;
      
      System.out.println(a+b);
      
      
    }
     public static void main ( String args[])
     {
        calculation_method2 cal= new calculation_method2();
        cal.sum(100,200);
        
     
     }
	
	
	
	

}

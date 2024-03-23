package oops_java;

public class calculation_method3 

{
	int a;
    int b;
    
    
    int sum()
    
    {
      return(a+b);
    
    }
    
    public static void main(String args[])
    
    {
      calculation_method3 cal = new calculation_method3();
       cal.a=100;
       cal.b=200;
       
       int r=cal.sum();
       System.out.println(r);
      
    }
	
	
	
}

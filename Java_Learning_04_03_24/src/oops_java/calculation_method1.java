package oops_java;

public class calculation_method1 

{
	int a; // Declaring the variables 
    int b;
    
    
    void sum()
    {
      System.out.println(a+b);
    }
    


public static void main(String args[]) 

{
 calculation_method1 cal= new calculation_method1();// Creating objects to access the class 
 
 cal.a=100;
 cal.b=200;
 cal.sum();// calling the method 
 
}
}

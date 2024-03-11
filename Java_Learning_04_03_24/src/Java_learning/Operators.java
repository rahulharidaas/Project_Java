package Java_learning;

public class Operators {

	public static void main(String[] args) 
	{
		// Arithmetic operators 
		  int a= 10;
		  int b = 20;
		  
		  System.out.println(a+b);
		  System.out.println(a-b);
		  System.out.println(a*b);
		  System.out.println(a/b);
		  System.out.println(a%b);
		  
		  // Relational operators 
		  // Relational operators will always return boolean values 
		  
		  System.out.println(a<b);// true 
		  System.out.println(a>b);// false 
		  System.out.println(a<=b);// true 
		  System.out.println(a>=b);// false 
		  System.out.println(a==b);// false 
		  System.out.println(a!=b);//True 
		  
		  
		  // Logical operators AND OR NOT 
		  // This also will return boolean values
		  
		  boolean x = true;
		  boolean y = false;
		  
		  System.out.println(x&&y);
		  System.out.println(x|y);
		  System.out.println(!x);
		  System.out.println(!y);
		  
		  // Assignment Operators
		   int c;
		   c=a;
		   System.out.println(c);
		   c= b;
		   System.out.println(c);
		   
		   // incremental operators 
		    c= 100;
		    c++; 
		    
		    System.out.println(c);
		    
		    //If you want to increase by any number 
		    
		    c+=5;  //c = c+5;
		    
		    System.out.println(c);
		    
		    // Decrement Operators 
		    c= 100;
		    c--;
		    System.out.println(c);
		    

	}

}

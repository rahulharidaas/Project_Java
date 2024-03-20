package oops_java;

public class Employee 

// Assigning values through object 

{
     int empid;
     String name;
     int salary;
     String departmentno;
     
     
     //Define method 
     
     void display() 
     
     {
    	 System.out.println(empid);
    	 System.out.println(name);
    	 System.out.println(salary);
    	 System.out.println(departmentno);
     }
     
     // To access class we need to open an object , only by creating an object user can
     // execute the class 
     // An object will always be in main method.
     
     public static void main(String args[])
    		 {
    	        Employee emp1= new Employee();   
    	        emp1.empid=101;
    	        emp1.name="rahul";
    	        emp1.salary=70000;
    	        emp1.departmentno="IT";
    	        
    	        emp1.display();
    	        
    	        Employee emp2 = new Employee();
    	        emp2.empid=102;
    	        emp2.name="ramu";
    	        emp2.salary=80000;
    	        emp2.departmentno="eng";
    	        
    	        emp2.display();
    		 
    		 }
 
	
}


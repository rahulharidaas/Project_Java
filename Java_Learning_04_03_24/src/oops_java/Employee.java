package oops_java;

public class Employee 

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
     
     // To access class we needy to open an object , only by creating an object user cam 
     // execute the class 
     // An object will always be in main method.
     
     public static void mail(String args[])
    		 {
    	        Employee emp1= new Employee();   
    	        emp1.empid=101;
    	        emp1.name="rahul";
    	        emp1.salary=70000;
    	        emp1.departmentno="IT";
    	        
    	        emp1.display();
    		 
    		 }
 
	
}


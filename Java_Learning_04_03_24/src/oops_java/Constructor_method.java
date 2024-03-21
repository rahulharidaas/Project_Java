package oops_java;

	
		// Constructor method 
		
		// A constructor is  also a method , which will have the same name as  class.
		
		// How to initiate a constructor
		
		
		
		// Step 1 Create a class with variables
		
		public class Constructor_method 
		{
			
			int empid;
			String name;
			int salary;
			String Deptname;
		
		
		/* Step 2- now we have to initiate the method using constructor.
			 Another condition here is while creating a constructor method ., user 
			must make sure the constructor name and class names are same.
			here we have created a constructor with the same name as class.*/
		   
			Constructor_method (int id , String nam,int sal,String dept)
			{
				empid = id;
				name = nam;
				salary = sal;
				Deptname=dept;
			}
			
			void display()
			{
				System.out.println(empid);
				System.out.println(name);
				System.out.println(salary);
				System.out.println(Deptname);
				
			}
			
			public static void main(String args[])
			{
				Constructor_method  emp1= new Constructor_method (113,"rahul",60000,"IT");
				emp1.display();// Here when you assign values to the class variables , you must use the same class name
				Constructor_method  emp2= new Constructor_method (114,"ram",70000,"IT");
				emp2.display();
			
			}
			
			
		
		}
	



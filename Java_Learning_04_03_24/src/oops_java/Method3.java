package oops_java;

public class Method3 {
	
	
	// using method
	int id;
	String name;
	int salary;
    String dept;
    
    
    void setdata(int empid , String  nam, int sal, String deptname)
    {
    	id = empid;
    	name = nam;
    	salary=sal;
    	dept=deptname;
    	
    }
    
    void display()
    {
    	
    	System.out.println("empid");
    	System.out.println("nam");
    	System.out.println("sal");
    	System.out.println("deptname");
    	
    }
    
    public static void main( String args[])
    {
    	Method3 emp1= new Method3();
    	emp1.setdata(101,"ram",70000,"IT");
    	emp1.display();
    }
    
}

/*
	A simple master program to print a message "Welcome to Emploee Wage Computation Program".
	*/
public class Master{
	     
	  public static void main(String[] args) 
	              {
		  System.out.println("Welcome to Employee Wage Computation Program");    // prints the message.
		  int IS_FULLTIME=1;                                     // CONSTANT is defined.
			System.out.println("Employee Attendance check");       
			int a= (int)Math.floor(Math.random()*10)%2;            // computes the value of a.
			if(a==IS_FULLTIME)                                      // checks if the value of a is equal to Employee.
				System.out.println("Employee is present");
			else
				System.out.println("Employee is absent");
	               }

	            }




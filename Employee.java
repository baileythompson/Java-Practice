public class Employee
{
	// Instance variables
	private String first; // first name of employee
	private String last; // last name of employee
	private double salary; // employee's monthly salary
	
	// default constructor sets values to instance variables
   public Employee(){
      first = "";
      last = "";
      salary = 0;
	}
	
	// Constructor initializes instance variables with arguments
	public Employee (String f, String l, double sal)
	{
		first = f;
      last = l;
      salary = sal;				
	}
	
   // set method
	public void setFirst(String f){
		first=f;
	}
	
	public void setLast (String l){
	   last=l;
	}
	
	public void setSalary (double sal){
		salary=sal;
	}
	
	public String getFirst(){
		return first;
	}
   
   public String getLast(){
      return last;
   }
   
   public double getSalary(){
      return salary;
   }
		
	
	public double ytdSalary(int months){
		double yearToDateSal;
		
		yearToDateSal = salary * months;
		
		return yearToDateSal;
	}
} // end Class Employee
	
	
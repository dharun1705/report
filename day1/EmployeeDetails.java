package week2.day1;

public class EmployeeDetails
{
    public void employeeName(String Name,int id)
    {
    	System.out.println(Name);
    	System.out.println(id);
    }
    public void employeeAddress(String Address)
    {
    	System.out.println(Address);
    }
    public void employeeSalary(double Salary)
    {
    	System.out.println(Salary);
    }
    public void employeeNumber(long Number)
    {
    	System.out.println(Number);
    }
	public static void main(String[] args) 
	{
	EmployeeDetails emp=new EmployeeDetails();
    
	emp.employeeName("Muthu",1001);
	emp.employeeAddress("Theni");
	emp.employeeSalary(22000.50);
	emp.employeeNumber(9876543210L);
	



	}

}

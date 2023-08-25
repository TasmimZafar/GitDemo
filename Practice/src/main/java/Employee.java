import java.io.*;
public class Employee {

	
	public static final String DEPARTMENT = "BE";
	public  String EmployeeName;
	public  Integer EmpID;
	public Double Salary;
	
	public Employee(String name)
	{
		 EmployeeName = name;
	}

	public void setSalary(Double sal)
	{
		 Salary = sal;
		
	}

	public void EmpployeeID(Integer ID)
	{
		EmpID = ID;
	}
	public void EmployeeData()
	{
		System.out.println(DEPARTMENT);
		System.out.println("Employee Name is " +EmployeeName);
		System.out.println("Employee ID is " +EmpID);
		System.out.println("Employee Salary is " +Salary);
	}
	
	public static void main(String args[])
	{
		Employee emp = new Employee("Aqsa");
		emp.setSalary(123.12);
		emp.EmpployeeID(123);
		emp.EmployeeData();
		String revVal = "";
		String str1 = "Aqsa is my Daughters name, she is so cute baby";
		int i,iLen = str1.length();
		
		for ( i = iLen-1; i >= 0  ;i--)
		{
			revVal = revVal+str1.charAt(i);
		}
		System.out.println(revVal);
	}

	
	
}

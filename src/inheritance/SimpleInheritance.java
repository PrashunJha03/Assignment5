package inheritance;

class Employee
{
	
	int empId;
	String empName;
	float salary;
	
	static String companyName = "C-DAC";
	
	public Employee(int empId, String empName, float salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	void displayEmployee()
	{
		System.out.println(empId+" " + empName+" " + salary);
	}

}


class Manager extends Employee
{
	
	String department;
	int teamSize;
	public Manager(int empId, String empName, float salary, String department, int teamSize) {
		super(empId, empName, salary);
		this.department = department;
		this.teamSize = teamSize;
	}
	
	void displayManager()
	{
		System.out.println(department+" " + teamSize);
	}
	
	void calculateSalary()
	{
		salary = salary * 12;
		System.out.println(salary);
	}
	
}




public class SimpleInheritance {

		public static void main(String[] args) {
			
			Manager m = new Manager(1001, "Prashun", 50000, "CDAC-AC", 3);
			Manager m1 = new Manager(1002, "Kumar", 60000, "CDAC-AC1", 4);
			Manager m2 = new Manager(1003, "Jha", 70000, "CDAC-AC2", 5);
			m.displayEmployee();
			m.displayManager();
			m.calculateSalary();
			m1.displayEmployee();
			m1.displayManager();
			m1.calculateSalary();
			m2.displayEmployee();
			m2.displayManager();
			m2.calculateSalary();
			
		}
		
}

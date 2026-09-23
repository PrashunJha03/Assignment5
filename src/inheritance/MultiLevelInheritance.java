package inheritance;

class Person
{
	String name;
	int age;
	
	static String organizationName = "Engineer";
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	

}


class Employee1 extends Person
{
	int empId;
	float salary;
	public Employee1(String name, int age, int empId, float salary) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;
	}
}


class Manager1 extends Employee1
{
	String department;
	int teamSize;
	public Manager1(String name, int age, int empId, float salary, String department, int teamSize) {
		super(name, age, empId, salary);
		this.department = department;
		this.teamSize = teamSize;
	}
	
	void displayManager1()
	{
		System.out.println(name + " "+ age + " "+ empId+" "+salary+" "+department +" "+ teamSize);
	}
	
	void calculateSalary()
	{
		salary = salary*12;
		System.out.println(" "+salary);
	}
}



public class MultiLevelInheritance {

	
	public static void main(String[] args) {
		
		Manager1 m1 = new Manager1("Prashun", 24, 1001, 60000, "CDAC-AC1", 3);
		Manager1 m2 = new Manager1("Vishal", 24, 1002, 70000, "CDAC-AC2", 4);
		Manager1 m3 = new Manager1("Anushka", 24, 1003, 80000, "CDAC-AC3", 5);
		
		m1.displayManager1();
		m1.calculateSalary();
		m2.displayManager1();
		m2.calculateSalary();
		m3.displayManager1();
		m3.calculateSalary();
		
		
	}
}

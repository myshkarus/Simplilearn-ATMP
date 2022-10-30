package oops;

public class Employee {

	public String name;
	public int employeeID;
	public String department;
	
	public Employee() {
		System.out.println("Inside Default Constructor");
	}
	
	public Employee(String p1, int p2, String p3) {
		name = p1;
		employeeID = p2;
		department = p3;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(employeeID);
		System.out.println(department);
	}
	
}

package oops;

public class RunnerClass {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Mike";
		e1.employeeID = 1000;
		e1.department = "HR";
		
		System.out.println(e1.name);
		System.out.println(e1.employeeID);
		System.out.println(e1.department);
		
		Employee e2 = new Employee("Jack", 1001, "Finance");
		e2.display();

	}

}

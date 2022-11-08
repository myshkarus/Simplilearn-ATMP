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
		
		Bank b = new Bank();
	
		b.displayBalance();
		int bal = b.getBalance();

		System.out.println("The Balance is " + bal);
	
		BOABank b2 = new BOABank();
		b2.ccBalance();
		b2.displayBalance();
		
		// Overloading example
		OverLoadingExample obj = new OverLoadingExample();
		
		int RectArea = obj.GetArea(3, 4);
		int SqArea = obj.GetArea(4);
		float SqrArea = obj.GetArea(2.5f);
		
		System.out.println("Rectangle area " + RectArea);
		System.out.println("Square area " + SqArea);
		System.out.println("Square area in float " + SqrArea);
	
		// Overriding example
		b.CloseAccount(12345);
		b2.CloseAccount(12345);
		
		Chrome ch = new Chrome();
		ch.OpenBrowser();
		
		Browser br = new Chrome();
		
		br.OpenBrowser();
		br.CloseBrowser();
		br.DisplayName();
		
		// br.Show();
		
		// CarInterface car = new CarInterface();
		HondaCar car1 = new HondaCar();
		
		CarInterface car2 = new HondaCar();
		
		EncapsulationEx en = new EncapsulationEx();
		en.setBalance(3000);
		System.out.println(en.getBalance());
	}

}

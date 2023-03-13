package oops;

public class Bank {
	
	public int accountNum;
	
	public void displayBalance() {
		System.out.println("Inside DisplayBalance");
	}
	
	public int getBalance() {
		return 100;
	}
	
	public void CloseAccount(int AccountNum) {
		System.out.println("Inside Bank CloseAccount");
	}
	
}

package oops;

public class BOABank extends Bank{

	public int creditCardNum;
	
	public void ccBalance() {
		System.out.println("Inside CC balance");
	}
	
	public void CloseAccount(int ccNumber) {
		System.out.println("Inside BOA CloseAccount");
	}
	
}

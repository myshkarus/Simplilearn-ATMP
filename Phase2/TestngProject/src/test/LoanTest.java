
package test;

import org.testng.annotations.Test;


@Test(groups = {"regression"})
public class LoanTest extends BaseClass {
	
	@Test(groups = {"sanity"}, description="This is to validate Home Loan", priority=1)
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan Test");
	}

	@Test(enabled=false)
	public void PersonalLoanTest() {
		System.out.println("Inside Personal Loan Test");
	}
	
	@Test(priority=0)
	public void PersonalLoanTest1() {
		System.out.println("Inside Personal Loan Test 1");
	}
}
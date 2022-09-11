
package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest(alwaysRun=true)  // to be executed before all tests
	public void method3() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod(alwaysRun=true)  // to be executed before each test
	public void method1() {
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod(alwaysRun=true)  // to be executed after each test
	public void method2() {
		System.out.println("Inside After Method");
	}
	
	@AfterTest(alwaysRun=true)  // to be executed after all tests
	public void method4() {
		System.out.println("Inside Before Test");
	}
}

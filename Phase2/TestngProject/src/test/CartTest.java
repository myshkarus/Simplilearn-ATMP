
package test;

import org.testng.annotations.Test;

public class CartTest extends BaseClass {
	
	@Test(groups = {"sanity"})
	public void CCTest() {
		System.out.println("Inside CC Test");
	}

}

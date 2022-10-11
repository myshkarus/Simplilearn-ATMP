
package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitAnnotations {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeJunit() {
		System.out.println("Before Junit");
	}
	
	@Test
	public void Test1() {
		assertEquals(11, Calculator.Add(5,  6));
		System.out.println("This it Test1");
	}
	
	@AfterEach
	public void afterJunit() {
		System.out.println("After Junit");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
	
}

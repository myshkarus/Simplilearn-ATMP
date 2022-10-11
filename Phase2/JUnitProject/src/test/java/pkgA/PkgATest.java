
package pkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

@Tag("Sanity")
public class PkgATest {
	
//	@Tag("Sanity")
//	@Tag("Nighty")
	@Test
	@DisplayName("part of pkgA")
	public void Test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	
//	@Tag("Sanity")
	@Test
	@DisplayName("part of pkgA")
	public void Test2() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
}

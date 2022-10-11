
package pkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class PkgBTest {
//	@Tag("Sanity")
	@Test
	@DisplayName("part of pkgB")
	public void Test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
}

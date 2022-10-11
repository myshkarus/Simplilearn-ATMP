
package junits;

public class StringFunctions {

	public static void main(String[] args) {
		System.out.println(isPalindrom("tenet"));
	}

	public static boolean isPalindrom(String name) {

		String palindrom = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			palindrom = palindrom + name.charAt(i);
		}
		return name.equals(palindrom);
	}

	public static boolean isPalindromQuicker(String name) {

		int i = 0;
		int j = name.length() - 1;

		while (i < j) {
			if (name.charAt(i) != name.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		
		return true;
	}
}

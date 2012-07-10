package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/9/2012
 */
public class P036 {

	/**
	 * 
	 * @param a
	 *            - input number
	 * @return Whether or not the inputed number is a palindrome
	 */
	private static boolean isPalindrome(String a) {
		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(a.length() - i - 1))
				return false;
		}
		return true;
	}

	/**
	 * 
	 * @return number of palindromes in binary as well as decimal
	 */
	public static int numMultiPalindrome() {
		int tot = 0;
		for (int i = 1; i < 1000000; i += 2) {
			if (isPalindrome(i + "")) {
				if (isPalindrome(Integer.toBinaryString(i)))
					tot += i;
			}
		}
		return tot;
	}

	public static void main(String[] args) {
		System.out.println(numMultiPalindrome());

	}

}

package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/2/2012
 */
public class P004 {
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
	 * @return Finds the largest palindrome that can be formed by multiplying
	 *         two 3 digit numbers.
	 */
	public static int largestPalin() {
		int ret = 0;
		int temp;
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				temp = i * j;
				if (isPalindrome(String.valueOf(temp))) {
					ret = Math.max(ret, i * j);
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(largestPalin());

	}

}

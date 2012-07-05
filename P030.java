package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/4/2012
 */
public class P030 {
	/**
	 * 
	 * @return finds all the numbers that can be written as a sum of their
	 *         fifths and adds them together.
	 */
	public static int fifthSumFind() {
		int total = 0;
		for (int i = 2; i < 300000; i++) {
			if (isFifth(i))
				total += i;
		}
		return total;
	}

	/**
	 * 
	 * @param n
	 *            - The number to test
	 * @return returns true if the number is a sum of its fifths else false.
	 */
	public static boolean isFifth(int n) {
		String s = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Math.pow(Integer.valueOf(s.charAt(i) + ""), 5);
		}
		if (n == sum)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(fifthSumFind());
	}
}

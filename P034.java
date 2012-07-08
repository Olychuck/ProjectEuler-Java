package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/7/2012
 */
public class P034 {
	/**
	 * 
	 * @param a
	 *            - Number to take the factorial of
	 * @return a!
	 */
	public static int fact(int a) {
		return factUtil(a, 1);
	}

	/**
	 * A helper function for fact(), it recursively determines a!
	 * 
	 * @param a
	 * @param b
	 * @return factorial of a*b
	 */
	private static int factUtil(int a, int b) {
		if (a == 0)
			return b;
		return a * factUtil(a - 1, b);
	}

	/**
	 * 
	 * @return the sum of the numbers that can be found by adding together all
	 *         the factorials of that number
	 */
	public static int sumFactNumbs() {
		int sum = 0;
		for (int i = 3; i < 100000; i++) {
			if (isFactNumb(i)) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param k
	 * @return true if the number is the same as adding all of its digits
	 *         together as factors
	 */
	public static boolean isFactNumb(int k) {
		int sum = 0;
		int temp = k;
		while (k > 0) {
			sum += fact(k % 10);
			k /= 10;
		}
		if (sum == temp)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(sumFactNumbs());
	}

}

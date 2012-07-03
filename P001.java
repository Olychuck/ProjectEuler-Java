package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/2/2012
 */
public class P001 {
	/**
	 * Adds natural numbers that are either a multiple of 3 or 5 up to a given
	 * number.
	 * 
	 * @param n
	 *            - The upper limit (non-inclusive) with with to add to
	 * @return The sum of multiples of 3 or 5 to a given value
	 */
	public static int multSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(multSum(1000));
	}

}

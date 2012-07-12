package projecteuler;

import java.math.BigInteger;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P020 {

	/**
	 * 
	 * @param a
	 *            - Number to take the factorial of
	 * @return a!
	 */
	public static BigInteger fact(int a) {
		return factUtil(BigInteger.valueOf(a), BigInteger.ONE);
	}

	/**
	 * A helper function for fact(), it recursively determines a!
	 * 
	 * @param a
	 * @param b
	 * @return factorial of a*b
	 */
	private static BigInteger factUtil(BigInteger a, BigInteger b) {
		if (a.equals(BigInteger.ZERO))
			return b;
		return a.multiply(factUtil(a.subtract(BigInteger.ONE), b));
	}

	/**
	 * 
	 * @return the sum of the digits in 100!
	 */
	public static int sumDigits() {
		String a = fact(100).toString();
		int tot = 0;
		for (int i = 0; i < a.length(); i++) {
			tot += a.charAt(i) - 48;
		}
		return tot;
	}

	public static void main(String[] args) {
		System.out.println(sumDigits());

	}

}

package projecteuler;

import java.math.BigInteger;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P015 {

	/**
	 * 
	 * @param n
	 * @param r
	 * @return the binomial coefficient such that n is the row of pascals
	 *         triangle and r is the column
	 */
	public static BigInteger nCr(int n, int r) {
		return fact(n).divide((fact(r).multiply(fact(n - r))));
	}

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
	 * @return the number of routes in a 20 by 20 grid
	 */
	public static BigInteger numbOfRoutes() {
		return nCr(40, 20);
	}

	public static void main(String[] args) {
		System.out.println(numbOfRoutes());
	}

}

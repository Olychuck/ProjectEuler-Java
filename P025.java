package projecteuler;

import java.math.BigInteger;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P025 {
	/**
	 * 
	 * @return the first term in the Fibonacci sequence to have 1000 or more
	 *         digits
	 */
	public static int thousandTermFib() {
		BigInteger bi = BigInteger.ONE;
		BigInteger last = BigInteger.ONE;
		BigInteger temp = BigInteger.ONE;
		int counter = 2;
		while (bi.toString().length() < 1000) {
			temp = bi;
			bi = bi.add(last);
			last = temp;
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(thousandTermFib());

	}

}

package projecteuler;

import java.math.BigInteger;
/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/4/2012
 */
public class P026 {

	/**
	 * 
	 * @param n the upper bound
	 * @return Finds the maximum period for rational numbers
	 * under a specified limit
	 */
	public static int largestPeriod(int n) {
		int ret = 0;
		int max = 0;
		String temp;
		char util;
		for (int i = 2; i < n; i++) {
			temp = String.valueOf(i);
			util = temp.charAt(temp.length() - 1);
			if (util == '1' || util == '3' || util == '7' || util == '9') {
				for (int a = 1; a < Integer.MAX_VALUE; a++) {
					BigInteger bi = new BigInteger("10");
					bi = bi.pow(a).subtract(BigInteger.ONE);
					if (bi.mod(new BigInteger(String.valueOf(i))).equals(
							BigInteger.ZERO)) {
						if (a > max) {
							ret = i;
							max = a;
						}
						break;
					}
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(largestPeriod(1000));
	}

}

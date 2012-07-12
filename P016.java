package projecteuler;

import java.math.BigInteger;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P016 {

	/**
	 * 
	 * @return the digits added together of 2^1000
	 */
	public static int numDigits() {
		BigInteger val = new BigInteger("2");
		val = val.pow(1000);
		String a = val.toString();
		int tot = 0;
		for (int i = 0; i < a.length(); i++) {
			tot += a.charAt(i) - 48;
		}
		return tot;
	}

	public static void main(String[] args) {
		System.out.println(numDigits());

	}

}

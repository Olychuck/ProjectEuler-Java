package projecteuler;

import java.util.HashSet;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/9/2012
 */
public class P038 {

	/**
	 * 
	 * @param s
	 *            - The string to test
	 * @return returns true if a 9 digit string is pandigital
	 */
	public static boolean isPandigital(String s) {
		HashSet<Character> in = new HashSet<Character>();
		in.add('0');
		for (int i = 0; i < s.length(); i++) {
			if (!in.add(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @return the biggest pandigital number that can be obtained by multiplying
	 *         a number by an incrementor then concatenating the results
	 */
	public static int bigPandigital() {
		int max = 0;
		String temp;
		for (int i = 2; i < 10000; i++) {
			temp = "";
			for (int a = 1; temp.length() < 9; a++) {
				temp = temp + i * a;
			}
			if (temp.length() == 9) {
				if (isPandigital(temp))
					max = Math.max(max, Integer.valueOf(temp));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(bigPandigital());

	}

}

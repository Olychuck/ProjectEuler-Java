package projecteuler;

import java.util.HashSet;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/7/2012
 */
public class P032 {

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
	 * @return The number of 9 digit Pandigital numbers
	 */
	public static int numPandigital() {
		int ret = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		String temp;
		for (int i = 2; i < 10000; i++) {
			for (int j = i; j < 10000; j++) {
				temp = i + "" + j + (i * j);
				if (temp.length() > 9) {
					break;
				}
				if (temp.length() == 9 && !hs.contains(i * j)) {
					if (isPandigital(temp)) {
						ret += i * j;
						hs.add(i * j);
					}
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(numPandigital());
	}
}

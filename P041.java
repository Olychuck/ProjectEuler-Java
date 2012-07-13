package projecteuler;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/13/2012
 */
public class P041 {
	/**
	 * 
	 * @param s
	 *            - The string to test
	 * @return returns true if a string is pandigital
	 */
	public static boolean isPandigital(String s) {
		HashSet<Character> in = new HashSet<Character>();
		in.add('0');
		for (int i = s.length() + 1; i < 10; i++) {
			in.add((char) (i + 48));
		}
		for (int i = 0; i < s.length(); i++) {
			if (!in.add(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param a
	 *            - upper limit for sieve (inclusive)
	 * @return An ArrayList containing the prime numbers between 2 and given
	 *         number
	 */
	public static ArrayList<Integer> sieveErat(int a) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int[] arr = new int[a + 1];
		for (int i = 2; i <= a; i++) {
			if (arr[i] != -1) {
				ret.add(i);
				for (int j = 2; j * i <= a; j++) {
					arr[j * i] = -1;
				}
			}
		}
		return ret;
	}

	/**
	 * 
	 * @return the largest prime pandigital
	 */
	public static int LargestPandigital() {
		int max = 0;
		ArrayList<Integer> arr = sieveErat(10000000);
		for (int a : arr) {
			if (isPandigital(a + "")) {
				max = a;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(LargestPandigital());
	}
}

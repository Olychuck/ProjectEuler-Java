package projecteuler;

import java.util.ArrayList;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/2/2012
 */
public class P003 {

	/**
	 * 
	 * @param n
	 *            - Number to find factor of.
	 * @return The greatest prime factor of the given number
	 */
	public static int primeFact(long n) {
		double d = Math.sqrt(n);
		ArrayList<Integer> arr = sieveErat((int) d);
		for (int i = arr.size() - 1; i >= 0; i--) {
			if (n % arr.get(i) == 0)
				return arr.get(i);
		}
		return -1;
	}

	/**
	 * 
	 * @param a
	 *            - upper limit for seive (inclusive)
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

	public static void main(String[] args) {
		System.out.println(primeFact(new Long("600851475143")));
	}

}

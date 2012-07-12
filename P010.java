package projecteuler;

import java.util.ArrayList;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P010 {

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
	 * @return the sum of the prime numbers under 2,000,000.
	 */
	public static long primeSum() {
		ArrayList<Integer> arr = sieveErat(2000000);
		long sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(primeSum());
	}

}

package projecteuler;

import java.util.ArrayList;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P012 {

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
	 * @return the first triangle number that has greater than 500 divisors
	 */
	public static long triangleDivisors() {
		ArrayList<Integer> arr = sieveErat(1000);
		long trinum = 1;
		for (int i = 2; i < 1000000; i++) {
			trinum += i;
			if (numDivisors(trinum, arr) > 500)
				return trinum;
		}
		return 1;
	}

	/**
	 * 
	 * @param k
	 *            - number to be determined
	 * @param primes
	 *            - ArrayList of primes
	 * @return number of divisors of k
	 */
	private static int numDivisors(long k, ArrayList<Integer> primes) {
		int tot = 1;
		for (int a : primes) {
			int temp = 0;
			while (k % a == 0) {
				k /= a;
				temp++;
			}
			if (temp > 0)
				tot *= (temp + 1);
			if (k == 1)
				return tot;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(triangleDivisors());

	}

}

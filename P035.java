package projecteuler;

import java.util.HashSet;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/9/2012
 */
public class P035 {
	/**
	 * 
	 * @param a
	 *            - upper limit for sieve (inclusive)
	 * @return A HashSet containing the prime numbers between 2 and given number
	 */
	public static HashSet<Integer> sieveErat(int a) {
		HashSet<Integer> ret = new HashSet<Integer>();
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
	 * @param num
	 *            -number to test
	 * @param arr
	 *            - hashSet of primes
	 * @return true if cicular else false
	 */
	public static boolean isCircular(int num, HashSet<Integer> arr) {
		String temp = num + "";
		for (int i = 0; i < temp.length(); i++) {
			if (!arr.contains(Integer.valueOf(temp.substring(i)
					+ temp.substring(0, i)))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param amm
	 *            - the number under which to count circular primes
	 * @return -number of circular primes
	 */
	public static int numCircular(int amm) {
		int tot = 1;
		HashSet<Integer> arr = sieveErat(1000000);
		for (int i = 1; i < amm; i += 2) {
			if (arr.contains(i))
				if (isCircular(i, arr)) {
					tot += 1;
				}
		}
		return tot;
	}

	public static void main(String[] args) {
		System.out.println(numCircular(1000000));
	}
}

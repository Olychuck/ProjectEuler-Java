package projecteuler;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/9/2012
 */
public class P037 {

	/**
	 * 
	 * @param a
	 *            - upper limit for sieve (inclusive)
	 * @return A HashSet containing the prime numbers between 2 and given number
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
	 * @param k
	 *            - number to test
	 * @param arr
	 *            -array of primes
	 * @return true if number is prime truncated left and right else false.
	 */
	public static boolean isPrimeTrunc(int k, ArrayList<Integer> arr) {
		if (k / 10 == 0)
			return false;
		for (int i = 1; k / i > 0; i *= 10) {
			if (!(Collections.binarySearch(arr, k / i) >= 0)) {
				return false;
			}
		}
		for (int i = 10; k / i > 0; i *= 10) {
			if (!(Collections.binarySearch(arr, k % i) >= 0)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @return the sum of all prime truncateable numbers
	 */
	public static int sumPrimeTrunc() {
		int sum = 0;
		int num = 0;
		ArrayList<Integer> arr = sieveErat(10000000);
		for (int k : arr) {
			if (isPrimeTrunc(k, arr)) {
				sum += k;
				num++;
			}
			if (num == 11)
				break;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumPrimeTrunc());

	}

}

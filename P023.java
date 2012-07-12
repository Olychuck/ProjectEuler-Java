package projecteuler;

import java.util.ArrayList;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P023 {
	/**
	 * 
	 * @param k
	 * @return the sum of all divisors of k excluding itself
	 */
	public static int divSum(int k) {
		double a = Math.sqrt(k);
		int sum = -k;
		for (int i = 1; i <= a; i++) {
			if (k % i == 0) {
				sum += i + k / i;
			}

		}
		if (k % a == 0)
			sum -= a;
		return sum;

	}

	/**
	 * 
	 * @param k
	 * @return true if k is abundant else false
	 */
	public static boolean isAbundant(int k) {
		if (divSum(k) > k)
			return true;
		return false;
	}

	/**
	 * 
	 * @return an array holding all of the abundant values from 1 to 28123
	 */
	public static ArrayList<Integer> abundantArr() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 2; i < 28123; i++) {
			if (isAbundant(i)) {
				arr.add(i);
			}
		}
		return arr;
	}

	/**
	 * 
	 * @return The sum of all the numbers that can't be added up to with two
	 *         abundant numbers.
	 */
	public static int sumNonAbundantSum() {
		ArrayList<Integer> arr = abundantArr();
		boolean barr[] = new boolean[28124];
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				int temp = arr.get(i) + arr.get(j);
				if (temp < 28124) {
					barr[temp] = true;
				}
			}
		}
		int sum = 0;
		for (int i = 1; i < barr.length; i++) {
			if (!barr[i])
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumNonAbundantSum());
	}
}

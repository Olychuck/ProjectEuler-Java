package projecteuler;

import java.util.ArrayList;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/15/2012
 */
public class P043 {
	/**
	 * 
	 * @param k
	 * @param j
	 * @param arr
	 *            swaps the elements at arr[j] and arr[k]
	 */
	public static void swap(int k, int j, char[] arr) {
		char t = arr[k];
		arr[k] = arr[j];
		arr[j] = t;
	}

	/**
	 * 
	 * @return the sum of the pandigitals that adhear to the rule
	 */
	public static long numWRule() {
		ArrayList<String> arr = makePanDigitals();
		long tot = 0;
		for (String s : arr) {
			if (hasProperty(s)) {
				tot += Long.valueOf(s);
			}
		}
		return tot;
	}

	/**
	 * 
	 * @return an ArrayList of pandigital strings of length 10
	 */
	public static ArrayList<String> makePanDigitals() {
		char arr[] = new char[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (char) (i + 48);
		}
		ArrayList<String> retarr = new ArrayList<String>(3628800);
		for (int i = 0; i < 3628800 - 1; i++) {
			int j = arr.length - 1;
			while (arr[j - 1] >= arr[j]) {
				j--;
			}
			int q = arr.length;
			while (arr[q - 1] <= arr[j - 1]) {
				q--;
			}
			swap(j - 1, q - 1, arr);
			j++;
			q = arr.length;
			while (j < q) {
				swap(j - 1, q - 1, arr);
				j++;
				q--;
			}
			retarr.add(String.valueOf(arr));

		}
		return retarr;
	}

	/**
	 * 
	 * @param k
	 * @return true if property is met else false
	 */
	public static boolean hasProperty(String k) {
		if (!(Integer.valueOf(k.substring(1, 4)) % 2 == 0))
			return false;
		if (!(Integer.valueOf(k.substring(2, 5)) % 3 == 0))
			return false;
		if (!(Integer.valueOf(k.substring(3, 6)) % 5 == 0))
			return false;
		if (!(Integer.valueOf(k.substring(4, 7)) % 7 == 0))
			return false;
		if (!(Integer.valueOf(k.substring(5, 8)) % 11 == 0))
			return false;
		if (!(Integer.valueOf(k.substring(6, 9)) % 13 == 0))
			return false;
		if (!(Integer.valueOf(k.substring(7, 10)) % 17 == 0))
			return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(numWRule());

	}

}

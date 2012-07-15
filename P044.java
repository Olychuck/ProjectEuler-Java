package projecteuler;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/15/2012
 */
public class P044 {
	/**
	 * 
	 * @return an ArrayList of pentagonal numbers
	 */
	public static ArrayList<Integer> generatePentagonal() {
		ArrayList<Integer> arr = new ArrayList<Integer>(10000);
		for (int i = 1; i < 10000; i++) {
			arr.add(i * ((3 * i) - 1) / 2);
		}
		return arr;
	}

	/**
	 * 
	 * @param penta
	 * @param i
	 * @param j
	 * @return correct if i and j's differences and additions are both
	 *         pentagonal
	 */
	public static boolean isdiffCorrect(HashSet<Integer> penta, int i, int j) {
		if (penta.contains(i + j) && penta.contains(j - i))
			return true;
		return false;
	}

	/**
	 * 
	 * @return the lowest difference between pentagonal numbers
	 */
	public static int lowestDiff() {
		ArrayList<Integer> arr = generatePentagonal();
		HashSet<Integer> penta = new HashSet<Integer>(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			for (int a = i + 1; a < arr.size(); a++) {
				if (isdiffCorrect(penta, arr.get(i), arr.get(a))) {
					min = Math.min(min, arr.get(a) - arr.get(i));

				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(lowestDiff());
	}

}

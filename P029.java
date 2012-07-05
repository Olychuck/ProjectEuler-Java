package projecteuler;

import java.util.HashSet;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/4/2012
 */
public class P029 {
	/**
	 * 
	 * @return returns the number of distinct numbers found by a^b where 1 < a <
	 *         101 and 1 < b < 101
	 */
	public static int numbOfDisPowers() {
		HashSet<Double> hs = new HashSet<Double>();
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				hs.add(Math.pow(i, j));
			}
		}
		return hs.size();
	}

	public static void main(String[] args) {
		System.out.println(numbOfDisPowers());
	}
}

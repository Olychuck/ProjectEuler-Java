package projecteuler;

import java.util.ArrayList;

public class P024 {
	/**
	 * 
	 * @param a - Number to take the factorial of
	 * @return a! 
	 */
	public static int fact(int a) {
		return factUtil(a, 1);
	}
	/**
	 * A helper function for fact(), it recursively determines
	 * a!
	 * @param a
	 * @param b
	 * @return factorial of a*b
	 */
	private static int factUtil(int a, int b) {
		if (a == 0)
			return b;
		return a * factUtil(a - 1, b);
	}
	/**
	 * For the ith position of the String you find its number by 
	 * realizing that it will equal the numbers rank of size (1st biggest,
	 *  2nd biggest..etc) of the unused numbers times (i-1)!
	 * 
	 * @param number
	 * @return the number'th lexicographic permutation of the String
	 * 0123456789
	 */
	public static String lexNumbFind(int number) {
		int cumul = 0;
		String ret = "";
		ArrayList<Integer> unused = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			unused.add(i);
		}
		for (int i = 9; i >= 0; i--) {
			int fact = fact(i);
			for (int a = unused.size() - 1; a >= 0; a--) {
				if (cumul + (a * fact) < number) {
					cumul += (a * fact);
					ret = ret + unused.remove(a);
					break;
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(lexNumbFind(1000000));

	}

}

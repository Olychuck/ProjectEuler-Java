package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/7/2012
 */
public class P033 {
	/**
	 * 
	 * @return finds the lowest denominator of the product of all two digit
	 *         curious number fractions
	 */
	public static int curiousNumberDenom() {
		int num = 1;
		int den = 1;
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if (isCurious(i, j)) {
					num *= j;
					den *= i;
				}
			}
		}
		for (int i = 2; i <= num; i++) {
			while (true) {
				if (num == 1) {
					break;
				}
				if (num % i == 0 && den % i == 0) {
					num /= i;
					den /= i;
				} else
					break;
			}
		}
		return den;
	}

	/**
	 * 
	 * @param num
	 *            -numerator
	 * @param den
	 *            -denominator
	 * @return true if the fraction is curious
	 */
	public static boolean isCurious(int num, int den) {
		if (num <= den)
			return false;
		String temp = num + "" + den;
		double val = num * 1. / den;
		if (temp.charAt(0) == temp.charAt(2) && temp.charAt(3) != '0') {
			if (val == (num % 10) * 1. / (den % 10)) {
				return true;
			}
		}
		if (temp.charAt(1) == temp.charAt(2) && temp.charAt(3) != '0') {

			if (val == (num / 10) * 1. / (den % 10)) {
				return true;
			}
		}
		if (temp.charAt(0) == temp.charAt(3)) {
			if (val == (num % 10) * 1. / (den / 10)) {
				return true;
			}
		}
		if (temp.charAt(1) == temp.charAt(3) && temp.charAt(1) != '0') {
			if (val == (num / 10) * 1. / (den / 10)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(curiousNumberDenom());
	}
}

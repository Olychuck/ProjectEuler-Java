package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P021 {
	/**
	 * 
	 * @return the sum of all Amiccable numbers under 10,000
	 */
	public static int sumAmiccable() {
		int sum = 0;
		int temp;
		for (int i = 2; i < 10000; i++) {
			temp = divSum(i);
			if (temp != i && divSum(temp) == i)
				sum += i;

		}
		return sum;
	}

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

	public static void main(String[] args) {
		System.out.println(sumAmiccable());

	}

}

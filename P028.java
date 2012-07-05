package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/4/2012
 */
public class P028 {
	/**
	 * 
	 * @param n
	 *            - The diameter of the spiral
	 * @return The sum of the values on the diagonals of the spiral
	 */
	public static int spiralDiagFind(int n) {
		int total = 1;
		int cur = 1;
		for (int i = 2; i < n; i += 2) {
			total += cur * 4 + i * 10;
			cur += i * 4;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(spiralDiagFind(1001));
	}
}

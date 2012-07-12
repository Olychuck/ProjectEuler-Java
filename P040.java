package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/12/2012
 */
public class P040 {
	/**
	 * 
	 * @return the product of d(1),d(10),d(100)...d(1000000) such that d(x)
	 *         returns the value at location x in a irrational repeating number
	 *         that equals 0.1234567891011121314....
	 */
	public static int fractSolve() {
		StringBuffer sb = new StringBuffer(1000100);
		int i = 1;
		sb.append(0);
		while (sb.length() <= 1000000) {
			sb.append(i);
			i++;
		}
		return (sb.charAt(1) - 48) * (sb.charAt(10) - 48)
				* (sb.charAt(100) - 48) * (sb.charAt(1000) - 48)
				* (sb.charAt(10000) - 48) * (sb.charAt(100000) - 48)
				* (sb.charAt(1000000) - 48);

	}

	public static void main(String[] args) {
		System.out.println(fractSolve());

	}
}

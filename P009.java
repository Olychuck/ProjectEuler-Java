package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P009 {
	/**
	 * 
	 * @return the product of the three digits in the pythagorean triplet such
	 *         that a + b + c = 1000
	 */
	public static int pythagTrip() {
		for (int i = 1; i < 1000; i++) {
			for (int j = i + 1; j < 1000; j++) {
				if (i + j + Math.sqrt(i * i + j * j) == 1000) {
					return i * j * (int) Math.sqrt(i * i + j * j);
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(pythagTrip());

	}

}

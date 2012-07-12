package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P006 {
	/**
	 * 
	 * @return the difference between the square of the sum from 1 to 100 and 
	 * the sum of the squares from 1 to 100
	 */
	public static int sumDifference() {
		int sumofsq = 0;
		int sqofsum = 0;
		for (int i = 1; i <= 100; i++) {
			sumofsq += i * i;
			sqofsum += i;
		}
		sqofsum *= sqofsum;
		return sqofsum - sumofsq;
	}

	public static void main(String[] args) {
		System.out.println(sumDifference());

	}

}

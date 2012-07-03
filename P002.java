package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/2/2012
 */
public class P002 {

	/**
	 * Recursively finds the sum of terms in the Fibonacci sequence under a
	 * given value for even values.
	 * 
	 * @param n
	 *            - The upper limit (non-inclusive)
	 * @param c
	 *            - The current number
	 * @param l
	 *            - The last number
	 * @return The summation of the values of the Fibonacci sequence under a
	 *         given value for even terms
	 */
	public static int fibSum(int n,int c,int l){
		if(c > n)
			return 0;
		if(c % 2 == 0)
			return c+fibSum(n,l+c,c);
		return fibSum(n,l+c,c);
		
	}

	public static void main(String[] args) {
		System.out.println(fibSum(4000000,1,0));
	}

}

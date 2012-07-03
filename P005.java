package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/2/2012
 */
public class P005 {
	/**
	 * 
	 * @return an integer array with the prime factorization of numbers under 21
	 */
	public static int[] primeFactor() {
		int[] arr = new int[21];
		int temp;
		for (int i = 2; i <= 20; i++) {
			temp = i;
			for (int a = 2; a <= i; a++) {
				if (temp % a == 0) {
					for (int z = 1; z <= 20; z++) {
						if (temp % Math.pow(a, z) == 0)
							arr[a] = Math.max(arr[a], z);
					}
				}
			}
		}
		arr[1] = 0;
		arr[4] = 0;
		arr[6] = 0;
		arr[8] = 0;
		arr[9] = 0;
		arr[10] = 0;
		arr[12] = 0;
		arr[14] = 0;
		arr[15] = 0;
		arr[16] = 0;
		arr[18] = 0;
		arr[20] = 0;
		return arr;
	}

	/**
	 * Uses Prime factorization and then multiplies together all of the prime
	 * numbers raised to the highest power that they occur in the numbers
	 * 
	 * @return The smallest number divisible by all the numbers from 1 to 20
	 * 
	 */
	public static long smallDivis() {
		long f = 1;
		int[] arr = primeFactor();
		for (int i = 1; i < arr.length; i++) {
			f *= Math.pow(i, arr[i]);
		}
		return f;
	}

	public static void main(String[] args) {
		System.out.println(smallDivis());

	}

}

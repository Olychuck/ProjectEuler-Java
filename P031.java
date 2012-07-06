package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/5/2012
 */
public class P031 {
	/**
	 * 
	 * @return number of coin combinations there is to make 2 euros
	 */
	public static int numCombinations() {
		int[] arr = new int[201];
		arr[0] = 1;
		int[] coinarr = { 1, 2, 5, 10, 20, 50, 100, 200 };
		for (int coin : coinarr) {
			for (int j = coin; j <= 200; j++) {
				arr[j] += arr[j - coin];
			}
		}
		return arr[200];
	}

	public static void main(String[] args) {
		System.out.println(numCombinations());

	}

}

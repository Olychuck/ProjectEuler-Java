package projecteuler;
/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P014 {
	/**
	 * 
	 * @return the longest sequence with a starting number under one million
	 *         created by the rules - if n is even n=n/2 else n=3n+1
	 */
	public static int longSeq() {
		int[] arr = new int[1000001];
		int maxv = 0;
		int maxk = 0;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i < arr.length; i++) {
			long temp = i;
			int count = 0;
			while (temp >= i) {
				if (temp % 2 == 0)
					temp /= 2;
				else
					temp = (temp * 3) + 1;
				count++;
			}
			arr[i] = count + arr[(int) temp];
			if (arr[i] > maxv) {
				maxv = arr[i];
				maxk = i;
			}
		}
		return maxk;
	}

	public static void main(String[] args) {
		System.out.println(longSeq());

	}

}

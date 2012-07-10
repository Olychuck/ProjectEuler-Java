package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/9/2012
 */
public class P039 {
	/**
	 * 
	 * @return determines the perimeter that has the most right angle triangles
	 *         under 1001
	 */
	public static int maxRight() {
		int arr[] = new int[1001];
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				if (i + j + Math.sqrt(i * i + j * j) > 1000) {
					break;
				}
				if (Math.sqrt(i * i + j * j) % 1 == 0)
					arr[i + j + (int) Math.sqrt(i * i + j * j)]++;

			}
		}
		int max = 0;
		int no = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				no = i;
				max = arr[i];
			}
		}
		return no;
	}

	public static void main(String[] args) {
		System.out.println(maxRight());
	}
}

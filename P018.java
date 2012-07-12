package projecteuler;

import java.util.Scanner;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P018 {
	/**
	 * 
	 * @return an integer array of structured data read from System.in
	 */
	public static int[][] structure() {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[15][15];
		for (int i = 0; i < 15; i++) {
			for (int a = 0; a < i + 1; a++) {
				arr[i][a] = scan.nextInt();
			}
		}
		return arr;
	}

	/**
	 * 
	 * @param arr
	 *            - a 2d array of integers representing weights
	 * @return the largest path from top to bottom of the array
	 */
	public static int biggestPath(int[][] arr) {
		int util[][] = new int[15][15];
		util[0][0] = arr[0][0];
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < i + 1; j++) {
				util[i + 1][j] = Math.max(util[i + 1][j], util[i][j]
						+ arr[i + 1][j]);
				util[i + 1][j + 1] = Math.max(util[i + 1][j + 1], util[i][j]
						+ arr[i + 1][j + 1]);
			}
		}
		int max = 0;
		for (int i = 0; i < 15; i++) {
			max = Math.max(util[14][i], max);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(biggestPath(structure()));

	}
	// Paste this in for the array
	// 75
	// 95 64
	// 17 47 82
	// 18 35 87 10
	// 20 04 82 47 65
	// 19 01 23 75 03 34
	// 88 02 77 73 07 63 67
	// 99 65 04 28 06 16 70 92
	// 41 41 26 56 83 40 80 70 33
	// 41 48 72 33 47 32 37 16 94 29
	// 53 71 44 65 25 43 91 52 97 51 14
	// 70 11 33 28 77 73 17 78 39 68 17 57
	// 91 71 52 38 17 14 91 43 58 50 27 29 48
	// 63 66 04 68 89 53 67 30 73 16 69 87 40 31
	// 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
}

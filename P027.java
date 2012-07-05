package projecteuler;

import java.util.ArrayList;
import java.util.Collections;

public class P027 {

	/**
	 * 
	 * @param a
	 *            - upper limit for sieve (inclusive)
	 * @return An ArrayList containing the prime numbers between 2 and given
	 *         number
	 */
	public static ArrayList<Integer> sieveErat(int a) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int[] arr = new int[a + 1];
		for (int i = 2; i <= a; i++) {
			if (arr[i] != -1) {
				ret.add(i);
				for (int j = 2; j * i <= a; j++) {
					arr[j * i] = -1;
				}
			}
		}
		return ret;
	}

	public static int numOfPrimes(ArrayList<Integer> arr, int a, int b) {
		int i = 0;
		while (true) {
			if (!(Collections.binarySearch(arr, (i * i) + (a * i) + b) >= 0)) {
				return i;
			}
			i++;
		}
	}

	public static int bestGenerator() {
		ArrayList<Integer> primes = sieveErat(100000);
		int max = 0;
		int a, b;
		a = b = 0;
		int temp;
		for (int i = -1000; i <= 1000; i++) {
			for (int j = -1000; j <= 1000; j++) {
				temp = numOfPrimes(primes, i, j);
				if (max < temp) {
					a = i;
					b = j;
					max = temp;
				}
			}
		}
		System.out.println(a+" "+b);
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println(bestGenerator());
	}
}

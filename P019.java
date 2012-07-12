package projecteuler;

import java.util.Calendar;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P019 {
	/**
	 * 
	 * @return the number of Sundays on the first day of the month between 1901
	 *         and 2000
	 */
	public static int numSum() {
		int sum = 0;
		Calendar c = Calendar.getInstance();
		for (int i = 1901; i < 2001; i++) {
			for (int a = 0; a < 12; a++) {
				c.set(i, a, 1);
				if (c.get(Calendar.DAY_OF_WEEK) == 1)
					sum++;

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(numSum());

	}
}

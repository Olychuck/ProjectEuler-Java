package projecteuler;

/**
 * @author Tyson Olychuck
 * @version 1.0
 * @since 7/11/2012
 */
public class P017 {

	/**
	 * 
	 * @return the number of letters from one to one thousand
	 */
	public static int lettercount() {
		int onenine = 36;
		int tennineteen = 70;
		int and = 3;
		int twentyninety = 46;
		int hundred = 7;
		int onethousand = 11;
		return onethousand + 900 * hundred + 190 * onenine + 100 * twentyninety
				+ 891 * and + 10 * tennineteen;

	}

	public static void main(String[] args) {
		System.out.println(lettercount());

	}

}

package DigitalRootCalculator;

public class DigitalRootCalculator {

	public static int digitalRoot(Integer n) {

		if (n == null || n < 0) {
			return -1;
		}

		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			n = sum;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(digitalRoot(16));
		System.out.println(digitalRoot(942));
		System.out.println(digitalRoot(132189));
		System.out.println(digitalRoot(493193));
		System.out.println(digitalRoot(-10));
		System.out.println(digitalRoot(null));
	}
}

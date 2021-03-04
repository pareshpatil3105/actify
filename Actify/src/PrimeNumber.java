
public class PrimeNumber {

	public static long primeNumber(long n) {
		boolean flag = true;

		for (int i = 10000; i <= n/2; i++) {
			flag = true;
			for (int k = 2; k <= i / 2; k++) {
				if (i % k == 0) {
					flag = false;
					// System.out.println(i+" no. is not prime");
					break;
				}
			}
			String str = String.valueOf(i);
			if (flag && i > 10000 && str.length() == 5) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(PrimeNumber.primeNumber(89453748376364763l) + " is the smallest 5 digit prime no.");
	}
}

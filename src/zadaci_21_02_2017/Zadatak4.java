package zadaci_21_02_2017;

/**
 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131
 * je palindrome prime, kao i brojevi 313 i 757. Napisati program koji ispisuje
 * prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	public static void main(String[] args) {
		int num = 2;
		int count = 0;
		while (count < 100) {
			if (isPrime(num) && isPalindrom(num)) {

				System.out.printf("%7d", num);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
			num++;
		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverseNum(int num) {

		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		return reverse;

	}

	public static boolean isPalindrom(int num) {
		return num == reverseNum(num);
	}

}
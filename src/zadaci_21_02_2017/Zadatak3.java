package zadaci_21_02_2017;

/**
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti
 * broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi
 * tako da su brojevi i 17 i 71 emirp brojevi. Napisati program koji ispisuje
 * prvih 100 emirp brojeva, 10 brojeva po liniji.
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static void main(String[] args) {

		int num = 2;
		int count = 0;
		while (count < 100) {
			if (isPrime(num) && isPrime(reverseNum(num)) && !isPalindrom(num)) {
				count++;
				System.out.printf("%5d", num);
				if (count % 10 == 0) {
					System.out.println();
				}
			}
			num++;
		}
	}

	public static int reverseNum(int num) {

		String backwards = "";
		String number = num + "";
		for (int i = number.length() - 1; i >= 0; i--) {
			backwards += number.charAt(i);
		}

		return Integer.parseInt(backwards);
	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrom(int num) {
		return num == reverseNum(num);
	}

}

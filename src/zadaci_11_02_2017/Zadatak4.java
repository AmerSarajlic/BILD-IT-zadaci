package zadaci_11_02_2017;

/*
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
 */
public class Zadatak4 {
	/*
	 * metoda koja printa prvi uppercase karaktere pa onda brojeve brojevi su u
	 * rasponu 0-100
	 */
	public static void printElements() {
		System.out.println("\tUpercase: \n");
		for (int i = 1; i <= 100; i++) {
			char ch = (char) ('A' + (Math.random() * ('Z' - 'A' + 1)));
			System.out.printf("%2c", ch);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n\tBrojevi: \n");
		for (int i = 1; i <= 100; i++) {
			int num = (int) (Math.random() * 100);
			// printf cisto radi ljepseg ispisa
			System.out.printf("%3d", num);
			if (i % 10 == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		printElements();
	}

}

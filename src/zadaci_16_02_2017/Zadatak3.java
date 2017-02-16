package zadaci_16_02_2017;

/**
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti
 * taèno jedan space.
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	/**
	 * provjera djeljivosti
	 * 
	 * @param num uneseni broj
	 * @return
	 */
	public static boolean isDivisible(int num) {
		if (num % 5 == 0 && num % 6 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * brojevi od 100 do 1000 (racunajuci i njih) 10 po liniji
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;
		for (int num = 100; num <= 1000; num++) {
			if (isDivisible(num)) {
				System.out.print(num + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

}

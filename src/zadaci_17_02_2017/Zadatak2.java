package zadaci_17_02_2017;

/**
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer,
 * brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su tako�er twin primes.
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10
 * parova po liniji.
 * 
 * @author amer
 *
 */
public class Zadatak2 {
/**
 * provjeravamo je li prime broj
 * @param number
 * @return
 */
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int number = 0;
		int counter = 0;
		for (int i = 1; i < 10000; i++) {
			if (isPrime(i)) {
				if (i - number == 2) {
					System.out.print("(" + number + ", " + i + ") ");
					counter++;
					if (counter % 10 == 0) {
						System.out.println();
					}
				}
				number = i;
			}
		}

	}

}

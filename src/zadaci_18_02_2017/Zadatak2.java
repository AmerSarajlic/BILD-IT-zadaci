package zadaci_18_02_2017;

/**
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i
 * 2 i 1000. Program treba da ispiše 8 brojeva po liniji te razmak izmeðu
 * brojeva treba da bude jedan space.
 * 
 * @author amer
 *
 */
public class Zadatak2 {
/**
 * provjeravamo da li je prime
 * @param num
 * @return
 */
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int counter = 0;
		for (int num = 2; num <= 1000; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				counter++;
				if (counter % 8 == 0) {
					System.out.println();
				}
			}
		}
	}
}

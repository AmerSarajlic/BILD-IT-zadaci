package zadaci_08_02_2017;

public class Zadatak4 {
	/*
	 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i
	 * 9 te ispisuje koliko se puta koji broj ponovio.
	 */
	public static void main(String[] args) {

		/*
		 * niz sa kojim poredimo random brojeve
		 */
		int[] testArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		/*
		 * niz u kojem brojim koji se broj koliko puta ponovio
		 */
		int[] mainArray = new int[10];

		int counter = 0;
		while (counter < 100) { // ogranicavamo ukupno na 100 random brojeva
			int number = (int) (Math.random() * 10);
			counter++;
			for (int index = 0; index < mainArray.length; index++) {
				if (testArray[index] == number) {
					mainArray[index]++;
				}
			}
		}

		for (int index = 0; index < mainArray.length; index++) {
			System.out.println("Broj: " + index + " se ponovio: " + mainArray[index] + " puta.");
		}

	}
}

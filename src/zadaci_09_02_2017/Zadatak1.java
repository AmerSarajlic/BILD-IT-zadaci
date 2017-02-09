package zadaci_09_02_2017;

public class Zadatak1 {
	/*
	 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
	 * godine 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i ukupan
	 * broj prijestupnih godina u ovom vremenskom periodu. *
	 */

	public static void main(String[] args) {

		int counter = 0;
		for (int year = 101; year <= 2100; year++) {

			// uslov za racunanje prestupne godine
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				counter++;

				// ako je ispunjen uslov ispisujemo tu godinu + 1 space
				System.out.print(year + " ");

				// kad ispisemo 10 godina prelazimo u novi red
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n\nUkupno ih ima: " + counter);

	}

}

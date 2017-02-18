package zadaci_17_02_2017;

/**
 * Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u
 * rasponu od 1 do 7. Takoðer, program ispisuje broj svih moguæih kombinacija.
 * Dakle, program treba da ispiše sve moguæe parove brojeva u datom rasponu,
 * krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21.
 * 
 * @author amer
 *
 */
public class Zadatak3 {
	/**
	 * ispred ispisa parova stavio sam redni broj cisto da se vidi koliko ima
	 * tih brojeva
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i < j) {
					counter++;
					System.out.println(counter + ". -> " + i + ":" + j + " ");
				}
			}
		}

	}

}

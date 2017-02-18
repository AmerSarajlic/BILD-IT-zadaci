package zadaci_17_02_2017;

/**
 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u
 * rasponu od 1 do 7. Tako�er, program ispisuje broj svih mogu�ih kombinacija.
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu,
 * krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija je 21.
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

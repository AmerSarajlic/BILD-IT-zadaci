package zadaci_09_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja prima jedan argument te simulira 
 * bacanje novèiæa toliko puta. 
 * Nakon što se simulacija završi, program ispisuje 
 * koliko puta je novèiæ pokazao glavu a koliko puta pismo.
 */
public class Zadatak5 {

	
	/*
	 * metoda koja vraca koliko je puta novcic pokazao glavu
	 */
	public static int numberOfHeads(int n) {
		int headCounter = 0;
		for (int iteration = 0; iteration < n; iteration++) {
			int coin = (int) (Math.random() * 2);
			if (coin == 1) {
				headCounter++;
			}
		}
		return headCounter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean on = true;
		while (on) {
			/*
			 * validacija i ispravak unosa
			 */
			try {
				System.out.print("Upisite koliko puta se baca novcic: ");
				number = input.nextInt();
				on = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos. Unos mora biti cijeli broj !");
				input.nextLine();
			}
		}
		input.close();
		/*
		 * ispis rezultata bacanja novcica
		 */
		int head = numberOfHeads(number);
		System.out.println("\nNovici je bacen: " + number + " puta, a pokazao je: " + head + " puta glavu i "
				+ (number - head) + " puta pismo. ");
	}

}

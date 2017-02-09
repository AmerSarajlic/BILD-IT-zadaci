package zadaci_09_02_2017;

import java.util.Scanner;
/*
 * Napisati metodu koja prima jedan argument, 
 * broj pitanja, te generiše toliko nasumiènih, 
 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. 
 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
 */

public class Zadatak2 {

	/*
	 * metoda koja generise pitanja i provjerava odgovore (odgovor moze biti i
	 * negativan), ukoliko se greskom upise neki karakter koji nije cijeli broj,
	 * korisnik ponovo odgovara na isto pitanje, s tim da se ta greska pri unosu
	 * ne racuna kao pogresan odgovor
	 */
	public static void correctWrongAnswers(int qNum, Scanner input) {
		int num = 0;
		int counter = 0;
		while (num < qNum) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			boolean on = true;
			while (on) {
				try {
					System.out.print("Koliko je: " + num1 + " - " + num2 + " = ");
					int result = input.nextInt();
					if (result == (num1 - num2)) {
						System.out.println("Odgovor je tacan !");
						counter++;
					} else {
						System.out.println("Odgovor nije tacan !");
					}

					num++;
					on = false;
				} catch (Exception e) {
					System.out.println("Unos nije validan , rezultat mora biti cijeli broj !!!");
					input.nextLine();
				}
			}
		}
		System.out.println("Ukupno je bilo: " + qNum + " pitanja. Tacno je odgovoreno: " + counter + ", a netacno: "
				+ (qNum - counter));
	}

	/*
	 * korisnik samo upisuje broj pitanja i provjerava se je li unos validan
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfQ = 0;
		boolean on = true;
		while (on) {
			try {
				System.out.println("Upisite broj pitanja: ");
				numberOfQ = input.nextInt();
				on = false;
			} catch (Exception e) {
				System.out.println("Unos nije validan. Unos mora biti cijeli broj.");
				input.nextLine();
			}
		}
		correctWrongAnswers(numberOfQ, input);
	}
}

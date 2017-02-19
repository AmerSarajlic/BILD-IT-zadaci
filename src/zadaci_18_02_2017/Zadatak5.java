package zadaci_18_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko
 * je pozitivnih brojeva korisnik unijeo, koliko negativnih te izraèunava ukupnu
 * sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese
 * nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše
 * da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
 * prosjek svih brojeva je 1.25.
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = 0;
		double sum = 0;
		double average = 0;
		int counterPlus = 0;
		int counter = 0;
		boolean on = true;
		while (on) {
			/**
			 * validacija unosa, ukoliko unesemo neki karakter koji nije broj,
			 * unos ne krecemo iz pocetka vec samo nastavljamo na vec unesene
			 * brojeve
			 */
			try {
				System.out.print("Upisite brojeve (0 prekida unos): ");
				number = input.nextInt();

				while (number != 0) {

					if (number > 0) {
						counterPlus++;
					}
					sum += number;
					counter++;
					number = input.nextInt();
				}
				on = false;
			} catch (Exception e) {
				System.out.println("Unos nije validan. ");
				input.nextLine();
			}
		}

		average = sum / counter;

		System.out.println("Uneseno brojeva: " + counter + "\nSuma je: " + sum + "\nProsjek je: " + average
				+ "\nPozitivnih: " + counterPlus + "\nNegativnih: " + (counter - counterPlus));

		input.close();
	}
}

package zadaci_16_02_2017;

import java.util.Scanner;

/**
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda
 * treba da koristi sljedeæi header: public static String convertMillis(long
 * millis). Metoda treba da vraæa vrijeme kao string u formatu
 * sati:minute:sekunde. Na primjer convertMillis(100000) treba da vrati 0:1:40.
 * 
 * @author amer
 *
 */
public class Zadatak5 {
	/**
	 * konverzija milisekundi
	 * 
	 * @param millis
	 * @return sat:minuta:sekunda
	 */
	public static String convertMillis(long millis) {
		long secondTotal = millis / 1000;
		long secondNumber = secondTotal % 60;
		long minutesTotal = secondTotal / 60;
		long minutesNumber = minutesTotal % 60;
		long hoursTotal = minutesTotal / 60;
		return hoursTotal + ":" + minutesNumber + ":" + secondNumber;
	}

	/**
	 * unos i validacija unosa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long milisecond = 0;
		try {
			System.out.print("Upisite broj milisekundi: ");
			milisecond = input.nextInt();
			if (milisecond < 0) {
				System.out.println("Broj milisekundi mora biti pozitivan !");
				System.exit(0);
			} else {
				System.out.println(milisecond + " milisekundi iznosi: " + convertMillis(milisecond));
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}
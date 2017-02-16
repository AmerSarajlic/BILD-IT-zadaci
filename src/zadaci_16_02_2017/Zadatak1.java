package zadaci_16_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u
 * sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
 * današnjeg dana te mu ispiše koji je to dan u buduænosti. (Primjer: ako
 * korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu
 * ispisuje da je danas utorak a dan u buduænosti je petak.)
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	/**
	 * validacija inputa
	 * 
	 * @param num uneseni broj
	 * @return true/false
	 */
	public static boolean isValidInput(int num) {
		if (num < 0 || num > 6) {
			return false;
		}
		return true;
	}

	/**
	 * @param day1 pocetni dan
	 * @param day2 broj dana
	 * @return dan u sedmici
	 */
	public static String day(int day1, int day2) {
		int finalDay = (day1 + day2) % 7;
		String dayName = "";
		switch (finalDay) {
		case 0:
			dayName = "ponedjeljak";
			break;
		case 1:
			dayName = "utorak";
			break;
		case 2:
			dayName = "srijeda";
			break;
		case 3:
			dayName = "cetvrtak";
			break;
		case 4:
			dayName = "petak";
			break;
		case 5:
			dayName = "subota";
			break;
		case 6:
			dayName = "nedjelja";
			break;
		}

		return dayName;
	}

	/**
	 * unos argumenata i validaciaj
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day1 = 0;
		int day2 = 0;
		try {
			System.out.print("Upisite danasnji dan u sedmici (0 za ponedjeljak, 1 za utorak...): ");
			day1 = input.nextInt();
			if (!isValidInput(day1)) {
				System.out.println("Unos nije validan, dan mora biti u rasponu 0 - 6 !");
			} else {
				System.out.print("Upisite broj dana nakon danasnjeg dana: ");
				day2 = input.nextInt();
				if (day2 < 1) {
					System.out.println("U proslost ne moze, tako da broj mora biti pozitivan !");
				} else {
					System.out.println("Danas je " + day(day1, 0) + ", a dan u buducnosti je " + day(day1, day2));
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan, unos mora biti cijeli broj !!!");
		}
		input.close();
	}
}

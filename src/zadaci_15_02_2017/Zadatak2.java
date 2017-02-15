package zadaci_15_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše
 * broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao godinu 2012
 * a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana.
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati
 * da je Mart 2015 imao 31 dan.
 * 
 * @author amer
 *
 */
public class Zadatak2 {
	/**
	 * @param year
	 * @return da li je godina prestupna
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * @param month
	 * @return da li je mjesec validan
	 */
	public static boolean isValidMonth(int month) {
		if (month < 1 || month > 12) {
			return false;
		}
		return true;
	}

	/**
	 * @param month
	 * @param year
	 * @return broj dana mjeseca
	 */
	public static int numberOfDays(int month, int year) {
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else {
			return 30;
		}
	}

	/**
	 * @param month
	 * @return naziv mjeseca
	 */
	public static String monthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "Januar";
			break;
		case 2:
			monthName = "Februar";
			break;
		case 3:
			monthName = "Mart";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "Maj";
			break;
		case 6:
			monthName = "Juni";
			break;
		case 7:
			monthName = "Juli";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "Septembar";
			break;
		case 10:
			monthName = "Octobar";
			break;
		case 11:
			monthName = "Novembar";
			break;
		case 12:
			monthName = "Decembar";
		}
		return monthName;
	}

	/**
	 * 
	 * @param month
	 * @param year
	 * @return pravilan ispis rijeci imati
	 */
	public static String imaoImati(int month, int year) {

		if (month > 1 && year > 2017) {
			return "imati ce";
		}
		return "imao je";
	}

	/**
	 * 
	 * @param month
	 * @param year
	 * @return pravilan ispis rijeci dan
	 */
	public static String danDana(int month, int year) {
		if (numberOfDays(month, year) == 31) {
			return "dan.";
		}
		return "dana.";

	}

	/**
	 * unos i validacija unosa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = 0;
		int year = 0;
		try {
			System.out.print("Upisite mjesec (1-12): ");
			month = input.nextInt();
			if (!isValidMonth(month)) {
				System.out.print("Unos nije validan.");
			} else {
				System.out.print("Upisite godinu: ");
				year = input.nextInt();
				System.out.println(monthName(month) + " " + year + " " + imaoImati(month, year) + " "
						+ numberOfDays(month, year) + " " + danDana(month, year));
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}

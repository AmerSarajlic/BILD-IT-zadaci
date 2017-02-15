package zadaci_15_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena
 * mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. Na
 * primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu
 * ispisuje da Jan 2011 ima 31 dan.
 * 
 * @author amer
 *
 */
public class Zadatak3 {
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
	 * @param year
	 * @return broj dana mjeseca
	 */
	public static int numberOfDays(String month, int year) {

		if (monthNumber(month) == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if (monthNumber(month) == 1 || monthNumber(month) == 3 || monthNumber(month) == 5
				|| monthNumber(month) == 7 || monthNumber(month) == 8 || monthNumber(month) == 10
				|| monthNumber(month) == 12) {
			return 31;
		} else {
			return 30;
		}
	}

	/**
	 * @param month
	 * @return naziv mjeseca
	 */
	public static int monthNumber(String month) {
		int monthNumber = 0;
		switch (month) {
		case "Jan":
			monthNumber = 1;
			break;
		case "Feb":
			monthNumber = 2;
			break;
		case "Mar":
			monthNumber = 3;
			break;
		case "Apr":
			monthNumber = 4;
			break;
		case "Maj":
			monthNumber = 5;
			break;
		case "Jun":
			monthNumber = 6;
			break;
		case "Jul":
			monthNumber = 7;
			break;
		case "Aug":
			monthNumber = 8;
			break;
		case "Sep":
			monthNumber = 9;
			break;
		case "Okt":
			monthNumber = 10;
			break;
		case "Nov":
			monthNumber = 11;
			break;
		case "Dec":
			monthNumber = 12;
			break;
		}
		return monthNumber;
	}

	/**
	 * 
	 * @param month
	 * @param year
	 * @return pravilan ispis rijeci imati
	 */
	public static String imaoImati(String month, int year) {

		if (monthNumber(month) > 1 && year > 2017) {
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
	public static String danDana(String month, int year) {
		if (numberOfDays(month, year) == 31) {
			return "dan.";
		}
		return "dana.";

	}
/**
 * validacija unosa mjeseca
 * @param array lista mjeseci
 * @param month naziv mjeseca
 * @return da li je validan unos
 */
	public static boolean isValidMonth(String[] array, String month) {
		for (int index = 0; index < array.length; index++) {
			if (array[index].equals(month)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * unos i validacija unosa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month = "";
		String[] months = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec" };
		int year = 0;
		try {
			System.out.print("Upisite prva tri slova naziva mjeseca (prvo slovo Uppercase): ");
			month = input.next();

			if (!isValidMonth(months, month)) {
				System.out.print("Unos nije validan.");
			} else {
				System.out.print("Upisite godinu: ");
				year = input.nextInt();
				System.out.println(month + " " + year + " " + imaoImati(month, year) + " " + numberOfDays(month, year)
						+ " " + danDana(month, year));
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}

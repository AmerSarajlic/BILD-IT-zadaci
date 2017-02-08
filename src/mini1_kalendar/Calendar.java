package mini1_kalendar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {

	/*
	 * metoda koja vraca naziv mjeseca na engleskom za unesenu numericku
	 * vrijednost
	 */
	public String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}
		return monthName;
	}

	/*
	 * metoda koja ispisuje kalendar za odreðeni mjesec u godini na osnovu prvog
	 * dana u mjesecu i broja dana u mjesecu izracunatih u drugim metodama
	 */

	public void displayMonth(int month, int year) {
		System.out.println("           " + getMonthName(month) + ", " + year);
		System.out.println("_____________________________________");
		System.out.println("  Sun Mon Tue Wed Thu Fri Sat\n");
		int startDay = getStartDay(month, year);
		int monthNumberOfDays = getNumberOfDaysInAMonth(month, year);
		for (int i = 0; i < startDay; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= monthNumberOfDays; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}

		}
		System.out.println();

	}

	/*
	 * metoda koja racuna koji je prvi dan u mjesecu na osnovu toga sto je
	 * 1.1.1800 srijeda te na osnovu toga koliko je dana od te "srijede" proslo
	 * do danas
	 */
	public int getStartDay(int month, int year) {

		final int START_DAY_FOR_1_1_1800 = 3;
		int startDay = (getTotalNumberOfDays(month, year) + START_DAY_FOR_1_1_1800) % 7;
		return startDay;
	}

	/*
	 * metoda koja racuna ukupan broj dana od 1800, u obzir se uzima da li je
	 * godina prestupna ili ne
	 */
	public int getTotalNumberOfDays(int month, int year) {
		int totalNumberOfDays = 0;
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				totalNumberOfDays += 366;
			} else {
				totalNumberOfDays += 365;
			}
		}
		for (int i = 1; i < month; i++) {
			totalNumberOfDays += getNumberOfDaysInAMonth(i, year);
		}
		return totalNumberOfDays;
	}

	/*
	 * metoda kojom provjeravamo da li je godina prestupna ili ne
	 */
	public boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
			return true;
		}
		return false;
	}

	/*
	 * metoda koja vraca broj dana u svakom mjesecu, za februar provjerava da li
	 * je prestupna godina ili ne
	 */
	public int getNumberOfDaysInAMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		return -1;
	}

	/*
	 * metoda koja provjerava da li je upis validan i ispisuje kalendar za
	 * mjesec i godinu koju unese korisnik
	 */
	public void calendarForSpecificDate(Scanner input) {
		int month = 0;
		int year = 0;
		boolean on = true;
		while (on) {
			try {
				System.out.print("Input year: ");
				year = input.nextInt();
				System.out.print("Input month (1-12): ");
				month = input.nextInt();
				while (!Validation.isValidMonth(month)) {
					System.out.print("Invalid number input for month, please enter 1-12: ");
					month = input.nextInt();
				}
				on = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, inserted format is not supported !!!");

				input.nextLine();
			}
		}
		System.out.println();
		displayMonth(month, year);
	}
}

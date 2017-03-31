package zadaci_30_03_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak1 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Koristenje: java Exercise_13_04 month year");
			System.exit(1);
		}

		// kalendar objekat
		Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);

		// prikaz kalendar hedera
		printHeader(calendar);

		// space prije prvog dana u mjesecu
		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++)
			System.out.print("    ");

		// ispis dana u mjesecu
		while (calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)) {

			if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
				System.out.printf("%4d\n", calendar.get(Calendar.DATE));
			else
				System.out.printf("%4d", calendar.get(Calendar.DATE));

			// dodavanje dana
			calendar.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d\n", calendar.get(Calendar.DATE));
	}

	/** vracanje naziva mjeseca */
	public static String[] getMonths() {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months;
	}

	/** heder kalendara */
	public static void printHeader(Calendar calendar) {
		// niz naziva mjeseci
		String[] months = getMonths();

		// ispis godine i mjeseca
		int length = 29 / 2 - (months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
		System.out.println();
		for (int i = 0; i < length; i++)
			System.out.print(" ");
		System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + calendar.get(Calendar.YEAR));

		// ispis dana u sedmici
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

}

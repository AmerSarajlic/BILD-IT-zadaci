package zadaci_23_02_2017;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	/**
	 * metoda koja vraca format (da ne bude string opet pa da ne valja)
	 * 
	 * @return
	 */
	public static DateFormat dateNow() {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return dateFormat;

	}

	public static void main(String[] args) {

		Date date = new Date(System.currentTimeMillis());
		System.out.println("Prvi nacin:\n" + dateNow().format(date));

		System.out.println("\n\nDrugi nacin:\n" + newDateNow());

	}

	/**
	 * metoda koja vraca datum i vrijeme kao string
	 */
	public static String newDateNow() {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		String dateReturn = dateFormat.format(date);
		return dateReturn;
	}
}

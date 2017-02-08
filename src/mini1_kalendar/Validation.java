package mini1_kalendar;

public class Validation {

	/*
	 * metoda koja provjerava da li je unos za mjesec validan tj u rasponu 1-12
	 */
	public static boolean isValidMonth(int month) {
		if (month < 1 || month > 12) {
			return false;
		}
		return true;
	}

	/*
	 * metoda koja provjerava da li je validan unos datuma, tj broj dana u
	 * mjesecu
	 */
	public static boolean isValidDayMonth(String date) {
		Calendar calendar = new Calendar();
		String[] dateArray = date.split("/");
		int day = Integer.parseInt(dateArray[0]);
		int month = Integer.parseInt(dateArray[1]);
		int year = Integer.parseInt(dateArray[2]);
		if (calendar.getNumberOfDaysInAMonth(month, year) >= day && day > 0 && isValidMonth(month)) {
			return true;
		}
		return false;
	}

	/*
	 * metoda koja provjerava da li je format upisa datuma tacan, potreban
	 * format je dd/mm/yyyy
	 */

	public static boolean isValidDate(String date) {

		if (date.length() != 10) {
			return false;
		}
		if (date.charAt(2) != '/' && date.charAt(4) != '/') {
			return false;
		}

		return true;
	}
}

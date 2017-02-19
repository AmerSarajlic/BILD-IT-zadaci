package zadaci_18_02_2017;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od
 * 1. januara 1970 do trenutka pozivanja metode. Napisati program koji ispisuje
 * trenutaèni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli,
 * 2015 19:59:47"
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static void main(String[] args) {

		long second = System.currentTimeMillis() / 1000;
		long secondNow = second % 60;
		long minutesTotal = second / 60;
		long minutesNow = minutesTotal % 60;
		long hours = minutesTotal / 60;
		long hoursNow = hours % 24;
		/**
		 * posto smo u vremenskoj zoni +1 moramo na sate dodat +1
		 */
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd. MMM, yyyy");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(simpleDateFormat.format(date) + " " + (hoursNow + 1) + ":" + minutesNow + ":" + secondNow);

	}

}

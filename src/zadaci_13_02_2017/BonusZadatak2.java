package zadaci_13_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusZadatak2 {
	/**
	 * metoda koja racuna sve potrebne podatke vezane za vrijeme
	 * 
	 * @param year
	 */
	public static void time(long year) {
		DecimalFormat df = new DecimalFormat("##");
		long seconds = year;
		long secondsNow = seconds % 60;
		long minutes = seconds / 60;
		long minutesNow = minutes % 60;
		long hours = minutes / 60;
		long hoursNow = hours % 24;

		long day = hours / 24;
		long dayNow = hours % 24;
		long month = day / 30;
		long monthNow = month % 12;
		long yearTotal = day % 365;
		long yearNow = yearTotal % 10;

		long decade = yearTotal / 10;
		long decadeNow = decade % 10;
		long century = decade / 10;
		long centuryNow = century % 10;
		long milenium = century / 10;

		System.out.println("Put u proslost bi trajao: \n" + milenium + " milenijuma, " + centuryNow + " stoljeca, "
				+ decadeNow + " desetljeca, " + yearNow + " godina, " + monthNow + " mjeseci, " + dayNow + " dana, "
				+ df.format(hoursNow) + " sati, " + df.format(minutesNow) + " minuta i " + df.format(secondsNow)
				+ " sekundi.");

	}

	/**
	 * metoda koja racuna predjenu distancu
	 * 
	 * @param year
	 */
	public static void distance(long year) {
		long totalCm = 75 * year;
		long cmNow = totalCm % 100;
		long totalM = totalCm / 100;
		long mNow = totalM % 1000;
		long kmNow = totalM / 1000;
		long soccerStadium = totalM / 105;
		long earthPerimeter = kmNow / 40075;
		System.out.println("Put koji bi presli iznosi: \n" + kmNow + " kilometara, " + mNow + " metara i " + cmNow
				+ " centimetara .");
		System.out.println("Prosjecan fudbalski stadion bi presli: " + soccerStadium
				+ " puta, a planetu Zemlju obisli: " + earthPerimeter + " puta. ");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long year = 0;
		try {

			System.out.println(
					"Upisite koliko godina zelite unazad (P.S. 31622400 sekundi je jedna godina cisto radi provjere): ");
			year = input.nextLong();
			if (year < 0) {
				System.out.println("Unos mora biti pozitivan.");
			} else {

				time(year);
				System.out.println();
				distance(year);
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan. ");

		}
		input.close();

	}

}

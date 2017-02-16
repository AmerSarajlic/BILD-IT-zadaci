package zadaci_16_02_2017;

import java.util.Scanner;

/**
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine
 * sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu
 * dvije taèke. Great circle distance izmeðu ove dvije taèke može biti
 * izraèunata koristeæi se sljedeæom formulom: d = radius * arccos (sin(x1) X
 * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program koij pita
 * korisnika da unese geografsku širinu i dužinu u stepenima dvije taèke na
 * površini zemlje te mu ispisuje great circle distance. Prosjeèni radius zemlje
 * je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse
 * koristeæi se Math.toRadians metodom jer Java trigonometrijske metode koriste
 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
 * Koristimo negativne vrijednosti da oznaèimo istok i jug.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	/**
	 * formula
	 * 
	 * @param x1
	 *            gs tacke1
	 * @param y1
	 *            gd tacke1
	 * @param x2
	 *            gs tacke2
	 * @param y2
	 *            gs tacke2
	 * @return udaljenost
	 */
	public static double greatCircleDistance(double x1, double y1, double x2, double y2) {
		double radius = 6371.01;
		return radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
				+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
	}

	/**
	 * validacija unosa geografske sirine
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isValidLatitude(double x) {
		if (x < -90 || x > 90) {
			return false;
		}
		return true;
	}

	/**
	 * validacija unosa geografske duzine
	 * 
	 * @param y
	 * @return
	 */
	public static boolean isValidLongitude(double y) {
		if (y < -180 || y > 180) {
			return false;
		}
		return true;
	}

	/**
	 * unos i validacija unosa, maximalni i minimalni unosi sirine i duzine
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;

		try {

			System.out.print("Upisite geografsku sirinu za tacku 1 (u stepenima): ");
			x1 = input.nextDouble();
			if (!isValidLatitude(x1)) {
				System.out.println("Geografska sirina mora biti u rasponu od -90 do +90 stepeni !!!");
			} else {
				System.out.print("Upisite geografsku duzinu za tacku 1 (u stepenima): ");
				y1 = input.nextDouble();
				if (!isValidLongitude(y1)) {
					System.out.println("Geografska duzina mora biti u rasponu od -180 do +180 stepeni !!!");
				} else {
					System.out.print("Upisite geografsku sirinu za tacku 2 (u stepenima): ");
					x2 = input.nextDouble();
					if (!isValidLatitude(x2)) {
						System.out.println("Geografska sirina mora biti u rasponu od -90 do +90 stepeni !!!");
					} else {
						System.out.print("Upisite geografsku duzinu za tacku 2 (u stepenima): ");
						y2 = input.nextDouble();
						if (!isValidLongitude(y2)) {
							System.out.println("Geografska duzina mora biti u rasponu od -180 do +180 stepeni !!!");

						} else {
							System.out.println("Great circle distance za unesene podakte iznosi: "
									+ greatCircleDistance(x1, y1, x2, y2) + " km.");
						}
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();

	}
}

package zadaci_14_02_2017;

import java.util.Scanner;

/**
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijece v, mozemo
 * izracunati minimalnu dužinu piste potrebne da avion uzleti koristeći se
 * sljedecom formulom: duzina = v * v / 2a. Napisati program koji pita korisnika
 * da unese v u m/s i a u m/s^2 te ispisuje korisniku minimalnu duzinu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje duzina piste je
 * 514.286)
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static double runway(double v, double a) {
		return Math.pow(v, 2) / (2 * a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double speed = 0;
		double acceleration = 0;
		try {
			System.out.print("Upisite brzinu kretanja aviona u metrima u sekundi: ");
			speed = input.nextDouble();
			if (speed < 0) {
				System.out.println("Brzina mora biti pozitivna. ");
			} else if (speed == 0) {
				System.out.println("Avion se ne krece. ");
			} else {
				System.out.print("Upisite ubrzanje aviona u metrima u sekundi na kvardat: ");
				acceleration = input.nextDouble();
				if (acceleration < 0) {
					System.out.println("Ubrzanje je negativno, sto znaci da avion usporava.");
				} else if (acceleration == 0) {
					System.out
							.println("Sa ovakvim ubrzanjem avion nece nikad poletjeti. Ubrzanje mora biti vece od 0 !");
				} else {
					System.out.println("Da bi avion uzletio, potrebna je pista duzine: " + runway(speed, acceleration)
							+ " metara.");
				}
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}

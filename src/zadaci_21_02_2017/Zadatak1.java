package zadaci_21_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una
 * koji treba uplatiti kao i procenat tog ra�una kojeg �elimo platiti kao
 * napojnicu te izra�unava ukupan ra�un i napojnicu. Na primjer, ukoliko
 * korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program treba da
 * ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5.
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Unesite iznos ra�una: ");
			double bill = input.nextDouble();
			if (bill <= 0) {
				System.out.print("Iznos racuna mora biti pozitivan broj !");
			} else {
				System.out.print("Unesite procenat napojnice: ");
				double tipPercentage = input.nextDouble();
				if (tipPercentage > 0) {
					System.out.println("Razmislite opet da li zelite dati napojnicu. ");
					calculateBillAndTip(bill, tipPercentage);
				} else if (tipPercentage == 0) {
					System.out.println("Tako je, ne treba napojnica !");
					calculateBillAndTip(bill, tipPercentage);
				}
				else{
					System.out.println("Napojnica ne moze biti manja od 0 %, inace 0 % je idealno. ");
				}
			}
		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();

	}

	public static void calculateBillAndTip(double bill, double tipPercentage) {
		DecimalFormat df = new DecimalFormat("##.##");
		double tip = bill * tipPercentage / 100;
		double total = bill + tip;
		System.out.println("Racun iznosi: " + df.format(total) + " od cega je napojnica: " + df.format(tip));

	}

}
package zadaci_14_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Napisati program koji ucitava iznos investicije, godisnju interesnu stopu i
 * broj godina te vraca buducu vrijednost investicije koristeci se sljedecom
 * formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao iznos
 * investicije 1000, 3.25 kao godisnju interesnu stopu i 1 kao broj godina
 * program vam vraca 1032.98 kao buducu vrijednost investicije.
 * 
 * @author amer
 *
 */

public class Zadatak1 {
	/**
	 * metoda koja vraca vrijednost investicije
	 * 
	 * @param investmentAmount - iznos investicije
	 * @param monthlyInterestRate - godisnja kamatna stopa
	 * @param years - broj godina
	 * @return iznos investicije za ostale parametre
	 */

	public static double futureInvestmentValue(double investmentAmount, double interestRate, int years) {

		return investmentAmount * (Math.pow(1 + (interestRate / 1200), years * 12));

	}

	/**
	 * u main validiramo upis i ispisujemo vrijednosti investicija, ispis radi
	 * na principu da za uneseni broj godina ispise vrijednosti povecanja
	 * investicije za sve godine prije konacne godine
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double investment = 0;
		double intrestRate = 0;
		int year = 0;
		DecimalFormat df = new DecimalFormat("##.##");
		try {
			System.out.print("Upisite iznos investicije: ");
			investment = input.nextDouble();
			if (investment < 0) {
				System.out.println("Investicija ne moze biti negativan broj !");
			} else if (investment == 0) {
				System.out.println("Niste nista ulozili !");
			} else {
				System.out.print("Upisite godisnju kamatnu stopu: ");
				intrestRate = input.nextDouble();
				if (intrestRate < 0) {
					System.out.println("Kamatna stopa ne moze biti negativna !");
				} else {
					System.out.print("Upisite broj godina: ");
					year = input.nextInt();
					if (year < 0) {
						System.out.println("Broj godina ne moze biti negativan !");
					} else if (year == 0) {
						System.out.println("Iznos je isti, jer nije proslo nista vremena i iznosi: " + investment);
					}

					else {
						System.out.println("\nGodina\t\tIznos\n-----------------------");

						for (int i = 1; i <= year; i++) {
							System.out
									.println(i + "\t\t" + df.format(futureInvestmentValue(investment, intrestRate, i)));
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
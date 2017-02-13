package zadaci_13_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusZadatak3 {

	/**
	 * metoda racuna broj kilometara, au, parseke i vrijeme za koje bi to
	 * helios2 presao
	 * 
	 * @param noly
	 */
	public static void distance(double noly) {
		DecimalFormat df = new DecimalFormat("##.##");
		long sec = 365 * 24 * 60 * 60;
		long ly = 299792458 * sec;
		long totalKilometers = (long) ((ly * noly) / 1000);
		double au = (totalKilometers) / 149600000 * noly;
		double parsec = 1 / 3.26 * noly;
		double timeHelios = totalKilometers / 252792.537;

		System.out.println(noly + " svjetlosnih godina iznosi: \n - " + totalKilometers + " kilometara\n - " + au
				+ " astronomskih jedinica\n - " + parsec
				+ " parseka\n Covjeku bi trebalo da preðe tu udaljenost sa Helios 2: " + df.format(timeHelios)
				+ " sati.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numberOfLightYears = 0;
		try {
			System.out.print("Upisite broj svjetlosnih godina: ");
			numberOfLightYears = input.nextDouble();
			distance(numberOfLightYears);
		} catch (Exception e) {
			System.out.println("Unos nije validan. ");
		}
		input.close();
	}

}

package zadaci_21_02_2017;

import java.util.Scanner;

/**
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva pakovanja.
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje
 * koje pakovanje ima bolju cijenu.
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight1 = 0;
		double weight2 = 0;
		double price1 = 0;
		double price2 = 0;

		try {
			System.out.print("Unesite težinu prvog pakovanja u kg: ");
			weight1 = input.nextDouble();
			if (weight1 <= 0) {
				System.out.print("Broj mora biti veci od 0. ");
			} else {
				System.out.print("Unesite cijenu prvog pakovanja u KM: ");
				price1 = input.nextDouble();
				if (price1 < 0) {
					System.out.print("Broj mora biti veci od 0.");
				} else {
					System.out.print("Unesite težinu drugog pakovanja u kg: ");
					weight2 = input.nextDouble();
					if (weight2 <= 0) {
						System.out.print("Broj mora biti veci od 0. ");
					} else {
						System.out.print("Unesite cijenu drugog pakovanja u KM: ");
						price2 = input.nextDouble();
						if (price2 <= 0) {
							System.out.println("Broj mora biti veci od 0. ");
						} else {

							double realCost1 = weight1 / price1;
							double realCost2 = weight2 / price2;
							if (realCost1 > realCost2) {
								System.out.println("Bolju cijenu ima prvo pakovanje.");
							} else if (realCost1 == realCost2) {
								System.out.println("Odnos cijene i kvaliteta je isti.");
							} else {
								System.out.println("Bolju cijenu ima drugo pakovanje.");

							}
						}
					}
				}
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();
	}

}
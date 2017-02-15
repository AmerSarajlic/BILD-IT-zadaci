package mini2_CrapsAndCreditCards;

import java.util.Scanner;

public class GameCraps {
	/*
	 * za pocetak igre potrebno upisati "start"
	 */

	public static void main(String[] args) {
		System.out.println("Type \"start\" (without quotation marks) to throw dices !!!");
		Scanner input = new Scanner(System.in);
		String str = input.next().toUpperCase();
		input.close();
		if (!str.equals("START")) {
			System.out.println("Invalid input !!!");
		} else {

			/*
			 * 2 random broja za kockice
			 */
			int dice1 = (int) (1 + Math.random() * 6);
			int dice2 = (int) (1 + Math.random() * 6);
			int point = 0;
			boolean playing = true;
			int sum = dice1 + dice2;

			while (playing) {

				/*
				 * ako su sume 2, 3 ili 12, gubimo
				 */
				if (sum == 2 || sum == 3 || sum == 12) {
					System.out.println("You rolled: " + dice1 + " + " + dice2 + " = " + sum + "\nYou lose !!!");
					playing = false;
				}
				/*
				 * ako je suma 7 ili 11 dobijamo
				 */
				else if (sum == 7 || sum == 11) {
					System.out.println("You rolled: " + dice1 + " + " + dice2 + " = " + sum + "\nYou win !!!");
					playing = false;
				}

				/*
				 * ako je suma neki drugi broj, taj broj se setuje kao point,
				 * kockice se ponovo roluju, sve dok se ne dobije taj isti broj
				 * (point) sto oznacava pobjedu ili dok se ne dobije 7 sto
				 * oznacava poraz
				 */
				else {
					System.out.println("You rolled: " + dice1 + " + " + dice2 + " = " + sum + "\nPoint is: " + sum
							+ "\n\nRolling again !!!");
					point = sum;
					do {
						dice1 = (int) (1 + Math.random() * 6);
						dice2 = (int) (1 + Math.random() * 6);
						sum = dice1 + dice2;

						if (sum == point) {
							System.out.println("You rolled: " + dice1 + " + " + dice2 + " = " + sum + "\nYou win !!!");
							playing = false;
						} else if (sum == 7) {
							System.out.println("You rolled: " + dice1 + " + " + dice2 + " = " + sum + "\nYou lose !!!");
							playing = false;
						} else {
							System.out.println(
									"You rolled: " + dice1 + " + " + dice2 + " = " + sum + "\n\nRolling again !!!");

						}

					} while (playing != false);

				}
			}

		}
	}
}

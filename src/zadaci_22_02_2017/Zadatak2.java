package zadaci_22_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše
 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
 * pobijedio, da li je raèunar pobijedio ili je bilo neriješeno.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {

			int computer = (int) (Math.random() * 3);

			System.out.print("makaze (0), kamen (1), papir(2): ");
			int player = input.nextInt();
			if (player < 0 || player > 2) {
				System.out.println("Unos nije validan !");
			} else {

				System.out.print("Racunar je ");
				switch (computer) {
				case 0:
					System.out.print("makaze.");
					break;
				case 1:
					System.out.print("kamen.");
					break;
				case 2:
					System.out.print("papir.");
				}

				System.out.print(" Igrac je ");
				switch (player) {
				case 0:
					System.out.print("makaze.");
					break;
				case 1:
					System.out.print("kamen.");
					break;
				case 2:
					System.out.print("papir.");
				}
				if (player == computer)
					System.out.println(" Nerjeseno \n");

				else if ((player == 0 && computer == 2) || (player == 1 && computer == 0)
						|| (player == 2 && computer == 1)) {
					System.out.println(" Igrac pobjedjuje\n");
				} else {
					System.out.println(" Racunar pobjedjuje\n");
				}
			}

			System.out.println();

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}

		input.close();
	}
}

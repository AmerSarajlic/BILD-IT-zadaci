package zadaci_13_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna. 
 */
public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int month = 0;
		int amount = 0;
		DecimalFormat df = new DecimalFormat("##.###");
		double totalAmount = 0;
		try {
			System.out.print("Upisite iznos stednje: ");
			amount = input.nextInt();
			if (amount < 0) {
				System.out.println("Unos ne moze biti negativan !");
			} else {
				System.out.print("Upisite broj mjeseci: ");
				month = input.nextInt();
				if (month < 0) {
					System.out.println("Broj mjeseci mora biti pozitivan !");
				} else if (month == 0) {
					System.out.println("Nije proslo nista vremena, imas isto para: " + amount);
				} else {
					for (int index = 0; index < month; index++) {
						totalAmount = (amount + totalAmount) * (1 + 0.00417);

					}
					System.out.print("Iznos nakon " + month + " je: " + df.format(totalAmount));
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan.");
		}
		input.close();
	}

}

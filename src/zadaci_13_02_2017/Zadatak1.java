package zadaci_13_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju interesnu stopu od 5%. 
 * Mjese�na interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na ra�unu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon tre�eg mjeseca, vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjese�ni iznos �tednje te broj mjeseci nakon kojeg bi �elio znati stanje ra�una. 
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

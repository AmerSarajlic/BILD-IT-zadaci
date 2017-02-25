package zadaci_24_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji prima ASCII kod (cijeli broj izmeğu 0 i 127) te
 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII
 * kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Unesite cijeli broj izmedju 0 i 127: ");
			number = input.nextInt();
			if (number > 0 && number <= 127) {
				System.out.print("ASCII kod " + number + " je za: " + ((char) number));
			} else {
				System.out.println("Unesite cijeli broj veæi od 0 i manji od 128.");
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();

	}

}
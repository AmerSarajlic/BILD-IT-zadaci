package zadaci_14_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve
 * karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik
 * unese string Beijing Chicago, program vraca BiigCiao.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	/**
	 * metoda koja ispisuje karaktere na neparnim pozicijama stringa
	 * 
	 * @param s string koji korisnik unese
	 */
	public static void displayOddString(String s) {

		for (int i = 0; i < s.length(); i += 2) {
			System.out.print(s.charAt(i));
		}
	}

	/**
	 * u mainu korisnikov unos prosljedjujemo metodi orginalno (str1) ali i kao
	 * string bez space (str2)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		try {
			System.out.print("Upisite string: ");
			str1 = input.nextLine();
			str2 = str1.replaceAll(" ", "");
			System.out.print("\nKarakteri na neparnim pozicijama (racunajuci i space) su: ");
			displayOddString(str1);
			System.out.print("\nKarakteri na neparnim pozicijama (ne racunajuci space) su: ");
			displayOddString(str2);
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}

		input.close();
	}

}

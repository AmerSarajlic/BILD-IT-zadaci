package zadaci_17_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i
 * ispisuje da li je drugi string substring prvog stringa. Na primjer, ukoliko
 * korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje
 * da je BC substring ABCD stringa.
 * 
 * @author amer
 *
 */
public class Zadatak5 {
	/**
	 * provjeravamo jel substring
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isSubstring(String str1, String str2) {
		if (str1.contains(str2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite prvi string: ");
		String str1 = input.nextLine();
		System.out.print("Upisite drugi string: ");
		String str2 = input.nextLine();
		if (str1.length() < str2.length()) {
			System.out.println("Drugi string ne moze biti substring prvog jer je duzi od njega !");
		} else {
			System.out.println(isSubstring(str1, str2) ? "Drugi string je substring prvog. "
					: "Drugi string nije substring prvog.");
			input.close();
		}

	}

}

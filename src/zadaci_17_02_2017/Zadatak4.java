package zadaci_17_02_2017;

import java.util.Scanner;

/**
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u
 * stringu. Metoda treba da koristi sljedeæi header: public static int
 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na sljedeæi
 * naèin: count("Welcome", e) metoda treba da vrati 2. Napisati program koji
 * pita korisnika da unese string i koji karakter želi da prebroji u datom
 * stringu te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom
 * stringu.
 * 
 * @author amer
 *
 */
public class Zadatak4 {
/**
 * @param str uneseni string
 * @param a uneseni karakter
 * @return broj karaktera
 */
	public static int count(String str, char a) {

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				counter++;
			}
		}
		return counter;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		char ch = '-';
		String strCh = "";
		try {
			System.out.print("Upisite string: ");
			str = input.nextLine();
			System.out.print("Upisite karakter: ");
			strCh = input.next();
			if(strCh.length() != 1){
				System.out.println("Unos nije validan. Unos mora biti jedan karakter !");
			}
			else{
				ch = strCh.charAt(0);
				System.out.println("Broj karaktera: " + ch + " u datom stringu je: " + count(str, ch));
			}


		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();

	}

}

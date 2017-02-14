package zadaci_13_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix 
 * za ta dva stringa, ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeæa dva stringa 
 * "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki 
 * prefix za dva stringa je "Dobrodošli u". 
 */
public class Zadatak3 {
/**
 * upisujemo 2 string, odmah provjeravamo jel prvi index zajednicki
 * ako nije, ispis da nema zajednicki prefix, ako jest poredimo koliko
 * zajednickih elemenata ima
 * 
 * @param args
 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		try {
			System.out.print("Upisite prvi string: ");
			str1 = input.nextLine().toLowerCase();
			System.out.print("Upisite drugi string: ");
			str2 = input.nextLine().toLowerCase();
			if (str1.charAt(0) != str2.charAt(0)) {
				System.out.println("Nema zajednicki prefiks !");
			} else {
				int[] array = { str1.length(), str2.length() };
				java.util.Arrays.sort(array);
				for (int i = 0; i < array[0]; i++) {
					if (str1.charAt(i) == str2.charAt(i)) {
						System.out.print(str1.charAt(i));
					} else {
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan ! ");
			input.nextLine();
		}
		input.close();

	}

}

package zadaci_03_04_2017;

import java.util.Scanner;

public class Zadatak2 {

	/**
	 * Metoda racuna gdc, s tim da u obzir uzima ako se unesu negativni int
	 * brojevi, njihov najveci zajednicki djelilac je pozitivan broj, npr. za
	 * -100 i -10, najveci zajednicki djelilac nije -10 niti -2 vec je broj 10
	 */
	private static int gcd(int m, int n) {
		int a = Math.abs(m);
		int b = Math.abs(n);
		if (a % b == 0)
			return b;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0;
		int n = 0;

		try {
			System.out.print("Upisite prvi broj: ");
			m = input.nextInt();
			if (m == 0) {
				System.out.println("Nula se ne moze dijeliti !!!");
			} else {
				System.out.print("Upisite drugi broj: ");
				n = input.nextInt();
				if (n == 0) {
					System.out.println("Nula se ne moze dijeliti !!!");
				} else {
					System.out.println("Najveci zajednicki djelilac za brojeve " + m + " i " + n + " je " + gcd(m, n) + ".");
				}
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}

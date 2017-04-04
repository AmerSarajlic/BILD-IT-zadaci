package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak1 {

	private static void reverseDisplay(int number) {

		// koristim abs vrijednost jer -12 naopako je u mom slucaju 21- :D a ne
		// -21, nekako mi tako logicnije ako se vec trazi ispis naopako

		int num = Math.abs(number);
		if (num < 10)
			System.out.print(num);
		else {
			System.out.print(num % 10);
			reverseDisplay(num / 10);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Upisite intedzer: ");
		int number = 0;

		try {
			number = input.nextInt();
			reverseDisplay(number);
			if (number < 0) {
				// u slucaju da je uneseni int negativan minus dodajemo na kraj
				// ispisa
				System.out.print("-");
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}

package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak2 {

	private static void reverseDisplay(String str) {
		if (str.length() == 1)
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverseDisplay(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Upisite string: ");
		String str = null;
		try {
			str = input.nextLine();
			reverseDisplay(str);

		} catch (Exception e) {
			System.out.print("Unos nije validan !!!");
		}
		input.close();
	}

}

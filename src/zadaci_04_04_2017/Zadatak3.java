package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static int count(String str, char a) {
		int index = 0;
		int count = 0;
		return count(str, a, index, count);
	}

	private static int count(String str, char a, int i, int count) {
		if (i == str.length())
			return count;
		else if (str.charAt(i) == a)
			return count(str, a, ++i, ++count);
		else
			return count(str, a, ++i, count);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisie string: ");
		String str = input.nextLine();
		System.out.print("Upisite karakter: ");
		char ch = input.next().charAt(0);

		System.out.println(
				"Karakter \"" + ch + "\" u stringu \"" + str + "\" se pojavljuje " + count(str, ch) + " puta.");

		input.close();
	}

}

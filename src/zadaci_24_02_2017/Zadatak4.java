package zadaci_24_02_2017;

import java.util.Scanner;

/**
 * Napisati metodu sa sljede�im headerom: public static String format(int
 * number, int width) koja vra�a string broja sa prefiksom od jedne ili vi�e
 * nula. Veli�ina stringa je width argument. Na primjer, ukoliko pozovemo metodu
 * format(34, 4) metoda vra�a 0034, ukoliko pozovemo format(34, 5) metoda vra�a
 * 00034. Ukoliko je uneseni broj ve�i nego width argument, metoda vra�a samo
 * string broja. Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	public static String format(int number, int width) {

		String num = number + "";
		if (num.length() > width) {
			return num;
		} else {
			int zeroesCount = width - num.length();
			String zeroes = "";
			for (int i = 0; i < zeroesCount; i++) {
				zeroes = zeroes + "0";
			}
			return zeroes + num;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int width = 0;
		try {
			System.out.print("Unesite cijeli broj: ");
			number = input.nextInt();
			System.out.print("Unesite du�inu stringa: ");
			width = input.nextInt();
			if (number > 0 && number < 2000000000 && width > 0 && width < 50) {
				System.out.println(format(number, width));
			} else {
				System.out.println(
						"Unos mora biti cijeli broj ve�i od 0 i manji od 2000000000, a du�ina ve�a od 0 i manju od 50");
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan !");
		}
		input.close();

	}

}
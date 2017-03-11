package zadaci_10_03_2017;

public class Zadatak1 {

	public static int bin2Dec(String binary) throws NumberFormatException {

		if (!isBinary(binary)) {
			throw new NumberFormatException("Broj: " + binary + " nije binarni broj.");
		}
		int power = 0;
		int decimal = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {

			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		}
		return decimal;
	}

	public static boolean isBinary(String binary) {

		for (char ch : binary.toCharArray()) {
			if (ch != '1' && ch != '0')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(bin2Dec("1100100"));
		System.out.println(bin2Dec("123dwa21"));
	}
}

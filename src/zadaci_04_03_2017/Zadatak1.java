package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak1 {

	public static void main(String[] args) {

		String numString = "" + 1;
		for (int i = 0; i < 49; i++) {

			numString += "0";
		}

		BigDecimal number = new BigDecimal(numString);
		int counter = 0;
		while (counter < 10) {

			BigDecimal remainder2 = number.remainder(new BigDecimal(2));
			BigDecimal remainder3 = number.remainder(new BigDecimal(3));
			if (remainder2.equals(BigDecimal.ZERO) || remainder3.equals(BigDecimal.ZERO)) {
				counter++;
				System.out.println(counter + ": " + number);
			}
			number = number.add(BigDecimal.ONE);
		}
	}
}

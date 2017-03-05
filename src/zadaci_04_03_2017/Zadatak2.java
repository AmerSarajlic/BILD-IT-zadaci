package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak2 {

	public static void main(String[] args) {

		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		long start = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal n = new BigDecimal(start);
		int count = 0;

		while (count < 10) {

			BigDecimal squared = n.multiply(n);
			if (squared.compareTo(longMaxValue) > 0) {
				count++;
				System.out.println(count + ": " + n + " korjenovan = " + squared);
			}
			n = n.add(BigDecimal.ONE);
		}
	}

}

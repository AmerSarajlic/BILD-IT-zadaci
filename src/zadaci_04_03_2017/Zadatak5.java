package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak5 {

	public static void main(String[] args) {

		int count = 0;
		BigDecimal num = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
		while (count < 10) {

			if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)
					|| num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
				count++;
				System.out.println(count + ": " + num);
			}
			num = num.add(BigDecimal.ONE);
		}
	}
}

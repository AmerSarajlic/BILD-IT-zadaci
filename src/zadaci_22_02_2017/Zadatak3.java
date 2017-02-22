package zadaci_22_02_2017;

import java.text.DecimalFormat;

/**
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 +
 * 11/13 ..... + 95/97 + 97/99.
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##.###");
		double suma = 0;
		for (int i = 1; i <= 97; i += 2) {

			suma += i / (i + 2.0);

		}
		System.out.println("Suma je: " + df.format(suma));
	}

}

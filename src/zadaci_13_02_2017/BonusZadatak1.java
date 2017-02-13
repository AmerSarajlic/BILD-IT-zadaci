package zadaci_13_02_2017;

import java.util.Scanner;

public class BonusZadatak1 {
	/**
	 * metoda koja prihvata uneseni string i kreira vrijednosti number1 i
	 * number2, pronalazi koju je operaciju potrebno izvrsiti i vraca rezultat
	 * 
	 * 
	 * @param calculation
	 * @return
	 */
	public static double calculate(String calculation) {
		if (!(calculation.contains("+") || calculation.contains("-") || calculation.contains("*")
				|| calculation.contains("/") || calculation.contains("%") || calculation.contains("s")
				|| calculation.contains("k"))) {
			return Double.parseDouble(calculation);
		}

		double result = 0;
		for (int i = 0; i < calculation.length() - 1; i++) {

			char symbol = calculation.charAt(i);

			if (!Character.isDigit(symbol) && i != 0) {

				double number1 = Double.parseDouble(calculation.substring(0, i));
				double number2 = Double.parseDouble(calculation.substring(i + 1));

				if (calculation.charAt(0) == '-') {
					number1 = 0 - (Double.parseDouble(calculation.substring(1, i)));
					number2 = Double.parseDouble(calculation.substring(i + 1));

				}

				switch (symbol) {
				case '+':
					result = number1 + number2;
					break;
				case '-':
					result = number1 - number2;
					break;
				case '*':
					result = number1 * number2;
					break;
				case '/':
					result = number1 / number2;
					break;
				case '%':
					result = number1 % number2;
					break;
				case 's':
					result = Math.pow(number1, number2);
					break;
				case 'k':
					result = Math.pow(number1, 1 / number2);
					break;
				}
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String calculation = "";
		try {
			System.out.println(
					"Kalkulator, format unosa (X + Y), (X s Y), (X k n - n-ti korjen iz X)... \nOperacije: +, -, *, /, %, s (na kvadrat), k (kvadratni korjen)\n");
			System.out.print("Upisite izraz koji zelite izracunati: ");
			calculation = input.nextLine().replaceAll(" ", "");
			double result = calculate(calculation);
			System.out.println(calculation + " = " + result);

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}

		input.close();
	}

}

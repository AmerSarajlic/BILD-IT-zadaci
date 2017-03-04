package zadaci_03_03_2017;

import java.util.Scanner;

public class PrimeFactorsMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Upisite pozitivan int broj: ");
		try {

			int num = input.nextInt();

			StackOfIntegers stack = new StackOfIntegers(20);

			int factor = 2;
			while (factor <= num) {
				if (num % factor == 0) {
					stack.push(factor);
					num /= factor;
				} else {
					factor++;
				}
			}
			while (!stack.empty()) {
				System.out.print(stack.pop() + " ");
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}
}

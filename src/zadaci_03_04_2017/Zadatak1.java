package zadaci_03_04_2017;

import java.util.Scanner;

public class Zadatak1 {

	/**
	 * metoda pronalazi fib broj
	 * 
	 * @param index
	 * @return
	 */
	public static long fib(long index) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;

		if (index == 0)
			return f0;
		else if (index == 1)
			return f1;
		else {
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
			return currentFib;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Upisite index za fibonacijev broj: ");
		int index = 0;

		try {
			index = input.nextInt();
			if (index < 1) {
				System.out.println("Index mora biti pozitivan broj !!!");
			} else {
				System.out.println("Fibonacijev broj na indexu: " + index + " je: " + fib(index) + " .");
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}

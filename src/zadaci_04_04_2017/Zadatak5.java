package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static int max(int[] list) {
		int max = list[list.length - 1];
		int index = list.length - 1;
		return max(list, index, max);
	}

	private static int max(int[] list, int index, int max) {
		if (index < 0)
			return max;
		else if (list[index] > max) {
			return max(list, index - 1, list[index]);
		} else
			return max(list, index - 1, max);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Upisite osmicu int brojeva: ");
		int[] list = new int[8];
		try {
			for (int i = 0; i < list.length; i++) {
				list[i] = input.nextInt();
			}
			System.out.println("Najveci element je: " + max(list) + ".");
		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}
}

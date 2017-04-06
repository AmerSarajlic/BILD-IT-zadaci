package zadaci_05_04_2017;

public class Zadatak2 {

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		Integer[] list = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int number = 3;
		System.out.print("Broj: " + number + " se nalazi na: " + linearSearch(list, number) + ". indexu.");
	}

}

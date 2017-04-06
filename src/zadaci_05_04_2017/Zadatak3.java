package zadaci_05_04_2017;

public class Zadatak3 {

	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(max) > 0)
				max = list[i];
		}
		return max;
	}

	public static void main(String[] args) {
		
		Integer[] list = { 0, 1, 22, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Max element liste je: " + max(list) + ".");
	}
}

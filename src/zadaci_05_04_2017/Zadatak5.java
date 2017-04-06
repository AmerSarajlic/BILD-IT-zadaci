package zadaci_05_04_2017;

public class Zadatak5 {

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (list[mid].compareTo(key) == 0)
				return mid;
			else if (list[mid].compareTo(key) > 0)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -low - 1;
	}

	public static void main(String[] args) {

		Integer[] list = { 5, 7, 11, 44, 55, 77, 78, 79, 84, 88, 99 };
		System.out.println(binarySearch(list, 11));
		System.out.println(binarySearch(list, 7));
		System.out.println(binarySearch(list, 77));
	}
}

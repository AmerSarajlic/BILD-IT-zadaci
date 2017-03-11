package zadaci_10_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {

		try {
			int[] temp = new int[1000000000];
			temp = new int[temp.length * 1000000000];
		} catch (OutOfMemoryError ex) {
			ex.printStackTrace();
		}
	}
}

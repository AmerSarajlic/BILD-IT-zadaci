package zadaci_03_04_2017;

public class Zadatak5 {

	private static double m(double i) {
		if (i <= 0)
			return 0;
		else
			return i / (i + 1) + m(i - 1);
	}

	public static void main(String[] args) {
		System.out.println("\n i    m(i)");
		System.out.println("-----------");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%2d%8.2f\n", i, m(i));
		}
	}

}

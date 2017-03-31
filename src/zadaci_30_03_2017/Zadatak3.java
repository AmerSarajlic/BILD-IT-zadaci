package zadaci_30_03_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		// 2 circlea
		ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
		ComparableCircle comparableCircle2 = new ComparableCircle(18.3);

		// ispis kruznica
		System.out.println("\nKruznica jedan:");
		System.out.println(comparableCircle1);
		System.out.println("\nKruznica dva:");
		System.out.println(comparableCircle2);

		// ispis vece kruznice
		System.out.println(
				(comparableCircle1.compareTo(comparableCircle2) == 1 ? "\nPrva kruznica " : "\nDruga kruznica ")
						+ "je veca !");
	}
}

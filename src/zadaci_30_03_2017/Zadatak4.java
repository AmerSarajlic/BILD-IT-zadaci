package zadaci_30_03_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		// niz od 5 kvadrata
		GeometricObject[] squares = { new Square(4.5), new Square(14), new Square(8.2), new Square(12),
				new Square(10) };

		// povrsina i farbanje
		for (int i = 0; i < squares.length; i++) {
			System.out.println("\nKvadrat #" + (i + 1));
			System.out.println("Povrsina: " + squares[i].getArea());
			System.out.println("Kako ofarbat: " + ((Square) squares[i]).howToColor());
		}
	}
}

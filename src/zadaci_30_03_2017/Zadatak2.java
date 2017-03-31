package zadaci_30_03_2017;

public class Zadatak2 {

		// ispis cisto malo radi preglednosti
		public static void print(String s) {
			System.out.println(s);
		}

		// ispis objekata isto radi preglednosti :D
		public static void print(GeometricObject o) {
			System.out.println(o);
		}
	
	public static void main(String[] args) {
		
		// pravimo 2 kruznice
		Circle circle1 = new Circle(15, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		// podaci o kruznicama
		System.out.println("\nCircle 1: ");
		print(circle1);
		System.out.println("\nCircle 2: ");
		print(circle2);

		// ispis vece kruznice
		print("\nVeca od dvije kruznice je: ");
		print(Circle.max(circle1, circle2));

		// kreiranje 2 pravougaonika
		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		// prvi pravougaonik
		System.out.println("\nRectangle 1: ");
		print(circle1);

		// drugi pravougaonik
		System.out.println("\nRectangle 2: ");
		print(circle2);

		// ispis veceg
		print("\nVeci od dva pravougaonika je: ");
		print(Rectangle.max(rectangle1, rectangle2));
	}

}

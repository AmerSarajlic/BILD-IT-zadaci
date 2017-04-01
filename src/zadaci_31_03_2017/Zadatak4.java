package zadaci_31_03_2017;

public class Zadatak4 {

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		GeometricObject[] array = { new Circle(5), new Circle(8), new Rectangle(3, 4), new Rectangle(4, 2) };
		System.out.println("Ukupna povrsina objekata je: " + sumArea(array));
	}
}

package zadaci_03_03_2017;

public class MyPointMain {

	public static void main(String[] args) {

		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);

		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(1, 0));

	}
}

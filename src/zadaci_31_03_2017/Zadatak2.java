package zadaci_31_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3, 5, "blue", true);
		Rectangle r2 = new Rectangle(5, 3, "gray", false);
		Rectangle r3 = new Rectangle(3.1, 5, "blue", true);

		System.out.println("Rectangle1 povrsina:" + r1.getArea());
		System.out.println("Rectangle2 povrsina:" + r2.getArea());
		System.out.println("Rectangle3 povrsina:" + r3.getArea());

		System.out.println("Rectangle1 " + (r1.equals(r2) ? "" : "nije ") +
			"jednak Rectangle2.");

		System.out.println("Rectangle1 " + (r1.equals(r3) ? "" : "nije ") +
			"jednak Rectangle3.");
	}
}

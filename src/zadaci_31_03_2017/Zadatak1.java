package zadaci_31_03_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(5, "green", false);
		Circle circle3 = new Circle(4, "green", false);

		System.out.println("Circle1 poluprecnik: " + circle1.getRadius());
		System.out.println("Circle2 poluprecnik: " + circle2.getRadius());
		System.out.println("Circle3 poluprecnik: " + circle3.getRadius());

		System.out.println("Circle1 " + (circle1.equals(circle2) ? "" : "nije ") + "jednak circle2.");

		System.out.println("Circle1 " + (circle1.equals(circle3) ? "" : "nije ") + "jednak circle3.");
	}
}

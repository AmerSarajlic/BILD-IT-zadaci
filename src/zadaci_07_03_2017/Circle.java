package zadaci_07_03_2017;

public class Circle {

	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Radius: " + radius + ", Area: " + getArea();
	}

}

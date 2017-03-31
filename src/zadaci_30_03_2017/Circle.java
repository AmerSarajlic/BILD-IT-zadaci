package zadaci_30_03_2017;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override // povrsina
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// precnik
	public double getDiameter() {
		return 2 * radius;
	}

	@Override // obim
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override // podaci o kruznici
	public String toString() {
		return super.toString() + "\nPoluprecnik: " + radius + "\nPovrsina: " + getArea() + "\nPrecnik: " + getDiameter()
				+ "\nObim: " + getPerimeter();
	}
}

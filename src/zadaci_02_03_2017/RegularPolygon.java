package zadaci_02_03_2017;

public class RegularPolygon {

	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;

	}

	public RegularPolygon(int numberOfSides, double sideLength) {
		this();
		side = sideLength;
		n = numberOfSides;

	}

	public RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
		this(numberOfSides, sideLength);
		this.x = x;
		this.y = y;
	}

	public int getNumberOfSides() {
		return n;
	}

	public void setNumberOfSides(int numberOfSides) {
		n = numberOfSides;
	}

	public double getSideLength() {
		return side;
	}

	public void setSideLength(double sideLength) {
		side = sideLength;
	}

	public double getCenterY() {
		return y;
	}

	public void setCenterY(double centerY) {
		y = centerY;
	}

	public double getCenterX() {
		return x;
	}

	public void setCenterX(double centerX) {
		x = centerX;
	}

	public double getPerimeter() {

		return n * side;
	}

	public double getArea() {

		return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
	}

}

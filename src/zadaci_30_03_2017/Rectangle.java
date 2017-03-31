package zadaci_30_03_2017;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	@Override // vraca povrsinu
	public double getArea() {
		return width * height;
	}

	@Override // vraca obim
	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override // podaci o pravougaoniku
	public String toString() {
		return super.toString() + "\nSirina: " + width + "\nVisina: " + height + "\nPovrsina: " + getArea() + "\nObim: "
				+ getPerimeter();
	}
}

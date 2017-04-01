package zadaci_31_03_2017;

public abstract class GeometricObject {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "Kreiran " + dateCreated + "\nBoja: " + color + " Popunjen: " + filled;
	}

	/** abstraktna metoda getArea */
	public abstract double getArea();

	/** abstraktna metoda getPerimeter */
	public abstract double getPerimeter();

}
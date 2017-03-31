package zadaci_30_03_2017;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	/** default geo object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** konstruktor sa svim parametrima */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// geteri i seteri	
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
		return "Datum: " + dateCreated + "\nBoja: " + color + "\nPopunjen: " + filled;
	}

	@Override // implementacija komparable 
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	/** abstraktna metoda get max */
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}

	/** abstraktna metoda za dobijanje povrsine */
	public abstract double getArea();

	/** abstraktna metoda za dobijanje obima */
	public abstract double getPerimeter();
}

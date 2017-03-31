package zadaci_30_03_2017;

public class ComparableCircle extends Circle {

	public ComparableCircle() {
	}

	/** komparable kruznica sa poluprecnikom */
	public ComparableCircle(double radius) {
		super(radius);
	}

	/** komparable kruznica sa svim parametrima */
	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override // implementacija toString
	public String toString() {
		return super.toString() + "\nPovrsina: " + getArea();
	}
}

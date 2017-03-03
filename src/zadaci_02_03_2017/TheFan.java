package zadaci_02_03_2017;

public class TheFan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public TheFan() {
		this.setSpeed(SLOW);
		this.setOn(false);
		this.setRadius(5);
		this.setColor("blue");
	}

	public String toString() {
		if (on = true) {
			return "Brzina je: " + getSpeed() + ", boja: " + getColor()
					+ " i radius: " + getRadius();
		} else {
			return "Boja je: " + getColor() + ", radius: " + getRadius()
					+ ". Ventilator je iskljucen.";
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
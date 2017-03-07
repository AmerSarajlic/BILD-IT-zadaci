package zadaci_07_03_2017;

import java.util.Date;

public class GeometricObject {

	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;

	public GeometricObject() {
		dateCreated = new Date();
	}

	public GeometricObject(String color, boolean filled) {
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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Created on " + this.dateCreated + "\ncolor " + this.color + " and filled " + this.filled;
	}

}
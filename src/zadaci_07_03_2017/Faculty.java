package zadaci_07_03_2017;

public class Faculty extends Person {

	protected String officeHours;
	protected String rank;

	public Faculty() {

	}

	public Faculty(String name) {
		this(name, "7-3PM", "Employee");
	}

	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Faculty name: " + getName();
	}
}

package zadaci_07_03_2017;

public class Staff extends Employee {

	private String title;

	public Staff() {

	}

	public Staff(String name) {
		this(name, "none");

	}

	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Staff name: " + getName() + "\nTitle: " + this.title;
	}
}

package zadaci_07_03_2017;

public class Employee extends Person {

	private String office;
	private double salary;
	private MyDate dateHired = new MyDate();

	public Employee() {

	}

	public Employee(String name) {
		this(name, "none", 0, new MyDate());
	}

	public Employee(String name, String office, double salary) {
		super(name);
		this.office = office;
		this.salary = salary;
	}

	public Employee(String name, String office, double salary, MyDate dateHired) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee name: " + getName() + "\nOffice: " + this.office + "\nSalary: " + this.salary
				+ "\nDate hired: " + this.dateHired;
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

}

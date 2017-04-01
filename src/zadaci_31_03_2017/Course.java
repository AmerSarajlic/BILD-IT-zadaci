package zadaci_31_03_2017;

public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	@Override 
	public Course clone() throws CloneNotSupportedException {
		// shallow copy
		Course courseClone = (Course) super.clone();
		// Deep copy
		courseClone.students = students.clone();
		return courseClone;
	}

	
}

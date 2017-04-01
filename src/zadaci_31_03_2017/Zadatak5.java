package zadaci_31_03_2017;

public class Zadatak5 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1 = new Course("Data Structures");

		course1.addStudent("Amer Sarajlic");
		course1.addStudent("Leonidas");
		course1.addStudent("Nub Nuberski");

		Course course2 = course1.clone();
		course2.addStudent("Neko Nekako");
		course2.addStudent("Beze Beze");

		System.out.println("Broj studenata u course1: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();

		System.out.println("\nBroj studenata u course2: " + course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");
		System.out.println();
	}
}

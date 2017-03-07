package zadaci_07_03_2017;

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person("Amer", "Tesanj", "000 111 111", "amer@hotmail.com");
		Student student = new Student("Amer", "senior");
		Employee employee = new Employee("Amer", "Direktor", 5000);
		Faculty faculty = new Faculty("Amer");
		Staff staff = new Staff("Amer");

		System.out.println(person.toString());
		System.out.println();
		System.out.println(student.toString());
		System.out.println();
		System.out.println(employee.toString());
		System.out.println();
		System.out.println(faculty.toString());
		System.out.println();
		System.out.println(staff.toString());

	}

}

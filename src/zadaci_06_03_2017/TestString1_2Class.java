package zadaci_06_03_2017;

public class TestString1_2Class {

	public static void main(String[] args) {

		System.out.println(new MyString1("Bla bla bla.").toChars());
		MyString1 s1 = new MyString1("String1");
		MyString1 s2 = new MyString1("String1");
		System.out.println("s1 = " + s1.toString());
		System.out.println("s2 = " + s2.toString());
		System.out.println("s1 = s2 ? " + s1.compare(s2));
		System.out.println(
				"false to uppercase " + (MyString1.valueOf(false).toUpperCase().toString()));
		System.out.println("Vrijednost true = " + (MyString1.valueOf(true).toString()));

	}
}

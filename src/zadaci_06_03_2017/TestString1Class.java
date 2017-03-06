package zadaci_06_03_2017;

public class TestString1Class {

	public static void main(String[] args) {

		MyString1 number = MyString1.valueOf(987654321L);
		System.out.println(number.toChars());
		MyString1 str = new MyString1("Test123");
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.equals(new MyString1("Test123")));
		System.out.print(MyString1.valueOf(345).toChars());
	}
}

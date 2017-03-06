package zadaci_06_03_2017;

public class TestStringBuilderClass {

	public static void main(String[] args) {

		MyStringBuilder1 s = new MyStringBuilder1("AmerSarajlic");
		System.out.println(s.toString());
		System.out.println(s.append(100).toString());
		System.out.println(s.toString());
		System.out.println("lowercase = " + s.toLowerCase());
		System.out.println("substring 0 3: " + s.substring(0, 3));

	}
}

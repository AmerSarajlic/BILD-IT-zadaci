package zadaci_06_03_2017;

public class TestString1_3Class {

	public static void main(String[] args) {

		String[] temp1 = MyString1.split("AmerSaAmerSaAmer", "Sa");
		for (String s : temp1) {
			System.out.println(s);
		}

		String[] temp2 = MyString1.split("ab#12#aba#123#abab#1234", "#");
		for (String s : temp2) {
			System.out.println(s);
		}
	}
}

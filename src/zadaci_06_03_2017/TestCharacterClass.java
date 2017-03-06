package zadaci_06_03_2017;

public class TestCharacterClass {

	public static void main(String[] args) {
		MyCharacter ch = new MyCharacter('A');
		System.out.println("ch = " + ch.getChar());
		System.out.println("Slovo: " + ch.isLetter());
		System.out.println("Broj: " + ch.isDigit());
		System.out.println("A == A ? " + ch.equals(new MyCharacter('A')));
	}
}
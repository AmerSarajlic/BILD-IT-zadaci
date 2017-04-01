package zadaci_31_03_2017;

public class Zadatak3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon(5);
		System.out.println("Octagon:\nPovrsina: " + octagon1.getArea() + "\nObim: " + octagon1.getPerimeter());
		System.out.println("Cloning Octagon...");
		Octagon octagon2 = (Octagon) octagon1.clone();
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon je veci od svog klona.");
		else if (result == -1)
			System.out.println("Octagon je manji od svoga klona.");
		else
			System.out.println("Octagon je jednak klonu.");
	}
}

package zadaci_02_03_2017;

public class TestFan {

	public static void main(String[] args) {
		TheFan ventilator = new TheFan();
		System.out.println("Default ventilator: " + ventilator.toString());
		ventilator.setColor("Zelena");
		ventilator.setOn(true);
		ventilator.setRadius(20);
		ventilator.setSpeed(ventilator.FAST);
		System.out.println("Custom ventilator: " + ventilator.toString());
	}

}

package zadaci_28_02_2017;

public class Zadatak3 {
	private double startTime;
	private double endTime;

	public Zadatak3() {
		startTime = System.currentTimeMillis();
	}

	void start() {
		this.startTime = System.currentTimeMillis();
	}

	void stop() {
		this.endTime = System.currentTimeMillis();
	}

	double getElapsedTime() {
		return endTime - startTime;
	}

}

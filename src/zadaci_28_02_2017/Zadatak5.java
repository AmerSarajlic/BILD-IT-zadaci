package zadaci_28_02_2017;

public class Zadatak5 {
	public int row, column;
	public double maxValue;

	public static Zadatak5 locateLargest(double[][] matrix) {
		Zadatak5 location = new Zadatak5();
		location.maxValue = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] > location.maxValue) {
					location.maxValue = matrix[row][column];
					location.row = row;
					location.column = column;
				}
			}
		}
		return location;
	}
}

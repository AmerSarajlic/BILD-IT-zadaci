package zadaci_05_04_2017;

public class Zadatak4 {

	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j].compareTo(max) > 0)
					max = list[i][j];
			}
		}
		return max;
	}
	
	public static void randomNumbers(Integer[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int)(10 + Math.random() * 90);
			}
		}
	}
	
	public static void displayMatrix(Integer[][]matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Integer[][] matrix = new Integer[5][5];
		randomNumbers(matrix);
		displayMatrix(matrix);
		System.out.println("Max element matrice je: " + max(matrix) + ".");
	}

}

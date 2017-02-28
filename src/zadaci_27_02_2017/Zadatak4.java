package zadaci_27_02_2017;

/**
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header: public static void sort(int m[][]) The method
 * performs a primary sort on rows and a secondary sort on columns. For example,
 * the following array
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	public static void sortElements(int m[][]) {

		for (int i = 0; i < m.length - 1; i++) {
			int minIndex = i;
			int[] minValue = m[i];
			for (int j = i + 1; j < m.length; j++) {
				if (minValue[0] > m[j][0] || minValue[0] == m[j][0] && minValue[1] > m[j][1]) {
					minValue = m[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				m[minIndex] = m[i];
				m[i] = minValue;
			}
		}

	}

	public static void displayMatrix(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			System.out.print(i + " --> ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	public static void randomNumbers(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 10);
			}
		}
	}

	public static void main(String[] args) {

		int[][] matrix = new int [10][2];
		System.out.println("Random matrica: ");
		randomNumbers(matrix);
		displayMatrix(matrix);
		sortElements(matrix);
		System.out.println("\nSortirana matrica: ");
		displayMatrix(matrix);

	}
}
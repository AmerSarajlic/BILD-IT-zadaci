package mini3_Connect4_Tic_tac_toe;

import java.util.Scanner;

public class Connect_4 {
	static Scanner input = new Scanner(System.in);

	/**
	 * display polja za igru
	 * 
	 * @param connectFourGrid
	 */
	public static void displayGrid(char[][] connectFourGrid) {

		for (int i = 0; i < connectFourGrid.length; i++) {
			for (int j = 0; j < connectFourGrid[i].length; j++) {
				System.out.print("|" + connectFourGrid[i][j]);
			}
			System.out.println("|");
		}
		for (int i = 0; i < connectFourGrid.length - 1; i++) {
			System.out.print("---");
		}

	}

	/**
	 * unos i validacija unosa igraca, kao i naizmjenicna igra 2 igraca
	 * 
	 * @param connectFourGrid
	 */
	public static void playConnectFour(char[][] connectFourGrid) {
		boolean gameOver = false;
		boolean playersTurn = true;
		int columnPosition = 0;
		char chipColor;
		try {

			while (!gameOver) {

				if (playersTurn) {
					System.out.print("\nUpisite R disk u kolonu (0-6): ");
					chipColor = 'R';
					playersTurn = !playersTurn;
				} else {
					System.out.print("\nUpisite Y disk u kolonu (0-6): ");
					chipColor = 'Y';
					playersTurn = !playersTurn;
				}
				columnPosition = input.nextInt();
				while (columnPosition < 0 || columnPosition > 6) {
					System.out.print("Broj mora biti izmedju 0 i 6, pokusajte ponovo:  ");
					columnPosition = input.nextInt();
					playersTurn = !playersTurn;
				}
				if (dropChip(connectFourGrid, columnPosition, chipColor)) {
					playersTurn = !playersTurn;
				} else {
					displayGrid(connectFourGrid);

					if (gameStatus(connectFourGrid, columnPosition, chipColor)) {
						gameOver = true;
						System.out.print("\n" + chipColor + " je pobjedio.");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
	}

	/**
	 * provjeravanje polja na ploci tj da li je igra gotova ili se nastavlja
	 * igrati
	 * 
	 * @param connectFourGrid
	 * @param columnPosition
	 * @param chipColor
	 * @return
	 */

	public static boolean gameStatus(char[][] connectFourGrid, int columnPosition, char chipColor) {

		int rowPosition = 0;
		for (int i = 0; i < connectFourGrid.length; i++) {
			if (connectFourGrid[i][columnPosition] != 0) {
				rowPosition = i;
				break;
			}
		}

		if (checkVertical(connectFourGrid, columnPosition, chipColor, rowPosition)) {
			return true;
		}
		if (checkHorizontal(connectFourGrid, columnPosition, chipColor, rowPosition)) {
			return true;
		}
		if (checkLeftDiagonal(connectFourGrid, columnPosition, chipColor, rowPosition)) {
			return true;
		}
		if (checkRightDiagonal(connectFourGrid, columnPosition, chipColor, rowPosition)) {
			return true;
		}
		return false;
	}

	/**
	 * provjeravanje vertikalnih polja
	 * 
	 * @param connectFourGrid
	 * @param columnPosition
	 * @param chipColor
	 * @param rowPosition
	 * @return
	 */
	public static boolean checkVertical(char[][] connectFourGrid, int columnPosition, char chipColor, int rowPosition) {

		int chipCounter = 1;
		if ((rowPosition + 4) <= 6) {
			for (int i = rowPosition + 1; i <= (rowPosition + 3); i++) {
				if (chipColor == connectFourGrid[i][columnPosition]) {
					chipCounter++;
				} else {
					break;
				}
			}
		}
		if (chipCounter == 4) {
			return true;
		}
		return false;
	}

	/**
	 * provjeravanje horizontalnih polja
	 * 
	 * @param connectFourGrid
	 * @param columnPosition
	 * @param chipColor
	 * @param rowPosition
	 * @return
	 */
	public static boolean checkHorizontal(char[][] connectFourGrid, int columnPosition, char chipColor,
			int rowPosition) {

		int chipCounter = 1;
		for (int i = columnPosition - 1; i >= 0; i--) {
			if (chipColor == connectFourGrid[rowPosition][i]) {
				chipCounter++;
			} else {
				break;
			}
		}
		if (chipCounter >= 4) {
			return true;
		}
		for (int i = columnPosition + 1; i < connectFourGrid[0].length; i++) {
			if (chipColor == connectFourGrid[rowPosition][i]) {
				chipCounter++;
			} else {
				break;
			}
		}
		if (chipCounter >= 4) {
			return true;
		}
		return false;
	}

	/**
	 * provjeravanje glavne dijagonale
	 * 
	 * @param connectFourGrid
	 * @param columnPosition
	 * @param chipColor
	 * @param rowPosition
	 * @return
	 */
	public static boolean checkLeftDiagonal(char[][] connectFourGrid, int columnPosition, char chipColor,
			int rowPosition) {

		int chipCounter = 1;

		for (int i = rowPosition - 1, j = columnPosition - 1; i >= 0 && j >= 0; i--, j--) {
			if (chipColor == connectFourGrid[i][j]) {
				chipCounter++;
			} else {
				break;
			}
		}
		if (chipCounter >= 4) {
			return true;
		}
		for (int i = rowPosition + 1, j = columnPosition + 1; i < connectFourGrid.length
				&& j < connectFourGrid[0].length; i++, j++) {
			if (chipColor == connectFourGrid[i][j]) {
				chipCounter++;
			} else {
				break;
			}
		}
		if (chipCounter >= 4) {
			return true;
		}
		return false;

	}

	/**
	 * provjeravanje sporedne dijagonale
	 * 
	 * @param connectFourGrid
	 * @param columnPosition
	 * @param chipColor
	 * @param rowPosition
	 * @return
	 */
	public static boolean checkRightDiagonal(char[][] connectFourGrid, int columnPosition, char chipColor,
			int rowPosition) {

		int chipCounter = 1;

		for (int i = rowPosition + 1, j = columnPosition - 1; i < connectFourGrid.length && j >= 0; i++, j--) {
			if (chipColor == connectFourGrid[i][j]) {
				chipCounter++;
			} else {
				break;
			}
		}
		if (chipCounter >= 4) {
			return true;
		}
		for (int i = rowPosition - 1, j = columnPosition + 1; i >= 0 && j < connectFourGrid[0].length; i--, j++) {
			if (chipColor == connectFourGrid[i][j]) {
				chipCounter++;
			} else {
				break;
			}
		}
		if (chipCounter >= 4) {
			return true;
		}
		return false;
	}

	/**
	 * dodavanje cipa na plocu
	 * 
	 * @param connectFourGrid
	 * @param columnPosition
	 * @param chipColor
	 * @return
	 */
	public static boolean dropChip(char[][] connectFourGrid, int columnPosition, char chipColor) {

		for (int i = connectFourGrid.length - 1; i >= 0; i--) {
			if (connectFourGrid[i][columnPosition] == 0) {
				connectFourGrid[i][columnPosition] = chipColor;
				return false;
			}
		}

		return true;
	}

	/**
	 * main :D
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main");
		char[][] connectFourGrid = new char[6][7];
		displayGrid(connectFourGrid);
		playConnectFour(connectFourGrid);

	}
}

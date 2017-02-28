package mini3_Connect4_Tic_tac_toe;

import java.util.Scanner;

public class Tic_tac_toe {

	public static int[][] board = new int[3][3];
	public static int state;
	public static int player;
	public static int currntRow, currentCol;

	public static void main(String[] args) {
		displayBoard();
		Scanner input = new Scanner(System.in);
		gameStart();
		do {
			playerMove(player, input);
			updateGame(player, currntRow, currentCol);
			System.out.println();
			displayBoard();
			if (state == 2) {
				System.out.println("Pobjedio je Player1 'X'.");
			} else if (state == 3) {
				System.out.println("Pobjedio je Player2 'O'. ");
			} else if (state == 1) {
				System.out.println("Ishod je nerjesen !");
			}
			player = (player == 1) ? 2 : 1;
		} while (state == 0);
	}

	/**
	 * pocetak igre
	 */
	
	public static void gameStart() {
		for (int row = 0; row < 3; ++row) {
			for (int column = 0; column < 3; ++column) {
				board[row][column] = 0;
			}
		}
		state = 0;
		player = 1;
	}

	/**
	 * unos igraca
	 * @param playerMove
	 * @param input
	 */
	public static void playerMove(int playerMove, Scanner input) {
		boolean validInput = false;
		try {

			do {
				if (playerMove == 1) {
					System.out.print("\nIgrac 1, upisite koordinate za 'X' odvojene sa space (red i kolona od 1 do 3): ");
				} else {
					System.out.print("\nIgrac 2, upisite koordinate za 'O' odvojene sa space (red i kolona od 1 do 3): ");
				}
				int row = input.nextInt() - 1;

				int column = input.nextInt() - 1;
				if (row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == 0) {
					currntRow = row;
					currentCol = column;
					board[currntRow][currentCol] = playerMove;
					validInput = true;
				} else {
					System.out.println();
					displayBoard();
					System.out.println("Unos u to polje nije validan, pokusajte ponovo: ");
				}
			} while (!validInput);
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
			System.exit(0);
		}
	}

	/**
	 * update i provjera polja
	 * @param playerMove
	 * @param currentRow
	 * @param currentCol
	 */
	public static void updateGame(int playerMove, int currentRow, int currentCol) {
		if (winValidation(playerMove, currentRow, currentCol)) {
			state = (playerMove == 1) ? 2 : 3;
		} else if (isDraw()) {
			state = 1;
		}
	}

	/**
	 * provjera da li je ishod nerjesen
	 * @return
	 */
	public static boolean isDraw() {
		for (int row = 0; row < 3; ++row) {
			for (int column = 0; column < 3; ++column) {
				if (board[row][column] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	
/**
 * validacija pobjede
 * @param playerMove
 * @param currentRow
 * @param currentCol
 * @return
 */
	public static boolean winValidation(int playerMove, int currentRow, int currentCol) {
		return (board[currentRow][0] == playerMove && board[currentRow][1] == playerMove
				&& board[currentRow][2] == playerMove
				|| board[0][currentCol] == playerMove && board[1][currentCol] == playerMove
						&& board[2][currentCol] == playerMove
				|| currentRow == currentCol && board[0][0] == playerMove && board[1][1] == playerMove
						&& board[2][2] == playerMove
				|| currentRow + currentCol == 2 && board[0][2] == playerMove && board[1][1] == playerMove
						&& board[2][0] == playerMove);
	}

	/**
	 * display matrice
	 */
	public static void displayBoard() {
		for (int row = 0; row < 3; ++row) {
			for (int column = 0; column < 3; ++column) {
				displayCell(board[row][column]);
				if (column != 3 - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != 3 - 1) {
				System.out.println("-----------");
			}
		}
		System.out.println();
	}

	/**
	 * display elemenata unutar matrice
	 * @param content
	 */
	public static void displayCell(int content) {
		switch (content) {
		case 0:
			System.out.print("   ");
			break;
		case 2:
			System.out.print(" O ");
			break;
		case 1:
			System.out.print(" X ");
			break;
		}
	}
}
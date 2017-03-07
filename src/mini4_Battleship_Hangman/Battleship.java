package mini4_Battleship_Hangman;

public class Battleship {

	private char[][] ships;
	private char[][] guess;
	private int countGuesses;

	Battleship() {
		guess = initializeEmptyMatrix();
		ships = initializeShips();
	}

	public char[][] initializeEmptyMatrix() {
		char[][] empty = new char[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				empty[i][j] = ' ';
			}
		}

		return empty;
	}

	public char[][] initializeShips() {
		char[][] ships = new char[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				ships[i][j] = ' ';
			}
		}

		ships[0][0] = '#';
		ships[0][1] = '#';

		ships[2][9] = '#';
		ships[3][9] = '#';

		ships[5][5] = '#';
		ships[6][5] = '#';

		ships[7][0] = '#';
		ships[7][1] = '#';

		for (int i = 0; i < 3; i++) {
			ships[i][3] = '#';
		}

		for (int i = 5; i < 8; i++) {
			ships[2][i] = '#';
		}

		for (int i = 5; i < 8; i++) {
			ships[i][9] = '#';
		}

		for (int i = 6; i < 10; i++) {
			ships[0][i] = '#';
		}

		for (int i = 2; i < 6; i++) {
			ships[i][0] = '#';
		}

		for (int i = 4; i < 10; i++) {
			ships[9][i] = '#';
		}

		return ships;

	}

	public void setCharAtPosition(int row, char letter) {
		int column = getColumn(letter);

		if (isHit(row, column)) {
			guess[row][column] = '#';
			countGuesses++;
		} else {
			guess[row][column] = '*';
		}

	}

	public int getColumn(char letter) {
		letter = Character.toUpperCase(letter);
		int column = 0;
		if (letter == 'A') {
			column = 0;
		} else if (letter == 'B') {
			column = 1;
		} else if (letter == 'C') {
			column = 2;
		} else if (letter == 'D') {
			column = 3;
		} else if (letter == 'E') {
			column = 4;
		} else if (letter == 'F') {
			column = 5;
		} else if (letter == 'G') {
			column = 6;
		} else if (letter == 'H') {
			column = 7;
		} else if (letter == 'I') {
			column = 8;
		} else if (letter == 'J') {
			column = 9;
		}

		return column;

	}

	public boolean isValidColumn(char letter) {
		letter = Character.toUpperCase(letter);
		if (letter >= 'A' && letter <= 'J') {
			return true;
		}
		return false;
	}

	public boolean isValidRow(int row) {
		if (row >= 0 && row <= 9) {
			return true;
		}
		return false;
	}

	public boolean isHit(int row, int column) {
		if (ships[row][column] == '#') {
			return true;
		}
		return false;
	}

	public boolean isPositionEmpty(int row, char letter) {
		int column = getColumn(letter);
		if (guess[row][column] == ' ') {
			return true;
		}
		return false;
	}

	public void printGuess() {
		System.out.println("    A   B   C   D   E   F   G   H   I   J");

		for (int i = 0; i < guess.length; i++) {
			System.out.println("   ---------------------------------------");

			System.out.print(i);
			for (int j = 0; j < guess[i].length; j++) {
				System.out.print(" | " + guess[i][j]);
			}
			System.out.print(" |\n");
		}

		System.out.println("   ---------------------------------------");

	}

	public void printShips() {
		System.out.println("    A   B   C   D   E   F   G   H   I   J");

		for (int i = 0; i < ships.length; i++) {
			System.out.println("   ---------------------------------------");

			System.out.print(i);
			for (int j = 0; j < ships[i].length; j++) {
				System.out.print(" | " + ships[i][j]);
			}
			System.out.print(" |\n");
		}

		System.out.println("   ---------------------------------------");
	}

	public boolean isWin() {
		if (countGuesses == 31) {
			return true;
		}
		return false;
	}

}
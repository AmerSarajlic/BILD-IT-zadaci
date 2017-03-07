package mini4_Battleship_Hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		startApplication(input);
	}

	/**
	 * pokretanje aplikacije
	 */
	public static void startApplication(Scanner input) throws IOException {

		String[] words = null;
		try {
			words = readWordsFromFile();
		} catch (IOException ex) {
			System.out.println("File not found.");
		}

		String userInput = "";
		char guess = ' ';
		char playAgain = 'Y';

		while (playAgain == 'Y') {

			String randomWord = "";
			try {
				randomWord = generateRandomWord(words);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("File is empthy.");
				return;
			}
			char[] wordArray = fillWithAsterisk(randomWord);
			boolean gameOver = false;
			int countMissed = 0;

			while (!gameOver) {
				displayAsteriskWord(wordArray);
				userInput = input.next();

				while (!isUserInputValid(userInput)) {
					System.out.println("\nUnos mora biti jedno slovo. Pokusajte ponovo: ");
					userInput = input.next();
				}

				guess = userInput.charAt(0);

				if (isLetterAlreadyInWord(wordArray, guess)) {
					System.out.println(guess + " je vec u rijeci.");
					countMissed++;
				} else if (!isLetterInTheWord(randomWord, guess)) {
					System.out.println(guess + " nije u rijeci.");
					countMissed++;
				} else {
					checkUserinput(randomWord, wordArray, guess);
				}

				if (isEverythingGuessed(wordArray)) {
					gameOver = true;
				}
			}
			String str = (countMissed > 1) ? " puta" : " put";

			if (countMissed == 0)
				System.out.println("Rijec je " + randomWord + ". Pogodili ste bez pogreske.");
			else
				System.out.println("Rijec je " + randomWord + ". Pogrijesili ste " + countMissed + str);

			System.out.println("Da li zelite igrati ponovo, Y / N: ");
			playAgain = Character.toUpperCase(input.next().charAt(0));

			while (!isCharInputValid(playAgain)) {
				System.out.println("\nUnos nije validan, pokusajte ponovo: ");
				playAgain = Character.toUpperCase(input.next().charAt(0));
			}
		}
		System.out.println("Kraj igre!");
	}

	/**
	 * Validacija unosa
	 * 
	 * @param guess
	 * @return
	 */
	public static boolean isUserInputValid(String guess) {
		return (guess.length() == 1 && !Character.isDigit(guess.charAt(0)));
	}

	/**
	 * Citanje rijeci iz fajla
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String[] readWordsFromFile() throws IOException {

		Path path = Paths.get("hangman.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		ArrayList<String> list = new ArrayList<>();

		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String line = null;

			while ((line = reader.readLine()) != null) {
				list.addAll(Arrays.asList(line.split(" ")));
			}
			reader.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return (String[]) list.toArray(new String[list.size()]);
	}

	/**
	 * Validacija slova u rijeci
	 * 
	 * @param randomWord
	 * @param guess
	 * @return
	 */
	public static boolean isLetterInTheWord(String randomWord, char guess) {
		boolean is = false;
		for (int i = 0; i < randomWord.length(); i++) {
			if (randomWord.charAt(i) != guess) {
				is = false;
			} else {
				is = true;
				break;
			}
		}
		return is;
	}

	/**
	 * Validacija da li je slovo vec u rijeci
	 * 
	 * @param wordArray
	 * @param guess
	 * @return
	 */
	public static boolean isLetterAlreadyInWord(char[] wordArray, char guess) {
		for (int i = 0; i < wordArray.length; i++)
			if (wordArray[i] == guess)
				return true;
		return false;
	}

	/**
	 * Validacija da li je sve pogodjeno
	 * 
	 * @param wordArray
	 * @return
	 */
	public static boolean isEverythingGuessed(char[] wordArray) {
		for (int i = 0; i < wordArray.length; i++)
			if (wordArray[i] == '*')
				return false;
		return true;
	}

	/**
	 * Validacija unosa za novu igru
	 * 
	 * @param playAgain
	 * @return
	 */
	public static boolean isCharInputValid(char playAgain) {
		return (playAgain == 'Y' || playAgain == 'N');
	}

	/**
	 * Validacija unosa korisnika
	 * 
	 * @param randomWord
	 * @param wordArray
	 * @param guess
	 */
	public static void checkUserinput(String randomWord, char[] wordArray, char guess) {
		for (int i = 0; i < randomWord.length(); i++) {
			if (randomWord.charAt(i) == guess)
				wordArray[i] = guess;
		}
	}

	/**
	 * Metoda za prikaz zvjezdica u rijeci
	 * 
	 * @param word
	 * @param guess
	 */
	public static void displayAsteriskWord(char[] wordArray) {

		System.out.print("(Guess) Enter a letter in word ");
		for (int i = 0; i < wordArray.length; i++) {
			System.out.print(wordArray[i]);
		}
		System.out.print(" > ");
	}

	/**
	 * Popunjavanje rijeci zvjezdicama
	 * 
	 * @param randomWord
	 * @return
	 */
	public static char[] fillWithAsterisk(String randomWord) {
		char[] word = new char[randomWord.length()];
		for (int i = 0; i < word.length; i++)
			word[i] = '*';
		return word;
	}

	/**
	 * Random rijec iz niza rijeci
	 * 
	 * @param words
	 * @return
	 */
	public static String generateRandomWord(String[] words) {
		return words[(int) (Math.random() * words.length)];
	}

}

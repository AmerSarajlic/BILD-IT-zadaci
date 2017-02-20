package bonus_kviz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreBoard {

	public void addScore(User user, int score) {
		Path path = Paths.get("scoreboard.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
			writer.write(user.getUserName() + " " + score);
			writer.newLine();

		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
		}
		System.out.println("Score successfuly added to scoreboard !\n");
	}

	public void playerTopScore(User user, Scanner input) {

		Path path = Paths.get("scoreboard.txt");
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				String userName = user.getUserName();
				String[] array = line.split(" ");
				if (userName.equals(array[0])) {
					System.out.println("Username: " + array[0] + " Score: " + array[1]);
				}

			}

		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
			input.nextLine();
		}
		System.out.println();
	}

	public void playersTopHundert(Scanner input) {
		ArrayList<String> list = new ArrayList<>();
		Path path = Paths.get("scoreboard.txt");

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line = "";
			System.out.println(" !!! TOP 100 !!! ");
			while ((line = reader.readLine()) != null) {
				String[] array = line.split(" ");
				String userName = array[0];
				int score = Integer.parseInt(array[1]);
				String scoreList = score + " " + userName;
				list.add(scoreList);
			}
			
			list.sort(String::compareTo);
			int a = 1;
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.println((a++) + "). -> " + list.get(i) + " ");
			}

		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
			input.nextLine();
		}
		System.out.println();
	}

}

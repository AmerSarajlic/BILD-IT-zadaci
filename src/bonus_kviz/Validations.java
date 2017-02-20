package bonus_kviz;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Validations {
	public static void filesExist() throws IOException {

		Path users = Paths.get("users.txt");
		if (!Files.exists(users)) {
			Files.createFile(users);
		}

		Path questions = Paths.get("questions.txt");
		if (!Files.exists(questions)) {
			Files.createFile(questions);
		}

		Path results = Paths.get("results.txt");
		if (!Files.exists(results)) {
			Files.createFile(results);
		}

		Path scoreboard = Paths.get("scoreboard.txt");
		if (!Files.exists(scoreboard)) {
			Files.createFile(scoreboard);
		}
	}
	
	public static boolean isValidUserPasword(User user) {

		Path path = Paths.get("users.txt");
		try (BufferedReader reader = Files.newBufferedReader(path)) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] userData = line.split("/");
				if (userData[1].equals(user.getPassword())) {
					return true;
				}
			}

		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
		}
		return false;
	}

	public static boolean isValidUserUsername(User user, Scanner input) {

		Path path = Paths.get("users.txt");

		try (BufferedReader reader = Files.newBufferedReader(path)) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] userData = line.split("/");
				if (userData[0].equals(user.getUserName())) {
					return true;
				}
			}

		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
			input.nextLine();
		}
		return false;
	}

	public static void userValidation(User user, Scanner input) {
		boolean on = true;
		while(on){
		
		System.out.print("Insert username: ");
		String username = input.next();
		if (username.equals("admin")) {
			System.out.print("Insert password: ");
			String password = input.next();
			if (password.equals("admin")) {
				System.out.println("Successfully loged in as admin !\n");
				on = false;
				AdminWorkspace.adminJob(input);
			}
		}

		else {
			user.setUserName(username);
			if (isValidUserUsername(user, input)) {
				System.out.print("Insert password: ");
				String password = input.next();
				user.setPassword(password);
				if (isValidUserPasword(user)) {
					System.out.println();
					on = false;
					UserWorkspace.playerJob(user, input);

				} else {
					System.out.println("Password is not valid !\n");
				}
			} else {
				System.out.println("Username does not exist !\n");
			}
			}
		}
	}
}

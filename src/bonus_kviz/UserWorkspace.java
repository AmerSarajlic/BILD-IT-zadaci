package bonus_kviz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserWorkspace {
	User user = new User();
	AdminWorkspace adminWorkspace = new AdminWorkspace();
	Validations validations = new Validations();

	public static void playerJob(User user, Scanner input) {
		int option = 0;
		boolean on = true;
		ScoreBoard scoreBoard = new ScoreBoard();
		while (on) {

			try {
				System.out.println(KvizUI.USER_MAIN_MENU);
				System.out.print("\nInsert option: ");
				option = input.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					playGame(user, input);
					break;

				case 2:
					scoreBoard.playerTopScore(user, input);
					break;

				case 3:
					scoreBoard.playersTopHundert(input);
					break;
				case 4:
					System.out.println("Loging off...\n");
					on = false;

					break;
				default:
					break;
				}

			} catch (Exception e) {
				System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
				input.nextLine();
			}
		}
	}

	public static void playGame(User user, Scanner input) {
		QuestionAnswerDaoFileImpl questionAnswerDaoImpl = new QuestionAnswerDaoFileImpl();
		ScoreBoard scoreBoard = new ScoreBoard();
		ArrayList<QuestionAnswer> list = questionAnswerDaoImpl.getAllQuestionAnswer();

		Set<QuestionAnswer> set = new HashSet<>();
		set.addAll(list);
		ArrayList<QuestionAnswer> qlist = new ArrayList<>();
		qlist.addAll(set);
		if(qlist.size() < 10){
			System.out.print("There is no enough question in base. Please try later !!!\n\n");
		}
		else{
			
		
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			int number = (int) (Math.random() * qlist.size());

			for (int j = 0; j < array.length; j++) {

				if (number == array[j]) {
					j = -1;
					number = (int) (Math.random() * qlist.size());
				}

			}
			array[i] = number;
		}

		int score = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("\nQuestion: " + (i + 1) + "\n");
			System.out.println("Insert your answer (a, b or c): ");
			System.out.println(qlist.get(array[i]).getQuestion().replaceAll("-", " "));
			String answer = input.next();
			
			if (answer.equals(list.get(array[i]).getAnswer())) {
				score += 5;
			} 
		}
		scoreBoard.addScore(user, score);
		System.out.println("Game over !!!\n");
		input.nextLine();
	}
	}
	public static void addNewUser(User user, Scanner input) {

		User tempUser = new User();
		UserDaoFileImpl userDaoImpl = new UserDaoFileImpl();
		System.out.print("Insert username: ");
		String userName = input.next();
		boolean on = true;
		while (on) {

			tempUser.setUserName(userName);
			if (Validations.isValidUserUsername(tempUser, input) || userName.equalsIgnoreCase("admin")) {
				System.out.print("Username already taken, try another one: ");
				userName = input.next();
			} else {
				user.setUserName(userName);
				on = false;
			}
		}

		int password = (int) (1000 + Math.random() * 9000);
		System.out.print("Pasword for your account is: " + password + "\n\n");
		System.out.println("New user successfully added !\n");
		user.setPassword(password + "");
		userDaoImpl.addUser(user);

	}

}

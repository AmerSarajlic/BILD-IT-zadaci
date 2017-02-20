package bonus_kviz;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminWorkspace {

	public static void adminJob(Scanner input) {
		User user1 = new User();
		UserDaoFileImpl userDaoImpl = new UserDaoFileImpl();
		QuestionAnswerDaoFileImpl questionAnswerDaoImpl = new QuestionAnswerDaoFileImpl();
		int option = 0;
		boolean on = true;
		while(on){
		try {
			System.out.println(KvizUI.ADMIN_MAIN_MENU);
			System.out.print("\nInsert option: ");
			option = input.nextInt();
			System.out.println();
			switch (option) {
			case 1:
				displayAllUsers();
				break;

			case 2:
				UserWorkspace.addNewUser(user1, input);
				break;

			case 3:
				displayAllUsers();
				System.out.print("Insert serial number of user that you want to remove: ");
				int number = input.nextInt();
				userDaoImpl.deleteUser(number - 1);
				break;
			case 4:
				displayAllQuestionsAndAnswers();
				break;
			case 5:
				addNewQuestionAnswer(input);
				break;
			case 6:
				displayAllQuestionsAndAnswers();
				System.out.print("Insert serial number of question that you want to remove: ");
				int number1 = input.nextInt();
				questionAnswerDaoImpl.deleteQuestionAnswer(number1 - 1);
				break;
			case 7:
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
	public static void addNewQuestionAnswer(Scanner input) {

		QuestionAnswerDaoFileImpl questionAnswerDaoImpl = new QuestionAnswerDaoFileImpl();
		QuestionAnswer questionAnswer = new QuestionAnswer();
		System.out.print("Insert question (format: question ? a)ans1, b)ans2, c)ans3): ");
		input.nextLine();
		String question = input.nextLine();
		System.out.print("Insert answer (example: a): ");
		String answer = input.next();
		questionAnswer.setQuestion(question);
		questionAnswer.setAnswer(answer);
		questionAnswerDaoImpl.addQuestionAnswer(questionAnswer);

	}
	
	public static void displayAllUsers() {
		UserDaoFileImpl userDaoImpl = new UserDaoFileImpl();
		ArrayList<User> users = userDaoImpl.getAllUsers();

		for (int i = 0; i < users.size(); i++) {
			System.out.println(
					(i + 1) + " Username: " + users.get(i).getUserName() + " Password: " + users.get(i).getPassword());
		}
		System.out.println();
	}
	
	public static void displayAllQuestionsAndAnswers() {
		QuestionAnswerDaoFileImpl questionAnswerDaoImpl = new QuestionAnswerDaoFileImpl();
		ArrayList<QuestionAnswer> questionAnswers = questionAnswerDaoImpl.getAllQuestionAnswer();

		for (int i = 0; i < questionAnswers.size(); i++) {
			System.out.println((i + 1) + " Question: " + questionAnswers.get(i).getQuestion().replaceAll("-", " ")
					+ " Answer: " + questionAnswers.get(i).getAnswer());
		}
		System.out.println();
	}
}

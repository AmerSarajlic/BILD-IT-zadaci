package bonus_kviz;

import java.io.IOException;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		Validations.filesExist();
		Scanner input = new Scanner(System.in);

		User user = new User();

		KvizUI.displayWelecomeMessage();
		boolean on = true;
		while (on) {
			int opcija = 0;
			try {
				System.out.print(KvizUI.START_MENU);
				System.out.print("\n\nOption: ");
				opcija = input.nextInt();
				switch (opcija) {
				case 1:
					Validations.userValidation(user, input);
					break;
				case 2:
					UserWorkspace.addNewUser(user, input);
					break;
				default:
					System.out.println("Insert 1 or 2 !!!\n");
					break;
				}
			} catch (Exception e) {
				System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE + "\n");
				input.nextLine();
			}
		}
	}
}

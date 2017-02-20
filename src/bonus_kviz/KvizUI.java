package bonus_kviz;

public class KvizUI {

	public static void displayWelecomeMessage() {
		System.out.println("       #   #  #   #  #  #####");
		System.out.println("       #  #   #   #  #     #");
		System.out.println("*****  ###    #   #  #   ###   *****");
		System.out.println("       #  #    # #   #   #");
		System.out.println("       #   #    #    #  #####\n\n");
	}

	public static final String START_MENU = "1. Login\n2. Register";
	
	public static final String ADMIN_MAIN_MENU = "1. All users list.\n2. Add User\n3. Remove User "
			+ "\n4. All Questions and answers\n5. Add Question and answer\n6. Remove Question and answer\n7. Log off. ";

	public static final String USER_MAIN_MENU = "1. New game.\n2. My previous scores\n3. All users top scores\n4. Log off. ";

	public static final String GENERIC_EXCEPTION_MESSAGE = "Invalid input !";

	public static final String USER_ALREADY_EXIST_MESSAGE = "That user name already exist !";

	public static final String USER_NOT_EXIST_MESSAGE = "That user name does not exist !";

	public static final String THANKS_FOR_PLAYING_MESSAGE = "Tnx for playing KVIZ !!!\n\n";

}

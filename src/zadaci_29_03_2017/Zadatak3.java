package zadaci_29_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Upisite godinu: ");
		String year = input.nextLine();
		System.out.print("Upisite pol(M/Z): ");
		String gender = input.nextLine().toUpperCase();
		System.out.print("Upisite ime: ");
		String name = input.nextLine();
		ArrayList<String> list = new ArrayList<>();

		try {
			java.net.URL url = new java.net.URL(
					"http://www.cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");

			input = new Scanner(url.openStream());
			while (input.hasNext()) {
				for (int i = 0; i < 5; i++) {
					list.add(i, input.next());
				}

				if (list.get(gender(gender)).equals(name)) {
					System.out.println(name + " je rengirano #" + list.get(0) + " u " + year + " godini.");
					System.exit(0);
				}
				list.clear();
			}
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		} catch (Exception e) {
			System.out.println("Format unesenih podataka nije validan !!!");
			System.exit(1);
		}

		System.out.println("Ime " + name + " nije rangirano u " + year + " godini.");
	}

	/** Vraca index za odgovarajuci pol */
	public static int gender(String gender) {
		if (gender.equals("M"))
			return 1;
		else
			return 3;
	}
}
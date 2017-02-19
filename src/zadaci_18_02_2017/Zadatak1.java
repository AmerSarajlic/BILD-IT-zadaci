package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u
 * abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los Angeles i
 * Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.
 * 
 * @author amer
 *
 */
public class Zadatak1 {
	/**
	 * nazivi gradova mogu sadrzavati vise rijeci ili "-", a ne mogu brojeve u
	 * ovoj validaciji to provjeravamo
	 * 
	 * @param town
	 * @return
	 */
	public static boolean isValid(String town) {
		String newTown = town.replaceAll(" ", "");
		String newNewTown = newTown.replaceAll("-", "");
		for (int i = 0; i < newNewTown.length(); i++) {

			if (!Character.isAlphabetic(newNewTown.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int number = 0;
		while (number < 3) {

			System.out.print("Upisite naziv grada: ");
			String town = input.nextLine();

			if (isValid(town)) {
				list.add(town);
				number++;
			} else {
				System.out.println("Unos nije validan !");
			}
		}
		System.out.print("\nSortirani gradovi su: ");
		list.sort(String::compareTo);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}

		input.close();

	}

}

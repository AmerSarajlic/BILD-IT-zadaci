package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih
 * brojeva unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim
 * spaceom. Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo
 * jednom.
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		try {
			System.out.print("Unesite 10 cijelih brojeva: ");
			for (int i = 0; i < 10; i++) {
				int num = input.nextInt();
				list.add(num);
			}

			Set<Integer> set = new HashSet<>();
			set.addAll(list);

			System.out.print("Ukupno jedinstvenih brojeva ima: " + set.size() + " i to su: ");

			for (Integer integer : set) {
				System.out.print(integer + " ");
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan !");
		}
		input.close();

	}

}
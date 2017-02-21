package zadaci_20_02_2017;

/**
 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
 * karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji
 * nasumièno generiše tablicu.
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static void main(String[] args) {
		String str = "";
		String str1 = "";
		
		/**slova
		 */
		for (int i = 0; i < 3; i++) {
			char ch = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
			str += ch;
		}
		
		/**
		 * brojevi
		 */
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 10);
			str1 = str1 + "" + num;
		}

		System.out.println("Tablica je: " + str + "-" + str1);
	}

}

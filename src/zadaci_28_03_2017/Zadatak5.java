package zadaci_28_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zadatak5 {

	/** Metoda vraca random odabran rank */
	public static String getRank() {
		String[] ranks = { "assistant", "associate", "full" };
		return ranks[(int) (Math.random() * ranks.length)];
	}

	/** Metoda vraca random generisanu platu */
	public static double getSalary(String rank) {
		if (rank.equals("assistant"))
			return 50000 + (double) (Math.random() * 30001);
		else if (rank.equals("associate"))
			return 60000 + (double) (Math.random() * 50001);
		else
			return 75000 + (double) (Math.random() * 55001);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// kreiramo fajl
		File file = new File("Salary.txt");

		// provjeravamo da li fajl vec postoji
		if (file.exists()) {
			System.out.println("File " + file.getName() + " vec postoji");
			System.exit(0);
		}
		String rank = "";
		double salary;
		try (
				// kreiramo output fajl
				PrintWriter output = new PrintWriter(file);) {
			// upis podataka u fajl
			for (int i = 1; i <= 1000; i++) {
				output.print("Ime:" + i + " Prezime:" + i);
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f\n", salary);
			}
		}
	}
}

package zadaci_29_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

		// citamo podatke sa linka
		try {
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String[] line = (input.nextLine()).split(" ");
				processData(assistant, associate, full, line[2], new Double(line[3]));
			}
			input.close();
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
			System.exit(0);
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
			System.exit(1);
		}

		// Racunanje totala
		double totalAssistant = getTotal(assistant);
		double totalAssociate = getTotal(associate);
		double totalFull = getTotal(full);
		double totalFaculty = (totalAssistant + totalAssociate + totalFull);

		// Prikaz rezultata
		System.out.println("\n   Ukupna plata");
		System.out.println("---------------------");
		System.out.printf("Asistenti: 		$%.2f\n", totalAssistant);
		System.out.printf("Spoljni saradnici:	$%.2f\n", totalAssociate);
		System.out.printf("Profesori: 		$%.2f\n", totalFull);
		System.out.printf("Svi zaposleni: 		$%.2f\n", totalFaculty);

		System.out.println("\n   Prosjecna plata");
		System.out.println("---------------------");
		System.out.printf("Asistenti:		$%.2f\n", (totalAssistant / assistant.size()));
		System.out.printf("Spoljni saradnici:	$%.2f\n", (totalAssociate / associate.size()));
		System.out.printf("Profesori: 		$%.2f\n", (totalFull / full.size()));
		System.out.printf("Svi zaposleni: 		$%.2f\n",
				(totalFaculty / (assistant.size() + associate.size() + full.size())));
	}

	/** Vraca sumu elemenata liste */
	public static double getTotal(ArrayList<Double> list) {
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total;
	}

	/** dodavanje plata u odgovarajucu listu */
	public static void processData(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank,
			double salary) {
		if (rank.equals("assistant")) {
			a.add(salary);
		} else if (rank.equals("associate"))
			b.add(salary);
		else if (rank.equals("full"))
			c.add(salary);
	}
}
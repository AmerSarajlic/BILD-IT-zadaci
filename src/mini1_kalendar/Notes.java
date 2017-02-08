package mini1_kalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Notes {

	/*
	 * metoda koja upisuje potsjetnik u fajl za datum koji korisnik odabere,
	 * metoda provjerava i da li je format datuma validan te da li je broj dana
	 * u mjesecu validan
	 */
	public void addNote(Scanner input) throws IOException {

		/*
		 * ukoliko fajl ne postoji, kreira se novi pod nazivom "notes"
		 */
		Path path = Paths.get("notes.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		boolean on = true;
		while (on) {
			System.out.println("Insert date (format dd/mm/yyyy): ");
			String specificDate = input.next();
			if (Validation.isValidDate(specificDate) && Validation.isValidDayMonth(specificDate)) {

				try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
					writer.write(specificDate);
					System.out.println("Insert note text: ");
					input.nextLine();
					writer.write(" " + input.nextLine());
					writer.newLine();
					on = false;
					System.out.println("Note added !!!");
				} catch (Exception e) {
					System.out.println("EXCEPTION !!!");
				}
			} else {
				System.out.println("Inserted format or datas are not valid use dd/mm/yyyy format !!! \n");
				input.nextLine();

			}
		}
	}

	/*
	 * metoda koja omogucava da korisnik procita potsjetnik/potsjetnike za tacno
	 * odredjeni datum, takodje upisani datum se validira
	 */
	public void readNotesForSpecificDate(Scanner input) {
		boolean on = true;
		while (on) {
			System.out.println("Insert date (format dd/mm/yyyy): ");
			String specificDate = input.next();
			if (Validation.isValidDate(specificDate) && Validation.isValidDayMonth(specificDate)) {
				Path path = Paths.get("notes.txt");
				try (BufferedReader reade = Files.newBufferedReader(path)) {

					String line;
					while ((line = reade.readLine()) != null) {

						String[] notes = line.split(" ");
						if (notes[0].equals(specificDate)) {
							for (String string : notes) {
								System.out.print(string + " ");
							}
							System.out.println();

						}

					}
					
					on = false;
				} catch (Exception e) {
					System.out.println("EXCEPTION !!!");
				}
			}
			else {
				System.out.println("Inserted format is not valid use dd/mm/yyyy format !!! \n");
				input.nextLine();
			}
		}
	}

	
	/*
	 * metoda koja omogucava da se procitaju svi potsjetnici
	 */
	public void readAllNotes() {
		Path path = Paths.get("notes.txt");
		try (BufferedReader reade = Files.newBufferedReader(path)) {
			String line;
			while ((line = reade.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			System.out.println("EXCEPTION !!!");
		}
	}
}

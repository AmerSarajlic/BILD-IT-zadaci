package zadaci_28_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		// ako argumetn nije validan
		if (args.length != 1) {
			System.out.println("Argument nije validan.");
			System.out.println("Koristimo: java Exercise12_18 srcRootDirectory");
			System.exit(1);
		}

		// ako mainDir nije direktorij
		File mainDir = new File(args[0]);
		if (!mainDir.isDirectory()) {
			System.out.println(mainDir.getAbsolutePath());
			System.out.println(mainDir + " nije direktorij.");
			System.exit(2);
		}

		// ako je mainDir null
		File[] mainDirFiles = mainDir.listFiles();
		if (mainDirFiles == null) {
			System.out.println("Nema fajlova u: " + mainDir);
			System.exit(3);
		}

		// dodajemo sve u arraylist
		ArrayList<File> packageDirs = new ArrayList<>();
		for (int i = 0; i < mainDirFiles.length; i++) {
			if (mainDirFiles[i].isDirectory() && mainDirFiles[i].getName().contains("Chapter")) {
				packageDirs.add(mainDirFiles[i]);
			}
		}
		// ako je packadeDirs prazan
		if (packageDirs.isEmpty()) {
			System.out.print("Nisu pronadjeni paketi u direktoriju: " + mainDir.getName());
			System.exit(2);
		}

		for (File dir : packageDirs) {
			File[] files = dir.listFiles();

			if (files == null)
				continue;

			for (File file : files) {

				if (file.getName().contains(".java")) {
					updateFilePackage(file, dir.getName());
				}
			}
		}

	}

	private static void updateFilePackage(File file, String name) {

		String lineSeparator = System.getProperty("line.separator");
		String packageString = "package " + name + ";";

		// citamo fajl
		try (Scanner input = new Scanner(file)) {

			while (input.hasNext()) {

				String s = input.nextLine();
				if (s.equals(packageString)) {
					System.out.println("File: " + file + " vec ima paket " + name);
					return; // zaustavljamo metodu ako je paket vec u fajl
							// hederu
				}
				packageString += lineSeparator + s;

			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// snima novi fajl
		try (PrintWriter out = new PrintWriter(file)) {
			out.write(packageString);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(packageString);

	}

}

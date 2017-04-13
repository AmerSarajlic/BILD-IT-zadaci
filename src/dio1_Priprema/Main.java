package dio1_Priprema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

public class Main {

	public static String inputLine() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String str = input.nextLine();
		input.close();
		return str;
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		String user = "root";
		String pass = "ameramer";
		String url = "jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false";

		try {

			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String query = "";

			System.out.println(
					"Izaberite opciju: \n\n1. Lista drzava\n2. Lista gradova\n3. Podaci za odredjenu drzavu\n4. Podaci za odredjeni grad\n5. 10 najnaseljenijih drzava\n6. 10 najnaseljenijih gradova ");
			
			System.out.print("\nOpcija: ");
			int option = input.nextInt();
			switch (option) {
			case 1: {
				query = "SELECT * FROM Country";
				ResultSet result = statement.executeQuery(query);
				while (result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 2: {
				query = "SELECT * FROM City";
				ResultSet result = statement.executeQuery(query);
				while (result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 3: {

				System.out.println("Unesite ime drzave:");
				String country = inputLine();

				query = "SELECT * FROM Country WHERE Name = '" + country + "';";
				ResultSet result = statement.executeQuery(query);

				if (result.next()) {
					System.out.print("\nIme drzave: ");
					System.out.println(result.getString("Name"));
					System.out.print("Kontinent: ");
					System.out.println(result.getString("Continent"));
					System.out.print("Regija: ");
					System.out.println(result.getString("Region"));
					System.out.print("Povrsina: ");
					System.out.println(result.getString("SurfaceArea"));
					System.out.print("Broj stanovnika: ");
					System.out.println(result.getString("Population"));
				} else {
					System.out.println("Drzava: " + country + " ne postoji u bazi !!!");
				}
				break;
			}
			case 4: {
				System.out.println("Unseite ime grada: ");
				String city = inputLine();
				query = "SELECT * FROM City  WHERE Name = '" + city + "'";
				ResultSet result = statement.executeQuery(query);
				if (result.next()) {
					System.out.print("\nIme grada: ");
					System.out.println(result.getString("Name"));
					System.out.print("Distrikt: ");
					System.out.println(result.getString("District"));
					System.out.print("Broj stanovnika: ");
					System.out.println(result.getString("Population"));
				}

				else {
					System.out.println("Grad: " + city + " ne postoji u bazi !!!");
				}
				break;
			}

			case 5: {
				query = "SELECT * FROM Country order by Population desc limit 10;";
				ResultSet result = statement.executeQuery(query);
				while (result.next()) {
					System.out.println("Drzava: " + result.getString("Name") + "\nBroj stanovnika: "
							+ result.getString("Population") + "\n");
				}
				break;
			}

			case 6: {
				query = "SELECT * FROM City order by Population desc limit 10;";
				ResultSet result = statement.executeQuery(query);
				while (result.next()) {
					System.out.println("Grad: " + result.getString("Name") + "\nBroj stanovnika: "
							+ result.getString("Population") + "\n");
				}
				break;
			}
			}
		} catch (InputMismatchException e) {
			System.out.println("Unos nije validan !!!");
		} catch (SQLException ex) {
			System.out.println("EXCEPTION !!!");
		}
		input.close();
	}
}

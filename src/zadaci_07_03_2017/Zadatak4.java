package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak4 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();

		list.add(new Loan(5, 10, 1000));
		list.add(new Circle(5));
		list.add("Amer - Tesanj");
		list.add(new Date());

		list.forEach(System.out::println);

	}

}

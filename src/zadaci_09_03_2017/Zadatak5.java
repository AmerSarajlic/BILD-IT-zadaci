package zadaci_09_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {

		try {
			Loan loan = new Loan(10, -10, 12);
			System.out.println("Total payment je: " + loan.getTotalPayment());

		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException: " + ex.getMessage());

		}
	}
}

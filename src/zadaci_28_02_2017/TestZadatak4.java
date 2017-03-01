package zadaci_28_02_2017;


public class TestZadatak4 {

	public static void main(String[] args) {
		Zadatak4 account1 = new Zadatak4();
		account1.setId(1122);
		account1.setBalance(20000);
		account1.setAnnualIntrestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("Balance is: " + account1.getBalance());
		System.out.println("Monthly interest is: " + account1.getMonthlyInterest());
		System.out.println("Date is: " + account1.getDate());

	}

}

package zadaci_28_02_2017;

import java.util.Date;

public class Zadatak4 {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Zadatak4() {
		this.id = 0;
		this.annualInterestRate = 0;
		this.setBalance(0);
		dateCreated = new Date();
	}

	Zadatak4(int id, double balance) {
		this.id = id;
		this.setBalance(balance);
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getAnnualIntrestRate() {
		return annualInterestRate;
	}

	void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualInterestRate = annualIntrestRate;
	}

	Date getDate() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}

	void withdraw(double withdraw) {
		balance -= withdraw;
	}

	void deposit(double deposit) {
		balance += deposit;
	}

}

package zadaci_07_03_2017;

import java.util.Date;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan() {
		annualInterestRate = 3;
		numberOfYears = 1;
		loanAmount = 1000;
		loanDate = new Date();
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;

		return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	@Override
	public String toString() {
		return "Annual interest rate: " + annualInterestRate + ", Years: " + numberOfYears + ", Ammount: " + loanAmount
				+ ", Date: " + loanDate;
	}

}

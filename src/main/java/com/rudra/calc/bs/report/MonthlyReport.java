package com.rudra.calc.bs.report;

import java.util.Date;

public class MonthlyReport {

	private final Date month;
	private final double deposite;
	private final double interestOnDeposite;
	private final double eligibleForLoan;
	private final double currentMonthInterest;
	private final double totalInterest;
	private final double loanRepayment;
	public Date getMonth() {
		return month;
	}
	public double getDeposite() {
		return deposite;
	}
	public double getInterestOnDeposite() {
		return interestOnDeposite;
	}
	public double getEligibleForLoan() {
		return eligibleForLoan;
	}
	
	public MonthlyReport(Date month, double deposite, double interestOnDeposite, double eligibleForLoan,
			double currentMonthInterest, double totalInterest, double loanRepayment) {
		super();
		this.month = month;
		this.deposite = deposite;
		this.interestOnDeposite = interestOnDeposite;
		this.eligibleForLoan = eligibleForLoan;
		this.currentMonthInterest = currentMonthInterest;
		this.totalInterest = totalInterest;
		this.loanRepayment = loanRepayment;
	}
	public double getCurrentMonthInterest() {
		return currentMonthInterest;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public double getLoanRepayment() {
		return loanRepayment;
	}
	
	
}

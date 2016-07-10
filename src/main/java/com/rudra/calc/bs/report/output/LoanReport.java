package com.rudra.calc.bs.report.output;

public class LoanReport {

	private double elgibleLoanAmount;
	private double loandisbursed;
	private double intrestForNextMonth;
	private double intrestTillDate;

	public double getElgibleLoanAmount() {
		return elgibleLoanAmount;
	}

	public void setElgibleLoanAmount(double elgibleLoanAmount) {
		this.elgibleLoanAmount = elgibleLoanAmount;
	}

	public double getLoandisbursed() {
		return loandisbursed;
	}

	public void setLoandisbursed(double loandisbursed) {
		this.loandisbursed = loandisbursed;
	}

	public double getIntrestForNextMonth() {
		return intrestForNextMonth;
	}

	public void setIntrestForNextMonth(double intrestForNextMonth) {
		this.intrestForNextMonth = intrestForNextMonth;
	}

	public double getIntrestTillDate() {
		return intrestTillDate;
	}

	public void setIntrestTillDate(double intrestTillDate) {
		this.intrestTillDate = intrestTillDate;
	}
}

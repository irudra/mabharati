package com.rudra.calc.bs.report.output;

public class EstimationReport {

	private DepositReport depositReport;
	private LoanReport loanReport;
	private double balance;

	public DepositReport getDepositReport() {
		return depositReport;
	}

	public void setDepositReport(DepositReport depositReport) {
		this.depositReport = depositReport;
	}

	public LoanReport getLoanReport() {
		return loanReport;
	}

	public void setLoanReport(LoanReport loanReport) {
		this.loanReport = loanReport;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

package com.rudra.calc.bs.report.output;

import java.util.List;

import com.rudra.calc.bs.report.MonthlyReport;

public class EstimationReport {

	private DepositReport depositReport;
	private LoanReport loanReport;
	private double balance;
	public List<MonthlyReport> getMonthlyReports() {
		return monthlyReports;
	}

	public void setMonthlyReports(List<MonthlyReport> monthlyReports) {
		this.monthlyReports = monthlyReports;
	}

	List<MonthlyReport> monthlyReports;
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

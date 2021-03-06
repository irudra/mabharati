package com.rudra.calc.bs.report.generator;

import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.stereotype.Service;

import com.rudra.calc.bs.report.MonthlyReport;
import com.rudra.calc.bs.report.input.DepositInput;
import com.rudra.calc.bs.report.input.EstimationInput;
import com.rudra.calc.bs.report.input.LoanInput;
import com.rudra.calc.bs.report.output.DepositReport;
import com.rudra.calc.bs.report.output.EstimationReport;
import com.rudra.calc.bs.report.output.LoanReport;

@Service
public class EstimationReportGenerator implements ReportGenerator {

	int[] monthDate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	Queue<Integer> repaymentQueue = new ArrayDeque<>(20);

	@Override
	public EstimationReport generateReport(EstimationInput input) {
		DepositInput depositInput = input.getDepositInput();
		LoanInput loanInput = input.getLoanInput();
		Calendar cal = Calendar.getInstance();
		cal.setTime(input.getStartDate());
		double totalInterest = 0;
		double loanRepayment = loanInput.getOutLoan();
		double totalDeposite = depositInput.getInitialDeposit();
		double interestOnDeposite = 0;
		double eligibleForLoan = 0;
		double currentMonthInterest = 0;

		double intrestPerMonthLoan = loanInput.getIntrestRateOnLoan() / 12;
		double intrestPerMonthDeposite = depositInput.getAnnualRateOfIntrestOnDeposit() / 12;
		System.out.println("Intrest per month loan" + intrestPerMonthLoan);
		System.out.println("Intrest per month deposite" + intrestPerMonthDeposite);
		List<MonthlyReport> monthlyReports = new LinkedList<>();
		while (cal.getTime().before(input.getEstimationDate())) {
			cal.add(Calendar.MONTH, 1);
			totalDeposite = totalDeposite + depositInput.getSubscriptionAmount() * depositInput.getSucscriptionNumber();
			interestOnDeposite = interestOnDeposite + ((totalDeposite * intrestPerMonthDeposite) / 100);
			eligibleForLoan = (loanRepayment + totalInterest + totalDeposite);// -
																				// interestOnDeposite;
			currentMonthInterest = (eligibleForLoan * intrestPerMonthLoan) / 100;
			totalInterest = totalInterest + currentMonthInterest;
			loanRepayment = eligibleForLoan / loanInput.getAvgPeriod();
			MonthlyReport monthlyReport = new MonthlyReport(cal.getTime(), totalDeposite, interestOnDeposite,
					eligibleForLoan, currentMonthInterest, totalInterest, loanRepayment);
			monthlyReports.add(monthlyReport);
		}

		EstimationReport report = new EstimationReport();
		report.setBalance(eligibleForLoan);
		DepositReport dReport = new DepositReport();
		dReport.setTotalInvestmentCollected(totalDeposite-depositInput.getInitialDeposit());
		dReport.setDepositAmount(totalDeposite);
		dReport.setIntrestOnDeposit(interestOnDeposite);
		dReport.setGrossDepostiAmount(dReport.getDepositAmount()+interestOnDeposite);
		LoanReport lReport = new LoanReport();
		lReport.setElgibleLoanAmount(eligibleForLoan);
		lReport.setIntrestForNextMonth(currentMonthInterest);
		lReport.setIntrestTillDate(totalInterest);
		lReport.setLoandisbursed(eligibleForLoan);
		report.setDepositReport(dReport);
		report.setLoanReport(lReport);
		report.setMonthlyReports(monthlyReports);
		return report;
	}

}

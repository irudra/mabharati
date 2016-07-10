package com.rudra.calc.bs.report.generator;

import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Queue;

import com.rudra.calc.bs.report.input.DepositInput;
import com.rudra.calc.bs.report.input.EstimationInput;
import com.rudra.calc.bs.report.input.LoanInput;
import com.rudra.calc.bs.report.output.DepositReport;
import com.rudra.calc.bs.report.output.EstimationReport;
import com.rudra.calc.bs.report.output.LoanReport;

public class EstimationReportGenerator implements ReportGenerator{

	int[] monthDate = {31, 28, 31,30,31,30,31,31,30,31,30,31};
	
	Queue<Integer> repaymentQueue = new ArrayDeque<>(20);
	
	@Override
	public EstimationReport generateReport(EstimationInput input) {
		double totalInterest =0;
		double loanRepayment = 0;
		double totalDeposite =0;
		double interestOnDeposite=0;
		double eligibleForLoan =0;
		double currentMonthInterest =0;
		DepositInput depositInput = input.getDepositInput();
		LoanInput loanInput = input.getLoanInput(); 
		Calendar cal = Calendar.getInstance();
		double intrestPerMonthLoan = loanInput.getIntrestRateOnLoan()/12;
		double intrestPerMonthDeposite = depositInput.getAnnualRateOfIntrestOnDeposit()/12;
		System.out.println("Intrest per month loan" + intrestPerMonthLoan);
		System.out.println("Intrest per month deposite" + intrestPerMonthDeposite);
		int count =0;
		while(cal.getTime().before(input.getEstimationDate())){
			cal.add(Calendar.MONTH, 1);
			totalDeposite= totalDeposite+depositInput.getSubscriptionAmount()*depositInput.getSucscriptionNumber();
			interestOnDeposite = interestOnDeposite+((totalDeposite * intrestPerMonthDeposite)/100);
			eligibleForLoan = (loanRepayment + totalInterest+totalDeposite);// - interestOnDeposite;
			currentMonthInterest = (eligibleForLoan*intrestPerMonthLoan)/100;
			totalInterest = totalInterest + currentMonthInterest;
			loanRepayment = eligibleForLoan/loanInput.getAvgPeriod();
			System.out.println("Report for Month : " + cal.getTime());
			System.out.println("Deposite : "+totalDeposite);
			System.out.println("Interest on deposit : "+interestOnDeposite);
			System.out.println("Eligible for loan : "+eligibleForLoan);
			System.out.println("current month Interest : "+currentMonthInterest);
			System.out.println("Total Interest : "+totalInterest);
			System.out.println("Loan Repayment : "+loanRepayment);
			System.out.println();
			System.out.println();
		}
		
		EstimationReport report = new EstimationReport();
		report.setBalance(eligibleForLoan);
		DepositReport dReport = new DepositReport();
		dReport.setDepositAmount(totalDeposite);
		dReport.setIntrestOnDeposit(interestOnDeposite);
		LoanReport lReport = new LoanReport();
		lReport.setElgibleLoanAmount(eligibleForLoan);
		lReport.setIntrestForNextMonth(currentMonthInterest);
		lReport.setIntrestTillDate(totalInterest);
		lReport.setLoandisbursed(eligibleForLoan);
		report.setDepositReport(dReport);
		report.setLoanReport(lReport);
		return report;
	}

}

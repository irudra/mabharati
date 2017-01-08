package com.rudra.calc.bs.test;

import java.util.Calendar;

import com.rudra.calc.bs.report.generator.EstimationReportGenerator;
import com.rudra.calc.bs.report.generator.ReportGenerator;
import com.rudra.calc.bs.report.input.DepositInput;
import com.rudra.calc.bs.report.input.EstimationInput;
import com.rudra.calc.bs.report.input.LoanInput;

public class Main {

	public static void main(String[] args) {
		EstimationInput input = new EstimationInput();
		DepositInput dInput = new DepositInput();
		LoanInput iInput = new LoanInput();
		iInput.setAvgPeriod(20);
		iInput.setIntrestRateOnLoan(12);
		dInput.setAnnualRateOfIntrestOnDeposit(10);
		dInput.setSubscriptionAmount(500);
		dInput.setSucscriptionNumber(2000);
		input.setDepositInput(dInput);
		input.setLoanInput(iInput);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 10);
		input.setEstimationDate(c.getTime());
		ReportGenerator generator = new EstimationReportGenerator();
		generator.generateReport(input);
	}

}

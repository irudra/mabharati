package com.rudra.calc.bs.report.input;

import java.util.Date;

public class EstimationInput {

	private DepositInput depositInput;
	private LoanInput loanInput;
	private Date estimationDate;

	public DepositInput getDepositInput() {
		return depositInput;
	}

	public void setDepositInput(DepositInput depositInput) {
		this.depositInput = depositInput;
	}

	public LoanInput getLoanInput() {
		return loanInput;
	}

	public void setLoanInput(LoanInput loanInput) {
		this.loanInput = loanInput;
	}

	public Date getEstimationDate() {
		return estimationDate;
	}

	public void setEstimationDate(Date estimationDate) {
		this.estimationDate = estimationDate;
	}
}

package com.rudra.calc.bs.report.input;

public class LoanInput {
	private float intrestRateOnLoan;
	private int avgPeriod;
	private double outLoan;
	
	public float getIntrestRateOnLoan() {
		return intrestRateOnLoan;
	}

	public void setIntrestRateOnLoan(float intrestRateOnLoan) {
		this.intrestRateOnLoan = intrestRateOnLoan;
	}

	public int getAvgPeriod() {
		return avgPeriod;
	}

	public void setAvgPeriod(int avgPeriod) {
		this.avgPeriod = avgPeriod;
	}

	public void setOutLoan(double outLoan){
		this.outLoan=outLoan;
	}
	
	public double getOutLoan() {
		// TODO Auto-generated method stub
		return outLoan;
	}
}

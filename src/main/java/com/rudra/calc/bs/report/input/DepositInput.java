package com.rudra.calc.bs.report.input;

public class DepositInput {

	private double initialDeposit =0;
	private int subscriptionAmount;
	private int sucscriptionNumber;
	private float annualRateOfIntrestOnDeposit;

	public int getSubscriptionAmount() {
		return subscriptionAmount;
	}

	public void setSubscriptionAmount(int subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
	}

	public int getSucscriptionNumber() {
		return sucscriptionNumber;
	}

	public void setSucscriptionNumber(int sucscriptionNumber) {
		this.sucscriptionNumber = sucscriptionNumber;
	}

	public float getAnnualRateOfIntrestOnDeposit() {
		return annualRateOfIntrestOnDeposit;
	}

	public void setAnnualRateOfIntrestOnDeposit(
			float annualRateOfIntrestOnDeposit) {
		this.annualRateOfIntrestOnDeposit = annualRateOfIntrestOnDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		// TODO Auto-generated method stub
		this.initialDeposit = initialDeposit;
	}
	
	public double getInitialDeposit() {
		// TODO Auto-generated method stub
		return initialDeposit;
	}

}

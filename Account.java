package com.wipro.bank.acc;

public abstract class Account {

	private int tenure;
	private float principal;
	private float rateOfInterest;

	public Account(int tenure, float principal) {
		this.tenure = tenure;
		this.principal = principal;
	}

	public void setInterest(int age, String gender) {

		if ("Male".equalsIgnoreCase(gender) && age < 60)
			rateOfInterest = (float) 9.8;

		if ("Male".equalsIgnoreCase(gender) && age >= 60)
			rateOfInterest = (float) 10.5;

		if ("Female".equalsIgnoreCase(gender) && age < 58)
			rateOfInterest = (float) 10.2;

		if ("Female".equalsIgnoreCase(gender) && age >= 58)
			rateOfInterest = (float) 10.8;
	}

	public float calculateMaturityAmount(float totalPrincipleDeposited, float maturityInterest) {
		return totalPrincipleDeposited + maturityInterest;
	}

	public int getTenure() {
		return tenure;
	}

	public float getPrincipal() {
		return principal;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public abstract float calculateInterest();

	public abstract float calculateAmountDeposited();
}

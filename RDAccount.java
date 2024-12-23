package com.wipro.bank.acc;

public class RDAccount extends Account {

	public RDAccount(int tenure, float principal) {
		super(tenure, principal);
	}

	@Override
	public float calculateAmountDeposited() {
		return super.getPrincipal() * super.getTenure() * 12;
	}

	@Override
	public float calculateInterest() {

		float P = super.getPrincipal();
		float r = super.getRateOfInterest() / 100;
		float n = 4f;
		int totalMonths = super.getTenure() * 12;
		float totalInterest = 0.0f;

		for (int i = 0; i < totalMonths; i++) {
			float t = (float) (totalMonths - i) / 12;
			float pow = (float) Math.pow(1 + r / n, n * t);
			float monthInterest = P * (pow - 1);
			totalInterest += monthInterest;
		}

		return totalInterest;
	}
}

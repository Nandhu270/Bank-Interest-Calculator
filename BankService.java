package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {

	public boolean validateData(float principal, int tenure, int age, String gender) {

		try {

			if (principal < 500) {
				throw new BankValidationException("Principal for RD should be a minimum of 500.");
			}

			if (tenure != 5 && tenure != 10) {
				throw new BankValidationException("Tenure should be either 5 or 10 years.");
			}

			if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
				throw new BankValidationException("Gender can be either 'male' or 'female'.");
			}

			if (age < 1 || age > 100) {
				throw new BankValidationException("Age should be between 1 and 100.");
			}

			return true;

		} catch (BankValidationException e) {
			System.out.println(e.toString());
			return false;
		}
	}

	public void calculate(float principal, int tenure, int age, String gender) {

		if (validateData(principal, tenure, age, gender)) {

			RDAccount r1 = new RDAccount(tenure, principal);
			r1.setInterest(age, gender);

			float maturityInterest = r1.calculateInterest();
			float totalPrincipleDeposited = r1.calculateAmountDeposited();
			float maturityAmount = r1.calculateMaturityAmount(totalPrincipleDeposited, maturityInterest);

			System.out.println("Total Interest : " + maturityInterest);
			System.out.println("Amount Deposited : " + totalPrincipleDeposited);
			System.out.println("Maturity Amount : " + maturityAmount);
		}
	}
}

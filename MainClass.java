package com.wipro.bank.main;

import java.util.Scanner;
import com.wipro.bank.service.BankService;

public class MainClass {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int tenure, age;
		float principal;
		String gender;

		System.out.println("Enter the Principal Amount , Tenure , Age , Gender :  ");
		principal = input.nextFloat();
		tenure = input.nextInt();
		age = input.nextInt();
		gender = input.next();

		BankService b1 = new BankService();

		b1.calculate(principal, tenure, age, gender);

	}
}

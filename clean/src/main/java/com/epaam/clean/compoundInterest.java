package com.epaam.clean;

public class compoundInterest {
	double calculate_Interest(int principal,int time,double interest_rate,int n) {
		int nt=n*time;
		double amount=1+(interest_rate/n);
		double interest=Math.pow(amount, nt);
		interest=principal*interest;
		interest=interest-principal;
		return interest;
	}

}

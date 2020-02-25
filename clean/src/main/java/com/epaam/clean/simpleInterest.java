package com.epaam.clean;

public class simpleInterest {
double interest;
	
	double calculateInterest(int principal,int time,double interest_rate) {
		interest=(principal*time*interest_rate)/100;
		return interest;
	}


}

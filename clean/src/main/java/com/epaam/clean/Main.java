package com.epaam.clean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Main {
	private static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String[] args)
	{
		simpleInterest si=new simpleInterest();
		double interest=si.calculateInterest(100000,5,0.05);
		LOGGER.debug("Simple Interest is "+interest);
		
		compoundInterest ci=new compoundInterest();
		double c_interest=ci.calculate_Interest(10000,5,0.05,4);
		LOGGER.fatal("Compound Interest is "+c_interest);
		
		
		
	}

}

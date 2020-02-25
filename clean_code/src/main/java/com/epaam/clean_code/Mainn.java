package com.epaam.clean_code;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


	public class Mainn {
		
			private static final Logger LOGGER=LogManager.getLogger(Mainn.class);
			public static void main(String[] args)
			{
			construction c=new construction();
			double cost_required=c.constructionCost(1500, 1000, "No");
			LOGGER.info("cost required for construction of house is "+cost_required);
		}

}

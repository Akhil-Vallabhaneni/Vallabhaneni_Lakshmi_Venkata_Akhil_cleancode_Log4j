package com.epaam.clean_code;

public class construction {
	double cost;
	double Cost(int standard,int area)
	{
		cost=standard*area;
		return cost;
	}
	double constructionCost(int standard,int area,String automatedOrNot)
	{
		if(automatedOrNot=="fullyAutomatedHouse" && standard==2500)
		{
		cost=	Cost(standard,area);
		}
		else if(standard==1200)
		{
			cost=Cost(standard,area);
		}
		else if(standard==1500)
			{
		cost=	Cost(standard,area);	
			}
		else
		{
			cost=Cost(standard,area);
		}
		return cost;
	}

}

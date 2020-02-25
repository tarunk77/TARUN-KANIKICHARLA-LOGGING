import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseCost {
	private static final Logger LOGGER = LogManager.getLogger(HouseCost.class);
float cost(int type,float area)
{
	LOGGER.info("Calculating cost of house");
	float res=0;
	if(type==1)
	{
		res= (float)(1200*area);
	}
	else if(type==2)
	{
		res= (float)(1500*area);
	}
	else if(type==3)
	{
		res= (float)(1800*area);
	}
	else if(type==4)
	{
		res= (float)(2500*area);
	}
	LOGGER.info("Returning cost");
	return Math.round(res);
}
}

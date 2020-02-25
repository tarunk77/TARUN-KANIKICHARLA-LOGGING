import java.lang.Math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Compound {
	private static final Logger LOGGER = LogManager.getLogger(Compound.class);
double compoundInterest(float p,double r,double t)
{
	LOGGER.info("Calculating Compound Interest");
	double res,y;
	y=Math.pow(1+r/100,t);
	res=p*y;
	LOGGER.info("Returning Compound interest");
	return res;
}
}

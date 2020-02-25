import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simple {
	private static final Logger LOGGER = LogManager.getLogger(Simple.class);
	float simpleInterest(float p,int r,int t)
	{
		LOGGER.info("Calculating Simple Interest");
		return ((p*t*r)/100);
	}

}

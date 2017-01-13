package EduJava.M7.racecondition;

import org.apache.log4j.Logger;

/**
 * A class that prints random numbers.
 * @author pbose
 *
 */
public final class RandomNumberPrinter
{
	private static Logger logger = Logger.getLogger(RandomNumberPrinter.class.getName());
	
	public void printRandomNumbers(int n)
	{
		logger.debug(this.getClass().getName() + " entered.");
		
		for (int i = 0; i < n; i++)
			System.out.println((int)(Math.random()*1000));

		logger.debug(this.getClass().getName() + " exited.");
	}
}
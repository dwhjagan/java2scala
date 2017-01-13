package EduJava.M7.sync;

import org.apache.log4j.Logger;

/**
 * A class that prints integer tables till 10.
 * @author pbose
 *
 */
public final class IntegerTables
{
	private static Logger logger = Logger.getLogger(IntegerTables.class.getName());
	
	/**
	 * Synchronized method such that only one thread can execute this at a time.
	 * @param n
	 */
	public synchronized void printTables(int n)
	{
		logger.debug(this.getClass().getName() + " entered.");
		
		for (int i = 1; i <= 10; i++)
			System.out.println(i * n);

		logger.debug(this.getClass().getName() + " exited.");
	}
}
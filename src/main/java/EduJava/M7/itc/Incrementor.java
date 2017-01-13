package EduJava.M7.itc;

import org.apache.log4j.Logger;

/**
 * A class demonstrating wait/notify methods.
 * @author pbose
 *
 */
public final class Incrementor 
{
	private static Logger logger = Logger.getLogger(Incrementor.class.getName());
	
	/**
	 * Variables used by the threads
	 */
	private volatile int nCounter;
	private volatile boolean bEcho = true;
	
	public Incrementor(int nCounter)
	{ this.nCounter = nCounter; }
	
	/**
	 * Increments a counter.
	 * @throws InterruptedException
	 */
	public synchronized void incrementCounter() throws InterruptedException
	{
		// If flag=true increment the counter, set flag=false and notify other thread.
		if (!bEcho)
		{
			++nCounter;
			logger.debug(this.getClass().getName() + ": Counter incremented to " + nCounter);
			bEcho = true;
			notify();
		}
		// If flag=false, wait for the other thread to echo.
		else 
			wait();
	}
	
	/**
	 * Echoes the counter value to the console.
	 * @throws InterruptedException
	 */
	public synchronized void echoCounter() throws InterruptedException
	{
		// If flag=false echo the counter, set flag=true and notify other thread to increment.
		if (bEcho)
		{
			System.out.println(nCounter);
			logger.debug(this.getClass().getName() + ": Counter value echoed is " + nCounter);
			bEcho = false;
			notify();
		}
		// If flag=true, wait for the other thread to increment.
		else
			wait();
	}
}

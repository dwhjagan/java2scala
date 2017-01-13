package EduJava.M7.itc;

import org.apache.log4j.Logger;

public class Counter 
{
	private static Logger logger = Logger.getLogger(Counter.class.getName());
	private volatile boolean bFinished = false;
	private volatile int nCounter = 0;
	private int loopCounter = 0;
	Object lock = new Object();

	public Counter(int loopCounter)
	{ this.loopCounter = loopCounter; }
	
	public void incrementCounter() throws InterruptedException
	{
		logger.debug(this.getClass().getName() + " entering incrementCounter().");

		synchronized (lock) 
		{
			if (!bFinished)
			{
				for (int i = 0; i < loopCounter; i++)
				{
					++nCounter;
					System.out.println(this.getClass().getName() + " " + nCounter);
					Thread.sleep(1000);
				}
				
				bFinished = true;
			}
			lock.notify();
		}
	
		logger.debug(this.getClass().getName() + " exiting incrementCounter().");
	}

	public void decrementCounter() throws InterruptedException
	{
		logger.debug(this.getClass().getName() + " entering decrementCounter().");
		
		synchronized (lock) 
		{
			// In case lock is acquired wait for incrementCounter() to finish.
			if (!bFinished) 
				lock.wait();

			if (bFinished)
			{
				for (int i = loopCounter; i > 1; i--)
				{
					--nCounter;
					System.out.println(this.getClass().getName() + " " + nCounter);
					Thread.sleep(1000);
				}

				bFinished = false;
			}
		}

		logger.debug(this.getClass().getName() + " exiting decrementCounter().");
	}
}

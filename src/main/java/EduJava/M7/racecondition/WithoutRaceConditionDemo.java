package EduJava.M7.racecondition;

import org.apache.log4j.Logger;

/**
 * Demonstrates how to avoid a race condition.
 * 2 threads print 5 random numbers but in a particular order.
 * @author pbose
 *
 */
public final class WithoutRaceConditionDemo 
{
	private static Logger logger = Logger.getLogger(WithoutRaceConditionDemo.class.getName());
	
	public static void main(String[] args) throws InterruptedException 
	{
		logger.info("Entering programme...");
		RandomNumberPrinter rnp = new RandomNumberPrinter();
		Thread t1 = new Thread(new Task1(rnp));
		t1.start();
		Thread t2 = new Thread(new Task2(rnp));
		t2.start();
		
		t1.join();
		t2.join();
		logger.info("Exiting programme...");
	}
	
	private static class Task1 implements Runnable
	{
		private RandomNumberPrinter rnp = null;
		
		public Task1(RandomNumberPrinter rnp)
		{ this.rnp = rnp; }
		
		@Override
		public void run() 
		{
			/*
			 * The ordering is guaranteed by synchronizing or getting a 
			 * lock on the rnp object.
			 */
			synchronized (rnp) 
			{
				logger.debug(this.getClass().getName() + " running");
				rnp.printRandomNumbers(5);
				logger.debug(this.getClass().getName() + " exiting");
			}
		}		
	}
	
	private static class Task2 implements Runnable
	{
		private RandomNumberPrinter rnp = null;
		
		public Task2(RandomNumberPrinter rnp)
		{ this.rnp = rnp; }
		
		@Override
		public void run() 
		{
			/*
			 * The ordering is guaranteed by synchronizing or getting a 
			 * lock on the rnp object.
			 */
			synchronized (rnp) 
			{
				logger.debug(this.getClass().getName() + " running");
				rnp.printRandomNumbers(5);
				logger.debug(this.getClass().getName() + " exiting");
			}
		}		
	}
}

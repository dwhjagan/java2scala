package EduJava.M7.deadlock;

import org.apache.log4j.Logger;

/**
 * A class to demostrate deadlocks
 * @author pbose
 *
 */
public final class Deadlock 
{
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	private static Logger logger = Logger.getLogger(Deadlock.class.getName());

	public static void main(String[] args) throws InterruptedException 
	{
		logger.info("Entering programme...");
		
		Thread t1 = new Thread(new Task1());
		t1.start();
		Thread t2 = new Thread(new Task2());
		t2.start();
		
		t1.join();
		t2.join();
		logger.info("Exiting programme...");
	}

	/**
	 * Task1 acquires lock1 and wants lock2.
	 * @author pbose
	 *
	 */
	private static class Task1 implements Runnable
	{
		@Override
		public void run() 
		{
			synchronized (lock1) 
			{ 
				logger.debug("Acquired lock1...");
				
				try 
				{ Thread.sleep(3000); } 
				catch (InterruptedException e) 
				{ e.printStackTrace(); }
				
				synchronized (lock2) 
				{ logger.debug("Wish to get lock2..."); }				
			}
		}
		
	}
	
	/**
	 * Task2 acquires lock2 and wants lock1.
	 * @author pbose
	 *
	 */
	private static class Task2 implements Runnable
	{
		@Override
		public void run() 
		{
			synchronized (lock2) 
			{ 
				logger.info("Acquired lock2...");
				
				try 
				{ Thread.sleep(2000); } 
				catch (InterruptedException e) 
				{ e.printStackTrace(); }
				
				synchronized (lock1) 
				{ logger.info("Wish to get lock1..."); }				
			}
		}
	}
}

package EduJava.M7.deadlock;

import org.apache.log4j.Logger;

/**
 * A class to demostrate how to avoid deadlocks, this code is a 
 * modification of the {@link module7.deadlock.Deadlock} class.
 * The cirular wait condition is violated, hence deadlock does not happen.
 * @author pbose
 *
 */
public final class AvoidDeadlock 
{
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	private static Logger logger = Logger.getLogger(AvoidDeadlock.class.getName());

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
	 * Task1 acquires lock1 and wants lock2.
	 * @author pbose
	 *
	 */
	private static class Task2 implements Runnable
	{
		@Override
		public void run() 
		{
			synchronized (lock1) 
			{ 
				logger.debug("Acquired lock1...");
				
				try 
				{ Thread.sleep(2000); } 
				catch (InterruptedException e) 
				{ e.printStackTrace(); }
				
				synchronized (lock2) 
				{ logger.debug("Wish to get lock2..."); }				
			}
		}
	}
}

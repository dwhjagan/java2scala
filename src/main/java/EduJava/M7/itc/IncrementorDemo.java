package EduJava.M7.itc;

import org.apache.log4j.Logger;

public final class IncrementorDemo 
{
	private static final Logger logger = Logger.getLogger(IncrementorDemo.class.getName());
	private static final int LOOP_ITERATION = 5;
	
	public static void main(String [] args) throws InterruptedException
	{
		logger.info("Entering programme...");
		
		Incrementor c = new Incrementor(1);
		Thread t1 = new Thread(new Task1(c));
		t1.start();
		Thread t2 = new Thread(new Task2(c));
		t2.start();
		
		t1.join();
		t2.join();
		logger.info("Exiting programme...");
	}
	
	private static class Task1 implements Runnable
	{
		private Incrementor inc = null;
		
		public Task1(Incrementor counter)
		{ this.inc = counter; }
		
		@Override
		public void run() 
		{
			for (int i = 0; i < LOOP_ITERATION; i++)
			{
				try 
				{
					// echo and sleep for 1 sec
					inc.echoCounter();
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	private static class Task2 implements Runnable
	{
		private Incrementor inc = null;
		
		public Task2(Incrementor counter)
		{ this.inc = counter; }
		
		@Override
		public void run() 
		{
			for (int i = 0; i < LOOP_ITERATION; i++)
			{
				try 
				{
					// increment and sleep for 1 sec
					inc.incrementCounter();
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}

package EduJava.M7.itc;

import org.apache.log4j.Logger;

public final class CounterDemo 
{
	private static final Logger logger = Logger.getLogger(IncrementorDemo.class.getName());

	public static void main(String[] args) throws InterruptedException 
	{
		if (args.length != 1)
		{
			System.out.println("Usage: module7.itc.CounterDemo number_of_iterations");
			System.exit(-1);
		}
		logger.info("Entering programme...");
		
		Counter c = new Counter(Integer.parseInt(args[0]));
		
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
		private Counter counter = null;
		
		public Task1(Counter counter)
		{ this.counter = counter; }
		
		@Override
		public void run() 
		{
			try 
			{
				counter.incrementCounter();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	private static class Task2 implements Runnable
	{
		private Counter counter = null;
		
		public Task2(Counter counter)
		{ this.counter = counter; }
		
		@Override
		public void run() 
		{
			try 
			{
				counter.decrementCounter();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

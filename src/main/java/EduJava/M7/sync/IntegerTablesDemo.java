package EduJava.M7.sync;

import org.apache.log4j.Logger;

public final class IntegerTablesDemo 
{
	private static Logger logger = Logger.getLogger(IntegerTablesDemo.class.getName());
	private IntegerTables it = new IntegerTables();
	
	public static void main(String[] args) throws InterruptedException 
	{
		logger.info("Entering programme...");
		IntegerTablesDemo itd = new IntegerTablesDemo();
		Thread t1 = new Thread(new Task1(itd.it));
		t1.start();
		
		Thread t2 = new Thread(new Task2(itd.it));
		t2.start();
		
		t1.join();
		t2.join();
		
		logger.info("Exiting programme...");
	}

	private static class Task1 implements Runnable
	{
		IntegerTables it = null;
		
		public Task1(IntegerTables it)
		{ this.it = it; }
		
		@Override
		public void run() 
		{
			logger.debug(this.getClass().getName() + " running");
			it.printTables(7);;
			logger.debug(this.getClass().getName() + " exiting");
		}		
	}
	
	private static class Task2 implements Runnable
	{
		IntegerTables it = null;
		
		public Task2(IntegerTables it)
		{ this.it = it; }
		
		@Override
		public void run() 
		{
			logger.debug(this.getClass().getName() + " running");
			it.printTables(4);;
			logger.debug(this.getClass().getName() + " exiting");
		}		
	}
}

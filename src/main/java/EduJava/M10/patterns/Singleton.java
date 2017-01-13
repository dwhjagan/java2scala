package EduJava.M10.patterns;

public final class Singleton 
{
	private static Singleton instance = null;
	
	// constructor is always private
	private Singleton() {}
	
	// "synchronized" guarantees single instance is multi-threaded apps
	public static synchronized Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();
		
		return instance;
	}
}

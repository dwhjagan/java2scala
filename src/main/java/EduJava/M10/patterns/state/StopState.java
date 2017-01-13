package EduJava.M10.patterns.state;

class StopState implements MediaState 
{
	@Override
	public void performAction(MediaPlayer context) 
	{
		System.out.println("Stopped.");
	}
}

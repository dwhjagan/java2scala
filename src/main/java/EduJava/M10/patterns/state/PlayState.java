package EduJava.M10.patterns.state;

class PlayState implements MediaState 
{
	@Override
	public void performAction(MediaPlayer context) 
	{		
		System.out.println("Playing...");
	}
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class QuitButton extends Button
{
    GameManager gm = GameManager.getInstance();
	public void act() 
	{
	    
		if (Greenfoot.mouseClicked(this))
		{
		    System.out.println("Stop button clicked");
			gm.stop();
		}
	}    
}

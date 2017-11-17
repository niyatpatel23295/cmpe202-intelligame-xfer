import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExitButton extends Button
{
    GameManager gm = GameManager.getInstance();
	public void act() 
	{
	    
		if (Greenfoot.mouseClicked(this))
		{
		    System.out.println("Exit button clicked");
			gm.start();
		}
	}    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class QuitButton extends Button
{
	public void act() 
	{
		if (Greenfoot.mouseClicked(this))
		{
			Greenfoot.stop(); //quits game
		}
	}    
}

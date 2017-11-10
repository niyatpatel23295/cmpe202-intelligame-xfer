import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TryAgain extends Button
{
	public void act() 
	{
		if (Greenfoot.mouseClicked(this))
			Greenfoot.setWorld(new MyWorld());
	}    
}

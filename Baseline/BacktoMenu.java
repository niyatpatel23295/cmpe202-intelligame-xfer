import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * button for linking to menu screen.
 * 
 * @author Ambika Bohra
 * @version 10/31/17
 */
public class BacktoMenu extends Button
{
	public void act() 
	{
		if (Greenfoot.mouseClicked(this))
			Greenfoot.setWorld(new HomeWorld());    
	}
}

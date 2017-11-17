import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BacktoMenu here.
 * 
 * @author Ambika Bohra
 * @version 10/31/17
 */
public class BacktoMenu extends Button
{
    /**
     * Act - do whatever the BacktoMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.mouseClicked(this))
        {
        Greenfoot.setWorld(new HomeWorld());    
        }
        
    }
}

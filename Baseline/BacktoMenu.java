import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * button for linking to menu screen.
 * 
 * @author Ambika Bohra
 * @version 10/31/17
 */
public class BacktoMenu extends Button
{
    GameManager gm = GameManager.getInstance();
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            ScoreScreen.getInstance().reset();
        	gm.showState();
           gm.start();

        }
    }
}

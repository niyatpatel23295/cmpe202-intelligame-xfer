import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class NextLevel extends Button
{
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     // Add your action code here.
        public void act() 
        {
        if (Greenfoot.mouseClicked(this))
        {
              Greenfoot.setWorld(new Level2World());
        }
        // Add your action code here.
    }    
}

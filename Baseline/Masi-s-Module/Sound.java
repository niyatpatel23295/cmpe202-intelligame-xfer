import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sound extends Button
{
    /**
     * Act - do whatever the sound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean flag = true;
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            flag = !flag; //change flag value (true if false) or (false if true;
            
            ((Sound)getWorld().getObjects(Sound.class).get(0)).setImage(new GreenfootImage("sound" +flag + ".png"));
            
            if (flag == false)
               ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().pause();
            else
               ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().play();
            }
        
  }    
}

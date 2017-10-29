import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeScreen extends Actor
{
    /**
     * Act - do whatever the LifeScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int life = 3;
    public LifeScreen() 
    {
        super();
         addObject(new Heart(), 200, 100);
          addObject(new Heart(), 230, 100);
           addObject(new Heart(), 260, 100);
        //GreenfootImage im1 = new GreenfootImage("herz.png");
       // setImage(im1);    
    }
    public void updateLife() 
    {
        
        // Add your action code here.
    }    
}

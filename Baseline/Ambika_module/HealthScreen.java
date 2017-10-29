import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Font;
import greenfoot.GreenfootImage;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthScreen extends ConcreteObserver
{
    /**
     * Act - do whatever the HealthScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int health = 4;
    public HealthScreen() 
    {
        super();
        GreenfootImage im1 = new GreenfootImage("health4.png");
        setImage(im1);    
    }

 
    public void updatePoints(int score)
  {
      //score = subject.getScore(); //get score from concretsubject class
      health += score;
      if(getHealth() > 4)
        health = 4;
    
      if (getHealth() == 0)
      {
        setImage("health.png");
        ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().stop();
        ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
        //getWorld().addObject(new GameOver(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        
        new GreenfootSound("game-over.wav").play();
        getWorld().addObject(new GameOver(), 400, 150);
        getWorld().addObject(new TryAgain(), 400, 250);
      };
      setImage("health"+health+".png");
 
  }  
     public int getHealth()
    {
        return health;
    }
}

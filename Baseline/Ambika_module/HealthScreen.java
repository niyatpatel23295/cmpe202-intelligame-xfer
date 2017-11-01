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
 * @author Ambika Bohra
 * @version 10/31/17
 */
public class HealthScreen extends ConcreteObserver
{
    /**
     * Act - do whatever the HealthScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  private int health;
  public HealthScreen() 
  {
     super();
     GreenfootImage im1 = new GreenfootImage("health4.png");
     setImage(im1);   
     health = 4;
  }

 
  public void updatePoints(int score)
  {
    health += score;
    
    if(health > 4)
        health = 4;
    
    if (health <= 0)
    {
        setImage("health0.png");
        ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().stop();
        ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
        Greenfoot.setWorld(new GameOverState()); //go to new World "game Over State"
    }
    else
    {
      setImage("health"+health+".png");
    }
 
  }  
}

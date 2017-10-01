
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;


public class Trash
  extends Actor
{
  public Trash() {}
  
  public void act()
  {
    if (isTouching(Monkey.class)) {
      ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
      getWorld().addObject(new GameOver(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
      ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().stop();
      
      new GreenfootSound("game-over.wav").play();
      
      Greenfoot.stop();
    }
  }
}

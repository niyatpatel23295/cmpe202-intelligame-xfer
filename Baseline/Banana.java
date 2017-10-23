
import greenfoot.Actor;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;


public class Banana extends Actor
{
  GreenfootSound sound = new GreenfootSound("banana.wav");
  
  public Banana() {}
  
  public void act() { if (isTouching(Monkey.class)) {
      sound.play();
      ((ScoreScreen)getWorld().getObjects(ScoreScreen.class).get(0)).updatePoints(1);
      getWorld().removeObject(this);
    }
  }
}

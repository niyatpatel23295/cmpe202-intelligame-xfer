
import greenfoot.GreenfootSound;
import greenfoot.Actor;
import greenfoot.World;
import java.util.List;

public class Coin extends Actor implements ISnack{

	GreenfootSound sound = new GreenfootSound("banana.wav");
	  
	  public Coin() {}
	  
	  public void act() { if (isTouching(Monkey.class)) {
	      sound.play();
	      //((ScoreScreen)getWorld().getObjects(ScoreScreen.class).get(0)).updatePoints(1);
	      getWorld().removeObject(this);
	    }
	  }
}
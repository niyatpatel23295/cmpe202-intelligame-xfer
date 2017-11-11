
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;


public class Cactus extends ConcreteSubject
{

	public void act()
	{

		if (isTouching(Monkey.class) && (flag == false)) {
			((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
			setState("enemy");
			new GreenfootSound("power-down.wav").play();
			setFlag(true);
		}
	}
}

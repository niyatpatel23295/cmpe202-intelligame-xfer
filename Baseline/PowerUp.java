import greenfoot.Actor;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;
/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends SnackActor implements ISnack
{
	GreenfootSound sound = new GreenfootSound("power-up.wav");

	public PowerUp() {}

	public void act() 
	{ 
		if (isTouching(Monkey.class)) 
		{
			sound.play();
			//this.setScore(2);
			((HealthScreen)getWorld().getObjects(HealthScreen.class).get(0)).updateHealth(2);
			getWorld().removeObject(this);
		}
	}
}  
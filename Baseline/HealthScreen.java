import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Font;
import greenfoot.GreenfootImage;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;
/**
 * record of player health .
 * initial health is 4
 * enemy reduces it by 1
 * power increases by 2
 * game over if health is zero
 * 
 */
public class HealthScreen extends Actor
{
    private int health;

    public HealthScreen() 
    {
        super();
        GreenfootImage im1 = new GreenfootImage("health4.png");
        setImage(im1);  
        health = 4;   //set initial health to 4 (100%)
    }

    public void updateHealth(int damage)
    {
        health += damage;
        
        if(getHealth() > 4) //max health is 4
            health = 4;
        
        if (getHealth() <= 0) //game over if health is zero
        {
            setImage("health0.png");
            ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getMusic().stop();
            ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
            Greenfoot.setWorld(new GameOverState()); 
        }
        else
            setImage("health"+health+".png");
    }  
    public int getHealth()
    {
        return health;
    }

}


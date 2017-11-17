
import greenfoot.GreenfootSound;
import greenfoot.Actor;
import greenfoot.World;
import java.util.List;

public class Coin extends Actor implements ISnack {

    GreenfootSound sound = new GreenfootSound("banana.wav");
    private boolean flag = false; 
    
    public Coin() {}
      
    public void setFlag(boolean value)
    {
        flag = value;
    }
    
    public void act()
    {
        if ( !isTouching(Monkey.class) ) { setFlag(false); }
            

        if ( isTouching(Monkey.class) && (flag == false) ) {
            //((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
            ((HealthScreen)getWorld().getObjects(HealthScreen.class).get(0)).updateHealth(-1);
            new GreenfootSound("coin.wav").play();
            setFlag(true);
        }
        
    }
}
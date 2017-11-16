import greenfoot.Actor;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;

/*
Fcatory Design Pattern
PowerUp.java :: Extra Snack for level 1
*/

public class PowerUp extends Actor implements ISnack { // extends ConcreteSubjectObserverPattern
 
    GreenfootSound sound = new GreenfootSound("power-up.wav");
  
  public PowerUp() {
    
    }
  
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


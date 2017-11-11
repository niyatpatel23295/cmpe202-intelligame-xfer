package MrMonkey;

/*
Cactus.java :: Default snack
Created by: Masi Nazarian
Date: 11/10/2017
*/

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;

public class Cactus extends ConcreteSubject implements ISnack 
{
  private boolean flag = false;
 
  public Cactus() {
   
    }
   public void setFlag(boolean value)
    {
        flag = value;
    }
  public void act()
  {
      
    if (isTouching(Monkey.class) && (flag == false)) {
      ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
      this.setScore(-1);
      //((HealthScreen)getWorld().getObjects(HealthScreen.class).get(0)).updatePoints(-1);
      new GreenfootSound("power-down.wav").play();
      setFlag(true);
    }
    
  }
  
}

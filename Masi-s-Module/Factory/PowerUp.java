package MrMonkey;

import greenfoot.Actor;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;
/*
PowerUp.java :: Extra snack for Level2
Created by: Masi Nazarian
Date: 11/10/2017
*/

public class PowerUp extends ConcreteSubjectObserverPattern implements ISnack {
	GreenfootSound sound = new GreenfootSound("power-up.wav");

    public PowerUp() {}

    public void act() 
    { 
        if (isTouching(Monkey.class)) 
         {
            sound.play();
            setState("power");
            getWorld().removeObject(this);
        }
    }
}

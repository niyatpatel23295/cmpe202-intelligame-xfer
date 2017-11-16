package MrMonkey;

import greenfoot.Actor;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;

/*
Bananna.java :: Default snack
Created by: Masi Nazarian
Date: 11/10/2017
*/

public class Banana extends Actor implements ISnack { // extends ConcreteSubjectObserverPattern
	GreenfootSound sound = new GreenfootSound("banana.wav");  
	public Banana() {}  
	public void act() {
		if (isTouching(Monkey.class)) {
	      sound.play();
	      ((ScoreScreen)getWorld().getObjects(ScoreScreen.class).get(0)).updatePoints(1);
	      getWorld().removeObject(this);
    	}
	}
}
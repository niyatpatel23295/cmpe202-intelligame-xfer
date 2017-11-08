import java.io.IOException;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgain extends Button
{
    /**
     * Act - do whatever the TryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if (Greenfoot.mouseClicked(this))
        {
        	//Greenfoot.start();
            //Greenfoot.setWorld(new MyWorld());
        	
        		LevelSingleton levelSingleton = null;
    			try {
    				levelSingleton = LevelSingleton.getInstance();
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        		int value = 0;
    			value = levelSingleton.getLevel();
        		
        		switch(value){
    	    		case 1: Greenfoot.setWorld(new MyWorld());
    	    			break;
    	    		case 2: Greenfoot.setWorld(new Level2World());
    	    			break;
    	    		case 3: Greenfoot.setWorld(new Level3World());
    	    			break;
    	    		default: Greenfoot.setWorld(new MyWorld());
    	    			break;
        		}	
            }
        
        }
        // Add your action code here.
    }    


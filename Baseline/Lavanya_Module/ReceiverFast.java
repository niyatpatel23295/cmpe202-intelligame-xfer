import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiverFast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverFast implements Receiver
{    
    public void setMode(){
        new ScoreScreen().setStrategy(new Fast());
        Greenfoot.setWorld(new MyWorld());
    }
}

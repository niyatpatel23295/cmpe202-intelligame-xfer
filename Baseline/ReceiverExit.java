import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiverExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverExit implements Receiver
{    
    GameManager gm = GameManager.getInstance();
    public void setMode(){
        //ScoreScreen.getInstance().setStrategy(new Fast());
        gm.stop();
        //Greenfoot.setWorld(new MyWorld());
    }
}

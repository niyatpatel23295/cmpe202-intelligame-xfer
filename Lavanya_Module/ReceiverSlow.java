import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiverSlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverSlow implements Receiver
{
    GameManager gm = GameManager.getInstance();
    public void setMode(){
        ScoreScreen.getInstance().setStrategy(new SlowMode());
        System.out.println("playeasybutton clicked");
        gm.run();
        //Greenfoot.setWorld(new MyWorld());
    }
}

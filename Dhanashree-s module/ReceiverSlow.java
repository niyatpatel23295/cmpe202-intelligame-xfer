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
        
        System.out.println("playeasybutton clicked");
        gm.run();
       
    }
}

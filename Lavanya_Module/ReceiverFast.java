import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteReceiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverFast implements Receiver
{    
    GameManager gm = GameManager.getInstance();
    public void setMode(){
        ScoreScreen.getInstance().setStrategy(new FastMode());
         System.out.println("playdifficultbutton clicked");
        //Greenfoot.setWorld(new MyWorld());
        gm.run();
    }
}

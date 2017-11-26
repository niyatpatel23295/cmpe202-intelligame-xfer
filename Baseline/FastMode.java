import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FastMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastMode implements GameStrategy
{
    static private int speed = 40;    
        
    public int calculateSpeed(){ 
        
        if(ScoreScreen.getInstance().getScore() == 0){
            speed = 40;
        }
        if(speed > 55){
            if(ScoreScreen.getInstance().getScore() % 12 == 0){
                speed+=2;
            }
        }else{
            if(ScoreScreen.getInstance().getScore() % 8 == 0){
                speed+=2;
            }
        }
        return speed;
    }
}
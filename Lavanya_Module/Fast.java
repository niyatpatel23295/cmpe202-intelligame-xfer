import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fast implements GameStrategy
{
    static private int speed = 40;    
        
    public int calculateSpeed(){ 
        if(new ScoreScreen().getScore() == 0){
            speed = 40;
        }
        if(speed > 60){
            if(new ScoreScreen().getScore() % 12 == 0){
                speed+=2;
            }
        }else{
            if(new ScoreScreen().getScore() % 8 == 0){
                speed+=1;
            }
        }
        return speed;
    }
}

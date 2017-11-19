import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlowMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowMode  implements GameStrategy
{
    static private int speed = 35;    
        
    public int calculateSpeed(){
        if( (ScoreScreen.getInstance().getScore() == 0)){
            speed = 35;
        }
        if(speed > 40){
            if(ScoreScreen.getInstance().getScore() % 10 == 0){
                speed+=2;
            }
        }else{
            if(ScoreScreen.getInstance().getScore() % 6 == 0){
                speed+=2;
            }
        }
        return speed;
    }
}

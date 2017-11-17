import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slow  implements GameStrategy
{
    static private int speed = 30;    
        
    public int calculateSpeed(){
        if( ((new ScoreScreen()).getScore() == 0)){
            speed = 30;
        }
        if(speed > 35){
            if(new ScoreScreen().getScore() % 10 == 0){
                speed+=2;
            }
        }else{
            if(new ScoreScreen().getScore() % 6 == 0){
                speed+=2;
            }
        }
        return speed;
    }
}

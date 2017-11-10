import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Subject interface for score observer pattern
 * Banana implements this class
 * 
 * @author Ambika Bohra
 * @version 1
 */
public interface ScoreSubject  
{
    void attach(ScoreObserver o);
    void notifyObservers();
}


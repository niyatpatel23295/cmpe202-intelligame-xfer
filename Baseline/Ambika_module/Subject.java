import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject 
{
    /**
     * Act - do whatever the ScreenSubject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void notifyObserver();
    //public void attach(ScreenObserver obj);
    
}

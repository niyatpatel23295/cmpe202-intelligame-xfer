import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public interface HealthSubject 
{
    public void notifyObserver();
    public void attach(HealthObserver obj);
    
}

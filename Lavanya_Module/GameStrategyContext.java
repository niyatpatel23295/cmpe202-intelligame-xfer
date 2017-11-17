import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStrategyContext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStrategyContext
{
	private GameStrategy strategy;
    
    public GameStrategyContext(GameStrategy strategy){
        this.strategy = strategy;
    }
    
    public int executeStrategy(){
        return this.strategy.calculateSpeed();
    }
}

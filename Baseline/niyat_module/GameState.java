import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameState extends Actor implements IGameState
{
    /**
     * Act - do whatever the GameState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    GameManager game_manager;
	 
	public GameState(GameManager gm) {
        game_manager = gm ;
	}

	public void setStateStart() {
        System.out.println( "Start is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateRunning() {
        System.out.println( "Game Running is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStatePaused() {
        System.out.println( "Paused is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateStopped() {
        System.out.println( "Stopped is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateGameOver() {
        System.out.println( "Game Over is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateLevelComplete() {
        System.out.println( "Level Complete is not valid in " + this.getClass().getName() + " state." );
	}
	 
}

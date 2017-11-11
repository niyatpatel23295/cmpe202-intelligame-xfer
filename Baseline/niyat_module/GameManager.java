import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager extends Actor
{
    /**
     * Act - do whatever the GameManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GameState start ;
    GameState running ;
    GameState paused ;
    GameState stopped ;
    GameState gameover ;
    GameState levelcompleted ;
    GameState currentState;
    
        public GameManager()
    {
        start = new GameStartState(this);
        running = new GameRunningState(this);
        paused = new GamePausedState(this);
        stopped = new GameStoppedState(this);
        gameover = new GameOverState(this);  
        levelcompleted = new GameLevelCompletedState(this);      
        currentState = stopped ;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
   	public void start() {
        System.out.println( "starting on...");
	    currentState.setStateStart();
	}
	 
	public void run() {
        System.out.println( "running off...");
	    currentState.setStateRunning();
	}
	 
	public void pause() {
        System.out.println( "pausing...");
	    currentState.setStatePaused();
	}
	 
	public void stop() {
        System.out.println( "stopping...");
	    currentState.setStateStopped();
	}

    public void gameOver() {
        System.out.println( "Game Overing vm...");
        currentState.setStateGameOver();
    }

    public void nextLevel() {
        System.out.println( "Going to next level vm...");
        currentState.setStateLevelComplete();
    }

	void setState(GameStates nextState) {
        switch( nextState ) {
            case START :          currentState = start ; break ;
            case RUNNING :           currentState = running ; break ;
            case PAUSED:     currentState = paused ; break ;
            case STOPPED :          currentState = stopped ; break ;
            case GAMEOVER :           currentState = gameover ; break ;
            case LEVELCOMPLETE:     currentState = levelcompleted ; break ;

        }

	}
    
    public void showState()
    {
        System.out.println( "Current State: " + currentState.getClass().getName());
    }
}

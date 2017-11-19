import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Manager is the main program that will manage the flow of the entire Game. 
 * 
 * @author Niyat Patel
 * @version 1.0
 */
public class GameManager

{
    
    static GameState start ;
    static GameState running ;
    static GameState stopped ;
    static GameState gameover ;
    static GameState levelcompleted ;
    static GameState currentState;
    
    private static GameManager gm;
    

    private GameManager()
    {
        start = new GameStartState(this);
        running = new GameRunningState(this);
        stopped = new GameStoppedState(this);
        gameover = new GameOverState(this);  
        levelcompleted = new GameLevelCompletedState(this);      
        currentState = start ;
        System.out.println("Game manager Initialized");
    }
    
    public static GameManager getInstance() {
        if (gm == null) {
            gm = new GameManager();
        }
        return gm;
    }
  
   	public static void start() {
        System.out.println( "starting on...");
	    currentState.setStateStart();
	}
	 
	public static void run() {
        System.out.println( "running off...");
	    currentState.setStateRunning();
	}
	 
	public static void stop() {
        System.out.println( "stopping...");
	    currentState.setStateStopped();
	}

    public static void gameOver() {
        System.out.println( "Game Overing...");
        currentState.setStateGameOver();
    }
    
    
    public static void levelCompleted() {
        
        System.out.println( "Completing Level...");
        currentState.setStateLevelCompleted();
       
    }

	void setState(GameStates nextState) {
        switch( nextState ) {
            case START :          currentState = start ; break ;
            case RUNNING :           currentState = running ; break ;
            case STOPPED :          currentState = stopped ; break ;
            case GAMEOVER :           currentState = gameover ; break ;
            case LEVELCOMPLETED:     currentState = levelcompleted ; break ;

        }

	}
    
    public void showState()
    {
        System.out.println( "Current State: " + currentState.getClass().getName());
    }
}

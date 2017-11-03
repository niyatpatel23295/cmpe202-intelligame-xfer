public class GameManager {
 
	GameState start ;
    GameState running ;
    GameState paused ;
    GameState stopped ;
    GameState gameover ;
    GameState levelcomplete ;
    GameState currentState;

    public GameManager()
    {
        start = new GameStartState(this);
        running = new GameRunningState(this);
        paused = new GamePausedState(this);
        stopped = new GameStoppedState(this);
        gameover = new GameOverState(this);  
        levelcompleted = new GameLevelCompletedState(this);      
        currentState = start ;
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
            case PAUSED:     currentState = pauded ; break ;
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


import greenfoot.Greenfoot;

public class GameRunningState extends GameState {

    public GameRunningState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateGameOver() {
       Greenfoot.setWorld(new GameOverStage());
       game_manager.setState(GameStates.GAMEOVER);
    }
    
    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
    
    @Override
    public void setStateRunning() {
       System.out.println("set run state");
       Greenfoot.setWorld(new MyWorld());
       game_manager.setState(GameStates.RUNNING);
    }
    
    @Override
    public void setStateLevelCompleted() {
       Greenfoot.setWorld(new LevelCompletedWorld());
       game_manager.setState(GameStates.LEVELCOMPLETED);
    }
    
    

}
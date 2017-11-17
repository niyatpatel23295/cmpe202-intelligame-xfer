import greenfoot.Greenfoot;

public class GameLevelCompletedState extends GameState {

    public GameLevelCompletedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
    
    @Override
    public void setStateStopped() {
       Greenfoot.setWorld(new HomeWorld());
       game_manager.setState(GameStates.STOPPED);
    }
    
    
    @Override
    public void setStateRunning() { 
       Greenfoot.setWorld(new MyWorld());
       game_manager.setState(GameStates.RUNNING);
    }
    
}
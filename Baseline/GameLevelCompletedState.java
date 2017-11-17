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
    
    /*
    @Override
    public void setStateLevelCompleted(ScoreScreen score) {
       Greenfoot.setWorld(new HomeWorld());
       game_manager.setState(GameStates.STOPPED);
    }
    */
}
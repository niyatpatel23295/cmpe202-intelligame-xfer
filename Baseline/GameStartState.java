import greenfoot.Greenfoot;

public class GameStartState extends GameState {

    public GameStartState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateRunning() {
       game_manager.setWorld(new MyWorld());
       game_manager.setState(GameStates.RUNNING);
    }

    @Override
    public void setStateStopped() {
       //Greenfoot.stop();
       game_manager.setWorld(new HomeWorld());
       game_manager.setState(GameStates.STOPPED);
    }
}
import greenfoot.Greenfoot;

public class GameOverState extends GameState {

    public GameOverState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       //Greenfoot.setWorld(new HomeWorld());
       game_manager.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
    
    @Override
    public void setStateRunning() {
       //Greenfoot.setWorld(new MyWorld());
       game_manager.setWorld(new MyWorld());
       game_manager.setState(GameStates.RUNNING);
    }
}

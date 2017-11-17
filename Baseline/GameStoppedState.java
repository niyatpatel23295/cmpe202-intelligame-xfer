import greenfoot.Greenfoot;

public class GameStoppedState extends GameState {

    public GameStoppedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       game_manager.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
}
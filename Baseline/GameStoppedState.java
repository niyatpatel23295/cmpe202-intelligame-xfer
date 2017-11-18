import greenfoot.Greenfoot;

public class GameStoppedState extends GameState {

    public GameStoppedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
}
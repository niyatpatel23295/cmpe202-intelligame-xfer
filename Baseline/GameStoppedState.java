import greenfoot.Greenfoot;

/**
 * Subclass that handles STOPPED state
 * 
 * 
 * @author Niyat Patel
 * @version 1.0
 */

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
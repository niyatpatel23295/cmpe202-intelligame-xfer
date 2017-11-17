import greenfoot.Greenfoot;

public class GameOverState extends GameState {

    public GameOverState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new MyWorld());
    }
}
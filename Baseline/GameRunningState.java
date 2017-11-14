import greenfoot.Greenfoot;

public class GameRunningState extends GameState {

    public GameRunningState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStopped() {
      Greenfoot.stop();
      game_manager.setState(GameStates.STOPPED);
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

}
import greenfoot.Greenfoot;

public class GameRunningState extends GameState {

    public GameRunningState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStopped() {
      //Greenfoot.stop();
      Greenfoot.stop();
      game_manager.setState(GameStates.STOPPED);
    }

    @Override
    public void setStateGameOver() {
       game_manager.setWorld(new GameOverStage());
       game_manager.setState(GameStates.GAMEOVER);
    }
    
    @Override
    public void setStateStart() {
       game_manager.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
    
    @Override
    public void setStateLevelCompleted() {
      System.out.println("Hit here");
       // game_manager.setWorld(new LevelCompletedWorld(((MyWorld)(game_manager.getCurrentWorld())).getScoreScreen()));
      game_manager.setWorld(new LevelCompletedWorld(ScoreScreen.getInstance());
      game_manager.setState(GameStates.START);
    }

}
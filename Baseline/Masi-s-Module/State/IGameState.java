package MrMonkey;

/*
Created by: Masi Nazarian
Date: 11/10/2017
*/

public interface IGameState {
  public abstract void goReadyToStart();
  public abstract void goLevel1Running();
  public abstract void goLevel1Finished();
  public abstract void goLevel2Running();
  public abstract void goLevel2Finished();
  public abstract void goLevel3Running();
  public abstract void goLevel3Finished();
  public abstract void goPaused();
  public abstract void goGameOver();
  public abstract void goExited();
}

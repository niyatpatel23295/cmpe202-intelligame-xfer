
/**
 * The main interface of the State Design Pattern
 * 
 * 
 * @author Niyat Patel
 * @version 1.0
 */

public interface IGameState
 {
	 
	public abstract void setStateStart();
	public abstract void setStateRunning();
	public abstract void setStateStopped();
	public abstract void setStateGameOver();
	public abstract void setStateLevelCompleted();

}
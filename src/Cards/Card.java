package Cards;

import java.io.Serializable;

public abstract class Card implements Serializable{

	/**
	 * 
	 */
    
	protected boolean isDead;
	protected  int cost;
	private static final long serialVersionUID = 1L;
	protected String name;
	protected  int Face;
	protected  int Back;
	
	public int getCost() {
		return cost;
	}
	public boolean isAlive() {
		return isDead;
	}
	
}

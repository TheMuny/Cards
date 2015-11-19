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
	protected boolean isCreature;
	protected boolean isWeapon;
	protected boolean isSpell;
	
	
	public String getName() {
		return name;
	}
	public boolean isDead() {
		return isDead;
	}
	public boolean isCreature() {
		return isCreature;
	}
	public boolean isSpell() {
		return isSpell;
	}
	public boolean isWeapon() {
		return isWeapon;
	}
	public int getCost() {
		return cost;
	}
}

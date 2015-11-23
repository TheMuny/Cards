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
	
//	
//	public void chainLighting(Card[] table){}
//	public void fireBToFace(Player player){}
//	public void fireWall(Card[] table){}
//	public void frostBToFace(Player player){}
//	public void frostBToCreature(Creature creature){}
//	public void frostNova(Card[] table){}
//	public void handOfGod(Creature creature){}
//	public void hellFire(Card[] table, Card[] table1){}
//	public void Rain(Card[] table){}
//	public void lightningStrike(Creature creature){}
//	

	
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

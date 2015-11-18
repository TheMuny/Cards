package Cards.Creatures;

import Cards.Card;

public  abstract class Creature extends Card {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int health;
	protected int attack;
	
	
	public void modifyHealth(int val) {
		if(val>0){
		health=val;
		}else{
			health=0;
			isDead=true;
		}
	}
	public int getHealth() {
		return health;
	}
	public int getAttack() {
		return attack;
	}
	
	public void freez(int turn){//can't attack 1 turn
		//TODO
	}
	
}

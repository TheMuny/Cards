package Cards.Creatures;

import Cards.Card;

public  abstract class Creature extends Card {

	protected int health;
	protected int attack;
	
	
	public void modifyHealth(int val) {
		health=val;
	}
	public int getHealth() {
		return health;
	}
	public int getAttack() {
		return attack;
	}
	
	public void freez(int turn){//can't attack 1 turn
		
	}
	
}

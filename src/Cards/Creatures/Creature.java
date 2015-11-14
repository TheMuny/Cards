package Cards.Creatures;

import Cards.Card;

public  class Creature extends Card {

	private int health;
	private int attack;
	
	
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

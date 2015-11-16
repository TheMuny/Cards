package Cards.Weapons;

import Cards.Card;

public abstract class Weapon extends Card {

	protected int durability;
	protected int damage;
	
	
	public int getDurability() {
		return durability;
	}
	public int getDamage() {
		return damage;
	}
	
	
}

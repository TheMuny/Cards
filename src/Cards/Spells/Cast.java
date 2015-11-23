package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;
import Models.Player;

public interface Cast {
	
	void hellFire(Card[] table, Card[] table1);
	public void  useCast(Card[]table);
	public void  useCast(Player player);
	public void  useCast(Creature creature);
}

package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;

public interface Cast {
	
	void hellFire(Card[] table, Card[] table1);
	void  useCast(Card[]table);
	void  useCast(Player player);
	void  useCast(Creature creature);
	
}

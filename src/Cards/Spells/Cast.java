package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;

public interface Cast {
	
	void  hellFire(List<Creature>table, List<Creature> table1);
	void  useCast(List<Creature>table);
	void  useCast(Player player);
	void  useCast(Creature creature);
	
}

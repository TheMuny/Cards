package Cards.Spells;

import Cards.Creatures.Creature;

public interface  S_BindingHeal {
	
	/* put on creatures. Selected creature get same heal as next creature who get healing*/
  void BindingHeal(Creature creature);
}

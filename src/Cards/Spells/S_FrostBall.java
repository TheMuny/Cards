package Cards.Spells;

import Cards.Creatures.Creature;
import Models.Player;




public interface S_FrostBall {
	
	void frostBToFace(Player player);
	void frostBToCreature(Creature creature);
	  /*deal 4 damage to enemy target(creatures that on the table or player)*/
}

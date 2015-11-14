package Cards.Spells;

import Cards.Creatures.Creature;
import Models.Player;




public interface S_FireBall {

           /*deal 6 damage to enemy target(creatures that on the table or player)*/
	void fireBToFace(Player player);
	void fireBToCreature(Creature creature);
	
}

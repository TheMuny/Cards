package Cards.Spells;

import Cards.Creatures.Creature;
import Models.Player;




public class S_FrostBall extends Spell{
	
	/**
	 * 
	 */
	public S_FrostBall(){
		cost = 3;
	}

	private static final long serialVersionUID = 1L;
	public void frostBToFace(Player player) {
		if(isDead=false){
		// TODO Auto-generated method stub
		player.modifyHealth(player.getHealth()-3);
		}
		isDead=true;
	}
	//______________________________________________________________
	public void frostBToCreature(Creature creature) {
		// TODO Auto-generated method stub
		if(isDead=false){
		creature.modifyHealth(creature.getHealth()-3);
		creature.freez(1);}
		isDead = true;
	}
	  /*deal 4 damage to enemy target(creatures that on the table or player)*/
}

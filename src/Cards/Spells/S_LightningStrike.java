package Cards.Spells;

import java.util.Random;

import Cards.Creatures.Creature;


public class S_LightningStrike extends Spell{

	/**
	 * 
	 */

	public S_LightningStrike(){
		cost = 1;
	}
	
	private static final long serialVersionUID = 1L;

	public void lightningStrike(Creature creature) {
		if(isDead=false){
		Random r =new Random();
	    int rand = r.nextInt(4)+3;
		creature.modifyHealth(creature.getHealth()-rand);
		}isDead=true;
	}
	
  /* deal random 3-6 damage to the enemy creature on the table*/
}

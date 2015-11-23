package Cards.Spells;

import java.util.Random;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;


public class S_LightningStrike extends Spell implements Cast{

	/**
	 * 
	 */

	public S_LightningStrike(){
		name = "LightningStrike";
		cost = 1;
	}
	
	private static final long serialVersionUID = 1L;


	public void hellFire(Card[] table, Card[] table1) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Card[] table) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Creature creature) {
		if(isDead==false){
		Random r =new Random();
	    int rand = r.nextInt(4)+3;
		creature.modifyHealth(creature.getHealth()-rand);
		}isDead=true;
		
	}
	
  /* deal random 3-6 damage to the enemy creature on the table*/
}

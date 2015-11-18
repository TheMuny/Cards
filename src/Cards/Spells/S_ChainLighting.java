package Cards.Spells;

import java.util.Random;

import Cards.Card;
import Cards.Creatures.Creature;



public class S_ChainLighting  extends Spell{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public S_ChainLighting(){
		cost = 3;
	}
	
	private boolean isAlive=true;
	public boolean isAlive() {
		return isAlive;
	}

	public void chainLighting(Card[] table) {
		
		if(isDead=false){		
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				Random r = new Random();
				int rand = r.nextInt(2)+2;
				m.modifyHealth(m.getHealth()-rand);}}}
		isDead = true;
	}
	/*make 4 steps from enemy creature to random enemy creature on the table 
	 *  and deal random damage between 2 and 3 hp to the each creature*/
}

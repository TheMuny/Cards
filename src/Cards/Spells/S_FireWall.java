package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;





public class S_FireWall extends Spell{
	
	/**
	 * 
	 */
public S_FireWall(){
cost=7;
}
	private static final long serialVersionUID = 1L;

	public void fireWall(Card[] table) {
		
		if(isDead=false){
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				m.modifyHealth(m.getHealth()-4);
			}
		}
	}isDead=true;
	}
	/*deal 4 damage to all enemy creatures on the table*/
}

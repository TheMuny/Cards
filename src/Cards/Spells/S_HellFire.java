package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;



public class  S_HellFire extends Spell{
	
	/**
	 * 
	 */
   public S_HellFire(){
	   cost = 4;
   }
	private static final long serialVersionUID = 1L;

	public void hellFire(Card[] table, Card[] table1) {
		if(isDead=false){
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];				
				m.modifyHealth(m.getHealth()-3);
		}		
	}
		for(int i =0;i<table.length;i++){
			if(table1[i]instanceof Creature){
				Creature n = (Creature)table1[i];
				n.modifyHealth(n.getHealth()-3);
				}
		}
	}isDead=true;
}
	/*deal 3 damage to all creatures on the table(means both players)*/
}

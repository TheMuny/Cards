package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;


public class S_FrostNova extends Spell implements Cast{
	
	/**
	 * 
	 */
   public S_FrostNova(){
	   name = "FrostNova";
	   cost =3;
   }
	private static final long serialVersionUID = 1L;

	/*freeze all enemy creatures on the table for 1 turn*/

	public void useCast(Card[] table) {
		if(isDead==false){
		// TODO Auto-generated method stub
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				m.freez(1);}
			}
     	}isDead = true;
		
	}

	public void useCast(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Creature creature) {
		// TODO Auto-generated method stub
		
	}

	public void hellFire(Card[] table, Card[] table1) {
		// TODO Auto-generated method stub
		
	}
}

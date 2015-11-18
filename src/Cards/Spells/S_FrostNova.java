package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;



public class S_FrostNova extends Spell{
	
	/**
	 * 
	 */
   public S_FrostNova(){
	   cost =3;
   }
	private static final long serialVersionUID = 1L;

	public void frostNova(Card[] table) {
		if(isDead=false){
		// TODO Auto-generated method stub
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				m.freez(1);}
			}
     	}isDead = true;
    }
	/*freeze all enemy creatures on the table for 1 turn*/
}

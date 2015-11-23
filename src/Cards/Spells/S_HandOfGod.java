package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;



public class S_HandOfGod extends Spell implements Cast{
	
	/**
	 * 
	 */
   public S_HandOfGod(){
	   name  = "HandOfGod";
	   cost = 2;
   } 
   

	private static final long serialVersionUID = 1L;

	/*	restore 6 health to selected creature */


	public void useCast(Card[] table) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Creature creature) {
		if(isDead==false){
			creature.modifyHealth(creature.getHealth()+6);}
			isDead=true;
		
	}

	public void hellFire(Card[] table, Card[] table1) {
		// TODO Auto-generated method stub
		
	}

}

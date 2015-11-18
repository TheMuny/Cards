package Cards.Spells;

import Cards.Creatures.Creature;



public class S_HandOfGod extends Spell{
	
	/**
	 * 
	 */
   public S_HandOfGod(){
	   cost = 2;
   } 
   

	private static final long serialVersionUID = 1L;

	public void handOfGod(Creature creature) {	
		if(isDead=false){
		creature.modifyHealth(creature.getHealth()+6);}
		isDead=true;
	}
	/*	restore 6 health to selected creature */

}

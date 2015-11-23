package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;
import Models.Player;




public class S_FrostBall extends Spell implements Cast{
	
	/**
	 * 
	 */
	public S_FrostBall(){
		name = "S_FrostBall";
		cost = 3;
	}

	private static final long serialVersionUID = 1L;
	//______________________________________________________________

	  /*deal 4 damage to enemy target(creatures that on the table or player)*/
	
	public void useCast(Card[] table) {
		// TODO Auto-generated method stub
		
	}
	public void useCast(Player player) {
		if(isDead==false){
			// TODO Auto-generated method stub
			player.modifyHealth(player.getHealth()-3);
			}
			isDead=true;
		
	}
	public void useCast(Creature creature) {
		if(isDead=false){
			creature.modifyHealth(creature.getHealth()-3);
			creature.freez(1);}
			isDead = true;
		
	}
	public void hellFire(Card[] table, Card[] table1) {
		// TODO Auto-generated method stub
		
	}
}

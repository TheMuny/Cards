package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;




public class S_FrostBall extends Spell implements Cast{
	
	/**
	 * 
	 */
	public S_FrostBall(){
		name = "FrostBall";
		cost = 3;
	}

	private static final long serialVersionUID = 1L;
	//______________________________________________________________

	  /*deal 4 damage to enemy target(creatures that on the table or player)*/
	
	public void useCast(List<Creature> table) {
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
		if(creature!=null){
		if(isDead==false){
			creature.modifyHealth(creature.getHealth()-3);
			creature.freez(1);}
			isDead = true;}
		
		
	}
	public void hellFire(List<Creature> table, List<Creature> table1) {
		// TODO Auto-generated method stub
		
	}
}

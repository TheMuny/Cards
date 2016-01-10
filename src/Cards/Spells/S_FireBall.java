package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;




public class S_FireBall extends Spell implements Cast{

           /**
	 * 
	 */
	public S_FireBall(){
		name = "FireBall";
		cost = 4;
	}
	
	private static final long serialVersionUID = 1L;
	/*deal 6 damage to enemy target(creatures that on the table or player)*/
	//______________________________________________________________
	
	public void useCast(List<Creature> table) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Player player) {
		if(isDead==false){
			player.modifyHealth(player.getHealth()-6);
			}
			isDead=true;
	}

	public void useCast(Creature creature) {
		if(isDead==false){
			creature.modifyHealth(creature.getHealth()-6);
			}
			isDead = true;
		
	}

	public void hellFire(List<Creature> table, List<Creature> table1) {
		// TODO Auto-generated method stub
		
	}		
	
}

package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;
import Models.Player;




public class S_FireBall extends Spell implements Cast{

           /**
	 * 
	 */
	public S_FireBall(){
		name = "S_FireBall";
		cost = 6;
	}
	
	private static final long serialVersionUID = 1L;
	/*deal 6 damage to enemy target(creatures that on the table or player)*/
	//______________________________________________________________
	
	public void useCast(Card[] table) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Player player) {
		if(isDead==false){
			player.modifyHealth(player.getHealth()-6);
			}
			isDead=true;
	}

	public void useCast(Creature creature) {
		if(isDead=false){
			creature.modifyHealth(creature.getHealth()-6);
			}
			isDead = true;
		
	}

	public void hellFire(Card[] table, Card[] table1) {
		// TODO Auto-generated method stub
		
	}
	
}

package Cards.Spells;

import Cards.Creatures.Creature;
import Models.Player;




public class S_FireBall extends Spell{

           /**
	 * 
	 */
	public S_FireBall(){
		name = "S_FireBall";
		cost = 6;
	}
	
	private static final long serialVersionUID = 1L;
	/*deal 6 damage to enemy target(creatures that on the table or player)*/
	public void fireBToFace(Player player) {	
		if(isDead==false){
		player.modifyHealth(player.getHealth()-6);
		}
		isDead=true;
	}
	//______________________________________________________________
	
	public void fireBToCreature(Creature creature) {
		if(isDead=false){
		creature.modifyHealth(creature.getHealth()-6);
		}
		isDead = true;
	}
	
}

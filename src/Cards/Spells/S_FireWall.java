package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;





public class S_FireWall extends Spell implements Cast{
	
	/**
	 * 
	 */
	public S_FireWall(){
		name = "FireWall";
		cost=7;
	}
	private static final long serialVersionUID = 1L;

	/*deal 4 damage to all enemy creatures on the table*/

	public void useCast() {
		// TODO Auto-generated method stub
		
	}

	public void useCast(List<Creature> table) {

		if(isDead==false){
		for(int i =0;i<table.size();i++){
			if(table.get(i)instanceof Creature){
				Creature m = (Creature)table.get(i);
				m.modifyHealth(m.getHealth()-4);
			}
		}
	}isDead=true;
		
	}

	public void useCast(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Creature creature) {
		// TODO Auto-generated method stub
		
	}

	public void hellFire(List<Creature> table, List<Creature> table1) {
		// TODO Auto-generated method stub
		
	}
}

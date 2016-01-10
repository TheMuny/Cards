package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;


public class  S_HellFire extends Spell implements Cast{
	
	/**
	 * 
	 */
   public S_HellFire(){
	   name="HellFire";
	   cost = 4;
   }
	private static final long serialVersionUID = 1L;

	public void hellFire(List<Creature> table,List<Creature> table1) {
		if(isDead==false){
			for(int i =0;i<table.size();i++){
				if(table.get(i)instanceof Creature){
					Creature m = (Creature)table.get(i);				
					m.modifyHealth(m.getHealth()-3);
			}		
		}
			for(int i =0;i<table.size();i++){
				if(table1.get(i)instanceof Creature){
					Creature n = (Creature)table1.get(i);
					n.modifyHealth(n.getHealth()-3);
					}
			}
		}isDead=true;
}
	/*deal 3 damage to all creatures on the table(means both players)*/
	public void useCast(List<Creature> table) {
	
		
	}

	public void useCast(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Creature creature) {
		// TODO Auto-generated method stub
		
	}
}

package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;


public class S_FrostNova extends Spell implements Cast{
	
	/**
	 * 
	 */
   public S_FrostNova(){
	   name = "FrostNova";
	   cost =3;
   }
	private static final long serialVersionUID = 1L;

	/*freeze all enemy creatures on the table for 1 turn*/

	public void useCast(List<Creature> table) {
		if(isDead==false){
		// TODO Auto-generated method stub
		for(int i =0;i<table.size();i++){
			if(table.get(i)instanceof Creature){
				Creature m = (Creature)table.get(i);
				m.freez(1);}
			}
     	}isDead = true;
		
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

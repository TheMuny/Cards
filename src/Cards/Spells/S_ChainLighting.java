package Cards.Spells;

import java.util.Random;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;



public class S_ChainLighting  extends Spell implements Cast{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public S_ChainLighting(){
		name = "ChainLighting";
		cost = 3;
	}


//	public void chainLighting(Card[] table) {
//		
//		if(isDead==false){		
//		for(int i =0;i<table.length;i++){
//			if(table[i]instanceof Creature){
//				Creature m = (Creature)table[i];
//				Random r = new Random();
//				int rand = r.nextInt(2)+2;
//				m.modifyHealth(m.getHealth()-rand);}}}
//		isDead = true;
//	}
	/*make 4 steps from enemy creature to random enemy creature on the table 
	 *  and deal random damage between 2 and 3 hp to the each creature*/

	public void useCast(Card[] table) {
		if(isDead==false){		
			for(int i =0;i<table.length;i++){
				if(table[i]instanceof Creature){
					Creature m = (Creature)table[i];
					Random r = new Random();
					int rand = r.nextInt(2)+2;
					m.modifyHealth(m.getHealth()-rand);}}}
			isDead = true;
		}
 
	

      public void useCast(Player player) {
	// TODO Auto-generated method stub
	
}


     public void useCast(Creature creature) {
	// TODO Auto-generated method stub
	
}


	public void hellFire(Card[] table, Card[] table1) {
		// TODO Auto-generated method stub
		
	}		
	}


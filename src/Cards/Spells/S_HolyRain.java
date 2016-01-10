package Cards.Spells;

import java.util.List;

import Cards.Card;
import Cards.Creatures.Creature;
import Room.Player;


public class S_HolyRain extends Spell implements Cast{
	
	/**
	 * 
	 */
    public S_HolyRain(){
    	name = "HolyRain";
    	cost=2;
    }
	private static final long serialVersionUID = 1L;

	public void Rain(Card[] table) {

}

	public void hellFire(List<Creature> table,List<Creature> table1) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(List<Creature> table) {
		// TODO Auto-generated method stub
		if(isDead==false){
		for(int i =0;i<table.size();i++){
			
			if(table.get(i)instanceof Creature){
				Creature m = (Creature)table.get(i);				
				m.modifyHealth(m.getHealth()+2);}
		}		
	}isDead=true;
		
	}

	public void useCast(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void useCast(Creature creature) {
		// TODO Auto-generated method stub
		
	}


	/*restore 2 health to all your creatures on the table this and next your turn*/
}

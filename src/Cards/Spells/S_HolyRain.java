package Cards.Spells;

import Cards.Card;
import Cards.Creatures.Creature;


public class S_HolyRain extends Spell{
	
	/**
	 * 
	 */
    public S_HolyRain(){
    	name = "S_HolyRain";
    	cost=2;
    }
	private static final long serialVersionUID = 1L;

	public void Rain(Card[] table) {
		// TODO Auto-generated method stub
		if(isDead==false){
		for(int i =0;i<table.length;i++){
			
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];				
				m.modifyHealth(m.getHealth()+2);}
		}		
	}isDead=true;
}		
	
	/*restore 2 health to all your creatures on the table this and next your turn*/
}

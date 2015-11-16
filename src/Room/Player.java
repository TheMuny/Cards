package Room;

import Cards.Card;
import Cards.Creatures.Creature;


public class Player implements Models.Player{

	
	
	private int health;
	private Hand hand = new Hand();
	public int number;
	
	
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public void sayGoodGame() {
		// TODO Auto-generated method stub
		System.out.println("GoodGame!");
	}
	
	public Card selectCard(int select){
		return hand.getValue(select);
	}
	
	public void takeFromDeck(Card[]deck) {
		
		for(int i=0;i<deck.length;i++){
	    	if(deck[i]!=null){
			hand.addElement(deck[i]);
			deck[i]=null;
			break;
//           			
//			int count=0;
//			hand.addElement(deck[count]);
//			deck[count]=null;
//			count++;
		}
	  }
	}	
	public void takeFromTable(Card[]table) {
		// TODO Auto-generated method stub
	   	
	}
	
	public int getHealth() {
		return health;
	}
	
	public Hand getHand() {
		return  hand;
		
	}
	public void modifyHealth(int val) {
		health = val;
		
	}
	
	public void useCard() {
		// TODO Auto-generated method stub	
	}

	
			
	
	
}
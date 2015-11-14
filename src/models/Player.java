package Models;

import Cards.Card;
import Room.Hand;

public interface Player {

	
	 void sayHello();
	 void sayGoodGame();
	 Card selectCard(int select);
	 void useCard();	
	 void takeFromDeck(Card[]deck);
	 void takeFromTable(Card[]table);
	  int getHealth();
	 Hand getHand();
	 void modifyHealth(int val);
	 
}

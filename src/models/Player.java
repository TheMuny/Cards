package Models;

import Cards.Card;
import Room.Hand;

public interface Player {

	
	 void sayHello();
	 void sayGoodGame();
	 Card selectCard(int select);
	 void useCard();
	 
	 void takeFromDeck(int quantity);
	 void takeFromTable(Card[]table, int number) ;
	  int getHealth();
	 Hand getHand();
	 void modifyHealth(int val);
	 void setCrystalls(int value);
	 
}

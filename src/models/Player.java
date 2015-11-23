package Models;

import java.util.List;

import Cards.Card;

public interface Player {

	
	 void sayHello();
	 void sayGoodGame();
	 Card selectCard(int select);
	 void useCard();
	 
	 void takeFromDeck(int quantity);
	 void takeFromTable(Card[]table, int number) ;
	  int getHealth();
	 List<Card> getHand();
	 void modifyHealth(int val);
	 void setCrystalls(int value);
	 
}

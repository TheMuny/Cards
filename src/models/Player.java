package Models;

public interface Player {

	
	 void sayHello();
	 void sayGoodGame();
	 void putOnTable();
	 void takeFromDeck();
	 void takeFromTable();
	 int getHealth();
	 void getHand();
	 void generateHand();
	 void modifyHealth(int val);
	 
}

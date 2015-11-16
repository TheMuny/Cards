package Room;

import java.util.Random;

import Cards.Card;
import Cards.Creatures.Creature;
import Cards.Spells.Spell;
import Cards.Weapons.Weapon;
import Room.Player;

public class GameRoom implements Models.GameRoom{

	 private Player player1 = new Player();
	 private Player player2 = new Player();
	 private Card[] tableP1 = new Card[8];
	 private Card[] tableP2 = new Card[8];
     private int step=0;
	
	
	public void prepareGame() {
		player1.getDeck().randomCollect();
		player1.takeFromDeck(4);
		player2.getDeck().randomCollect();
		player2.takeFromDeck(4);
	}
	public void changeTurn(){
			step++;
	}
	
	
	public static void main(String[] args) {		
		GameRoom G = new GameRoom();
		G.prepareGame();
		
	}

	
}

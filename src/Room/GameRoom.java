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
	private Card[] p1Deck  = new Card[30];
	private Card[] p2Deck  = new Card[30];
	
	
	
	public void prepareGame() {
		for(int i=0;i<p1Deck.length;i++){
			Random r = new Random();
			int rand = r.nextInt(100);
			if(rand>=0&&rand<45){
				p1Deck[i]=new Creature();
			}else if(rand>=46&&rand<80){
				p1Deck[i]=new Spell();
			}else if(rand>=81&&rand<100){
				p1Deck[i]=new Weapon();
			}
		}
		
	}
	public void changeTurn() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		
	}
	
}

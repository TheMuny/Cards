package Room;
import java.util.Random;


import  Cards.Card;


public class Deck implements Models.Deck{


	private Card[] deck = new Card[30];
	
	
	public void shuffle() {	
		Card[]suffle = new Card[deck.length];
		for(int i =0;i<deck.length;i++){
				Random r = new Random();
				Random s = new Random();
				int R = r.nextInt(deck.length);
				int S = s.nextInt(deck.length);
				suffle[i] = deck[R];
				deck[R] = deck[S];
				deck[S] = suffle[i];
		
		}
	}


	public void collect() {
		// TODO Auto-generated method stub
		
	}

	
	
}

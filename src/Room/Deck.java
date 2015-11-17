package Room;
import java.io.Serializable;
import java.util.Random;


import Cards.Card;
import Cards.Spells.Spell;
import Cards.Creatures.C_Crow;
import Cards.Creatures.C_Dragon;
import Cards.Creatures.C_Fairy;
import Cards.Creatures.C_FuryBoar;
import Cards.Creatures.C_NightGhost;
import Cards.Creatures.C_SilverElephant;
import Cards.Weapons.W_Dagger;
import Cards.Weapons.W_Hammer;
import Cards.Weapons.W_Sword;





public class Deck implements Models.Deck, Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Card[] deck = new Card[30];;
    private transient int counter =0;
    
    public Deck(){
    	
    }
    
    
    
    public void setDeck(Card[] deck) {
		this.deck = deck;
	}



	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Card getCard(){ 	
    	return deck[counter];
    }
    
	public void remove(){		
		if(counter<deck.length){	
		deck[counter]=null;
		counter++;}
	}
	
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


	public void randomCollect() {
		for(int i=0;i<deck.length;i++){
			Random r = new Random();
			int rand = r.nextInt(130);
			if(rand>=0&&rand<40){
				deck[i]=new Spell();
		    }else if (rand>=0&&rand<=40){
		    	deck[i]=new C_Crow();
		    }else if (rand>=41&&rand<=46){
		    	deck[i]=new C_Dragon();
		    }else if (rand>=47&&rand<=57){
		    	deck[i]=new C_Fairy();
		    }else if (rand>=58&&rand<=68){
		    	deck[i]=new C_FuryBoar();
		    }else if (rand>=69&&rand<=79){
		    	deck[i]=new C_NightGhost();
		    }else if (rand>=80&&rand<=90){
		    	deck[i]=new W_Dagger();
		    }else if (rand>=91&&rand<=100){
		    	deck[i]=new W_Hammer();
		    }else if (rand>=101&&rand<=108){
		    	deck[i]=new W_Sword();
		    }else if (rand>=109&&rand<=129){
		    	deck[i]=new C_SilverElephant();
		    }else;
		}
	 }
  }



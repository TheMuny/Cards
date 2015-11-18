package Room;
import java.io.Serializable;
import java.util.Random;


import Cards.Card;
import Cards.Spells.S_ChainLighting;
import Cards.Spells.S_FireWall;
import Cards.Spells.S_FireBall;
import Cards.Spells.S_FrostBall;
import Cards.Spells. S_FrostNova; 
import Cards.Spells.S_HandOfGod;
import Cards.Spells.S_HellFire;
import Cards.Spells.S_HolyRain;
import Cards.Spells.S_LightningStrike;
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
			int rand = r.nextInt(151);
			if(rand>=0&&rand<=6){
				deck[i]=new S_ChainLighting();
			}else if (rand>=7&&rand<=13){
		    	deck[i]=new S_FireWall();
			}else if (rand>=14&&rand<=20){
		    	deck[i]=new S_FireBall();
			}else if (rand>=21&&rand<=27){
		    	deck[i]=new S_FrostBall();
			}else if (rand>=28&&rand<=34){
		    	deck[i]=new S_FrostNova();
			}else if (rand>=35&&rand<=38){
		    	deck[i]=new S_HandOfGod();
		    }else if (rand>=39&&rand<=40){
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
		    }else if (rand>=130&&rand<=136){
		    	deck[i]=new S_HellFire();
		    }else if (rand>=137&&rand<=144){
		    	deck[i]=new S_HolyRain();
		    }else if (rand>=145&&rand<=150){
		    	deck[i]=new S_LightningStrike();
		    }else;
		}
	 }
  }



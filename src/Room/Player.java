package Room;


import Cards.*;
import Cards.Creatures.*;
import Cards.Spells.*;
import Cards.Weapons.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Player{

	
	private int crystals = 20;
    private int health=30;
	private List<Card> hand = new ArrayList<Card>();
	private List<Card> deck = new ArrayList<Card>();
	private List<Creature> table = new ArrayList<Creature>();
	
	//********************************************************//********************************************************
	                         //  Constructor
	
	public Player(){
		
	}
	
	
	//********************************************************//********************************************************
	                            //Phrases
	public void sayHello() {
		System.out.println("Hello");
	}	
	public void sayGoodGame() {		
		System.out.println("GoodGame!");
	}
	//********************************************************//********************************************************
	                       //Methods with Crystals
	public void modifyCrystals(int value){
		crystals=value;
	}
	public int getCrystals() {
		return crystals;
	}
	public void setCrystalls(int value) {
		crystals = value;
	}
	//********************************************************//********************************************************
	
                            //Methods with Health
	public int getHealth() {
		return health;
	}
	public void modifyHealth(int val) {
		health = val;
	}
	//********************************************************//********************************************************	
	
                           //Methods with GameBoard

	
	public void putOnTable(int positionInHand, List<Creature>table) {
		try{
		if(!hand.get(positionInHand).isDead()&&hand.get(positionInHand).getCost()<=crystals&&
		hand.get(positionInHand).isCreature()){
		crystals = crystals -hand.get(positionInHand).getCost();
		table.add((Creature)hand.get(positionInHand));
	    hand.remove(positionInHand);}
		}catch(Exception e){
			System.out.println("Wrong arguments");
		}
		
	}
	public List<Creature> getTable() {
		return table;
	}


	public void takeFromTable(List<Card>table, int number) {
        try{
	    hand.add(table.get(number));
	    table.remove(number);
	    }catch(Exception e){
		System.out.println("Wrong arguments");
		}
	}
	

	//********************************************************//********************************************************
                              //Methods with Deck
	public void randomCollect() {
		for(int i=0;i<30;i++){
			Random r = new Random();
			int rand = r.nextInt(151);
			if(rand>=0&&rand<=6){
				deck.add(new S_ChainLighting());
			}else if (rand>=7&&rand<=13){
				deck.add(new S_FireWall());
			}else if (rand>=14&&rand<=20){
				deck.add(new S_FireBall());
			}else if (rand>=21&&rand<=27){
				deck.add(new S_FrostBall());
			}else if (rand>=28&&rand<=34){
				deck.add(new S_FrostNova());
			}else if (rand>=35&&rand<=38){
				deck.add(new S_HandOfGod());
		    }else if (rand>=39&&rand<=40){
		    	deck.add(new C_Crow());
		    }else if (rand>=41&&rand<=46){
		    	deck.add(new C_Dragon());
		    }else if (rand>=47&&rand<=57){
		    	deck.add(new C_Fairy());
		    }else if (rand>=58&&rand<=68){
		    	deck.add(new C_FuryBoar());
		    }else if (rand>=69&&rand<=79){
		    	deck.add(new C_NightGhost());
		    }else if (rand>=80&&rand<=90){
		    	deck.add(new W_Dagger());
		    }else if (rand>=91&&rand<=100){
		    	deck.add(new W_Hammer());
		    }else if (rand>=101&&rand<=108){
		    	deck.add(new W_Sword());
		    }else if (rand>=109&&rand<=129){
		    	deck.add(new C_SilverElephant());
		    }else if (rand>=130&&rand<=136){
		    	deck.add(new S_HellFire());
		    }else if (rand>=137&&rand<=144){
		    	deck.add(new S_HolyRain());
		    }else if (rand>=145&&rand<=150){
		    	deck.add(new S_LightningStrike());
		    }else;
		}
	 }
	public void takeFromDeck() {	
		try{	
		if(hand.size()<10){
    	hand.add(deck.get(0));
		deck.remove(0);		
		}else{deck.remove(0);}
		}catch(Exception e){
			modifyHealth(getHealth()-2);
			System.out.println("You have no Cards :(");}
	}
	
	public void setDeck(List<Card> deck) {
		this.deck= deck;
	}
	public List<Card> getDeck(){
		return deck;
	}
	//********************************************************//********************************************************
	                               //Methods with Hand
	public List<Card> getHand() {
		return  hand;	
	}
	//********************************************************//********************************************************
	                              
	//********************************************************//********************************************************
	                              //Cast interface
	public void useCast(int positionInHand, Player player){
		//TODO
		if(!hand.get(positionInHand).isDead()&&hand.get(positionInHand).getCost()<=crystals&&
				hand.get(positionInHand).isSpell()){
			crystals = crystals -hand.get(positionInHand).getCost();
			Cast s = (Cast)hand.get(positionInHand);
			s.useCast(player);			
		}
	}
	public void useCast(int positionInHand, Creature creature){
		//TODO
		if(!hand.get(positionInHand).isDead()&&hand.get(positionInHand).getCost()<=crystals&&
				hand.get(positionInHand).isSpell()){
			crystals = crystals -hand.get(positionInHand).getCost();
			Cast s = (Cast)hand.get(positionInHand);
			s.useCast(creature);			
		}
	}
	public void useCast(int positionInHand,List<Creature> table){
		//TODO
		if(!hand.get(positionInHand).isDead()&&hand.get(positionInHand).getCost()<=crystals&&
				hand.get(positionInHand).isSpell()){
			crystals = crystals -hand.get(positionInHand).getCost();
			Cast s = (Cast)hand.get(positionInHand);
			s.useCast(table);			
		}
	}
	public void useCast(int positionInHand,List<Creature> table,List<Creature>table1){
		//TODO
		if(!hand.get(positionInHand).isDead()&&hand.get(positionInHand).getCost()<=crystals&&
				hand.get(positionInHand).isSpell()){
			crystals = crystals -hand.get(positionInHand).getCost();
			Cast s = (Cast)hand.get(positionInHand);
			s.hellFire(table,table1);			
		}
	}
	//********************************************************//********************************************************
	
	                              //testMethods
	public void printHandCards(){
		System.out.println("\r\n"+"Your current crystalls  --  " + getCrystals());
//		List<String> list = hand.stream()
//				.map(Card->Card.getName()).collect(Collectors.toList());
//		List<Integer>list1 =  hand.stream()
//				.map(Card->Card.getCost()).collect(Collectors.toList());
//		System.out.println(list+""+list1);
//	}
		for(Card i:hand){
			System.out.print("   "+i.getName()+"--"+i.getCost());
		}
	System.out.println("\r\n Press <<p>> for skip turn");
	
	}
	
//	public static void main(String[] args)  throws IOException, ClassNotFoundException{	
//		Player p = new Player();
//		
//		System.out.println(p.deck.size());
//		p.randomCollect();
//		System.out.println(p.deck.size());	
//		
//		
//		System.out.println(p.deck.size()+"   "+p.hand.size());
//		p.takeFromDeck();
//		System.out.println(p.deck.size()+"   "+p.hand.size());
//		p.takeFromDeck();
//		System.out.println(p.deck.size()+"   "+p.hand.size());
//		p.takeFromDeck();
//		System.out.println(p.deck.size()+"   "+p.hand.size());
//		p.takeFromDeck();
//		System.out.println(p.deck.size()+"   "+p.hand.size());
//		
//		p.printHandCards();
//	}
	
			
	
	
}
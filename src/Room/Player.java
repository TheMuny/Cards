package Room;

import Cards.Card;
import Cards.Creatures.Creature;
import Cards.Spells.Cast;
import Cards.Spells.Spell;



public class Player implements Models.Player{

	private  String  file = "Deck";
	private int crystalls = 20;
    private int health=30;
	private Hand hand = new Hand();
//	private int mana =0;
	private Deck deck = new Deck();
	//********************************************************
	public Player(){
		
	}
	
	
	//********************************************************

	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public void sayGoodGame() {
		// TODO Auto-generated method stub
		System.out.println("GoodGame!");
	}

	public void modifyCrystalls(int value){
		crystalls=value;
	}
	public int getCrystalls() {
		return crystalls;
	}
	
	public void setCrystalls(int value) {
		crystalls = value;
	}

	public Card selectCard(int select){
		return hand.getValue(select);
	}
	
	public void putOnTable(int positionInHand, Card[]table, int positionOnTable) {
		if(!selectCard(positionInHand).isDead()&&selectCard(positionInHand).getCost()<=crystalls&&
		selectCard(positionInHand).isCreature()	){
		crystalls = crystalls -selectCard(positionInHand).getCost();
		table[positionOnTable]=selectCard(positionInHand);
	    hand.removeValue(selectCard(positionInHand));    
		}
	}
	
	public void takeFromDeck(int quantity) {
		int i=0;
		do{
		hand.addElement(deck.getCard());
		deck.remove();
		i++;
		}while(i!=quantity);
	}	
	public void takeFromTable(Card[]table, int number) {
	    hand.addElement(table[number]);
	    table[number]=null;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setDeck(Deck deck) {
		this.deck= deck;
	}
	
	public Deck getDeck(){
		return deck;
	}
	
	public Hand getHand() {
		return  hand;
		
	}
	public void modifyHealth(int val) {
		health = val;
		
	}
	
	public void useCard() {
		// TODO Auto-generated method stub	
	}

	public void useCast(int positionInHand, Player player){
		//TODO
		if(!selectCard(positionInHand).isDead()&&selectCard(positionInHand).getCost()<=crystalls&&
				selectCard(positionInHand).isSpell()){
			crystalls = crystalls -selectCard(positionInHand).getCost();
			Cast s = (Cast)selectCard(positionInHand);
			s.useCast(player);			
		}
	}
	public void useCast(int positionInHand, Creature creature){
		//TODO
		if(!selectCard(positionInHand).isDead()&&selectCard(positionInHand).getCost()<=crystalls&&
				selectCard(positionInHand).isSpell()){
			crystalls = crystalls -selectCard(positionInHand).getCost();
			Cast s = (Cast)selectCard(positionInHand);
			s.useCast(creature);			
		}
	}
	public void useCast(int positionInHand,Card[] table){
		//TODO
		if(!selectCard(positionInHand).isDead()&&selectCard(positionInHand).getCost()<=crystalls&&
				selectCard(positionInHand).isSpell()){
			crystalls = crystalls -selectCard(positionInHand).getCost();
			Cast s = (Cast)selectCard(positionInHand);
			s.useCast(table);			
		}
	}
	public void useCast(int positionInHand,Card[] table,Card[]table1){
		//TODO
		if(!selectCard(positionInHand).isDead()&&selectCard(positionInHand).getCost()<=crystalls&&
				selectCard(positionInHand).isSpell()){
			crystalls = crystalls -selectCard(positionInHand).getCost();
			Cast s = (Cast)selectCard(positionInHand);
			s.hellFire(table,table1);			
		}
	}
	//testMethods
	public void printCards(){
		for(int i =0;i<hand.length()-1;i++){
			System.out.println(hand.getValue(i).getCost());
		}
	}

	
			
	
	
}
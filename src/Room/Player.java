package Room;

import Cards.Card;



public class Player implements Models.Player{

	private  String  file = "Deck";
	private int crystalls = 0;
    private int health=30;
	private Hand hand = new Hand();
	private int mana =0;
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

	public void crystallsIncr(){
		crystalls++;
	}
	public int getCrystalls() {
		return crystalls;
	}
	
	public void setMana(int value) {
		mana = value;
	}

	public Card selectCard(int select){
		return hand.getValue(select);
	}
	
	public void putOnTable(Card[]table, int positionInHand, int positionOnTable) {
		table[positionOnTable]=selectCard(positionInHand);
	    hand.removeValue(selectCard(positionInHand));
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

	

	
			
	
	
}
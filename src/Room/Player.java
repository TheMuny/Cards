package Room;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Cards.Card;



public class Player implements Models.Player{

	private  String  file = "Deck";
	
	private int health=30;
	private Hand hand = new Hand();
	private int mana =0;
	private Deck deck = new Deck();
	//********************************************************
	public Player(){
		
	}
	
	
	//********************************************************
	public void saveDeck(Player player) throws FileNotFoundException, IOException{
		Deck d = player.getDeck();		
		 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(file)));
	    os.writeObject(d);
		os.close();
	}
	
	public void returnDeck(Player player) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(file)));
        Deck dFromFile = (Deck)ois.readObject();
        player.setDeck(dFromFile);
        ois.close();
      
	}
	
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public void sayGoodGame() {
		// TODO Auto-generated method stub
		System.out.println("GoodGame!");
	}
	
	public void setMana(int value) {
		mana = value;
	}

	public Card selectCard(int select){
		return hand.getValue(select);
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
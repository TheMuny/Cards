package Room;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Cards.Spells.Spell;
import Cards.Card;
import Room.Player;
import Cards.Spells.Cast;

public class GameRoom {

	private  String  file = "Deck";
	private int saveNumber=0;

	 private static Player player1 = new Player();
	 private static Player player2 = new Player();
	 private static Player currentPlayer;
	 private static Player opponent;
	 private static Card[] tableP1= new Card[8];
	 private static Card[] tableP2= new Card[8];

 	
 	
	 public void setNumberOfDeck(int saveNumber) {
		this.saveNumber = saveNumber;
	}

     
 	public void  clear(Card[] table, List<Card> hand){
 		int size = hand.size();
 		for(int i=0;i<size;i++){
 			if(hand.get(i)!=null&&hand.get(i).isDead()){
 				hand.remove(i);
 				size=hand.size();
 			}
 		}
 		for(int i =0;i<table.length;i++){
 			if(table[i]!=null){
 			   Card c = (Card)table[i];
 			   if(c.isDead()){
 				   table[i]=null;
 			   }
 			}
 		}
				
	}
     
 	public void  clear(List<Card> hand){
 		int size = hand.size();
 		for(int i=0;i<size;i++){
 			if(hand.get(i)!=null&&hand.get(i).isDead()){
 				hand.remove(i);
 				size=hand.size();
 			}
 		}
 	}
 	
	public void saveDeck(Player player) throws FileNotFoundException, IOException{
		List<Card> d = player.getDeck();			
	    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(file+saveNumber)));
	    os.writeObject(d);
		os.close();
	}
	
	public void returnDeck(Player player) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(file+saveNumber)));
		List<Card> dFromFile = (List<Card>)ois.readObject();
        player.setDeck(dFromFile);
        ois.close();
      
	}
	
	
	public void prepareGame() {	
		currentPlayer=player1;
		opponent = player2;
		player2.randomCollect();
		for(int i =0;i<4;i++){
			player1.takeFromDeck();
			player2.takeFromDeck();
		}	
	}
	
	
	public  void changeTurn(){
		//TODO
		System.out.println("Change turn\r\n");
		opponent.setCrystalls(opponent.getCrystals()+1);
		if(currentPlayer==player1){
			currentPlayer=player2;
			opponent=player1;
		}else{
			currentPlayer=player1;
			opponent=player2;
		}
		clear(tableP1,player1.getHand());
		clear(tableP2,player2.getHand());
	}
	//***********************************  Main  *********************************************
	
	
	public static void main(String[] args)  throws IOException, ClassNotFoundException{		
		GameRoom G = new GameRoom();
		G.returnDeck(player1);
		G.prepareGame();
		System.out.println("Wellcome to Grand Tournament!!!!!!");
		while(true){
			if(player1.getHealth()==0||player2.getHealth()==0){
				System.out.println("Game Over");
				break;
			}
		currentPlayer.takeFromDeck();
		
//		do{
		try{
		currentPlayer.printHandCards();
		System.out.println("\r\nPlease select card");		
			String userInput = new UI().userInput();
			if(userInput.equalsIgnoreCase("p"))
				throw new Exception();
			for(int i =0;i<currentPlayer.getHand().size();i++){//for1
			if(	currentPlayer.getHand().get(i).getName().equalsIgnoreCase(userInput)&&currentPlayer.getHand()
					.get(i)instanceof Spell){//if_spell
				System.out.println("Make choise: ");
				System.out.println("1) Apply to face  "+"  2) Apply to creature  "+"  3) Apply AOE spell  "
				+"  \r\np) Skip "+"   l) Show hand   " );
				
				String userInput1 = new UI().userInput();				
				switch(userInput1){
				case "l":
					currentPlayer.printHandCards();
					break;
				case "p":
					throw new Exception();
				case "1":
					Cast C = (Cast)currentPlayer.getHand().get(i);
					C.useCast(opponent);
					System.out.println("opponent current hp is - "+opponent.getHealth()+"\r\n");
					G.clear(currentPlayer.getHand());
					break; 
				case "2":
					System.out.println("Select creature");
					int count =0;
					for(int t =0;t<tableP1.length;t++){
						if(tableP1[t]!=null){
							count++;
						System.out.println(tableP1[t].getName());
						}
					}
					if(count == 0){
						System.out.println("Table is empty");
					}
//					Cast C1 = (Cast)currentPlayer.getHand().get(i);
//					C1.useCast(opponent);
					break;				
				}//switch
			
			}//if_spell
		
	}	//for1
			
//		}while(currentPlayer.getCrystals()>0);	
		}catch(Exception e){}
			G.changeTurn();
}//while_true
		
	
	
	
	}}//class+main
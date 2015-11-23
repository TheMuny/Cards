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
import Cards.Card;
import Room.Player;

public class GameRoom implements Models.GameRoom{

	private  String  file = "Deck";
	private int saveNumber=0;

	 private static Player player1 = new Player();
	 private static Player player2 = new Player();
	 private static Card[] tableP1;
	 private static Card[] tableP2;
     private static int step=1;
	
 	
 	
	 public void setSaveNumber(int saveNumber) {
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
     
	public void saveDeck(Player player) throws FileNotFoundException, IOException{
	//	Random r = new Random();
	//  int u = r.nextInt(2000000);
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
		player1.randomCollect();
		player2.randomCollect();
		
		for(int i =0;i<4;i++){
			player1.takeFromDeck();
			player2.takeFromDeck();
		}	
		tableP1 = new Card[8];
		tableP2 = new Card[8];
	}
	
	
	public  void changeTurn(Player player){
		//TODO
		player.setCrystalls(step);
		clear(tableP1,player1.getHand());
		clear(tableP2,player2.getHand());
			step++;
	}
	
	
	public static void main(String[] args)  throws IOException, ClassNotFoundException{		
		GameRoom G = new GameRoom();
	//	G.prepareGame();
	//	G.saveDeck(player1);
		G.returnDeck(player1);
		for(int i =0;i<4;i++){
			player1.takeFromDeck();
	//		player2.takeFromDeck();
		}
	
		
//		for(int i =0;i<player1.getHand().length();i++){
//	    System.out.println(player1.getHand().getValue(i));}	
		G.player1.printHandCards();
		System.out.println("P2health == "+G.player2.getHealth());
	    G.player1.useCast(2, player2);
	    System.out.println("P2health == "+G.player2.getHealth());
	//	G.player1.useCast(4, tableP1, tableP2);
		
//			G.saveDeck(player1) ;
//		
//			G.returnDeck(player1);
//		
//			G.returnDeck(player1);
//		
//			G.player1.takeFromDeck(28);
//			
//			G.player1.putOnTable(tableP1, 3, 2);
//			
//			System.out.print(tableP1[2]);
//		
		
		
//		Deck d = player1.getDeck();		
//		 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(file)));
//	    os.writeObject(d);
//		os.close();
//		
//		 System.out.println(d);
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(file)));
//        Deck dFromFile = (Deck)ois.readObject();
//        System.out.println(dFromFile);
	}

	
}

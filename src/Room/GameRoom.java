package Room;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

import Cards.Card;
import Cards.Creatures.Creature;
import Cards.Spells.Spell;
import Cards.Weapons.Weapon;
import Room.Player;

public class GameRoom implements Models.GameRoom{

	private  String  file = "Deck";
	
	 private static Player player1 = new Player();
	 private Player player2 = new Player();
	 private Card[] tableP1 = new Card[8];
	 private Card[] tableP2 = new Card[8];
     private int step=0;
	
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
	
	
	public void prepareGame() {
		player1.getDeck().randomCollect();
		player1.takeFromDeck(4);
		player2.getDeck().randomCollect();
		player2.takeFromDeck(4);
	}
	
	
	public void changeTurn(){
			step++;
	}
	
	
	public static void main(String[] args)  throws IOException, ClassNotFoundException{		
		GameRoom G = new GameRoom();
		G.prepareGame();
		
			G.saveDeck(player1) ;
		
			G.returnDeck(player1);
		
			G.returnDeck(player1);
		
		
		
		
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

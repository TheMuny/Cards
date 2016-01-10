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
import Cards.Creatures.C_Crow;
import Cards.Creatures.Creature;
import Room.Player;
import Cards.Spells.Cast;

public class GameRoom {

	private  String  file = "Deck";
	private int saveNumber=0;

	 private static Player player1 = new Player();
	 private static Player player2 = new Player();
	 private static Player currentPlayer;
	 private static Player opponent;

 	
 	
	 public void setNumberOfDeck(int saveNumber) {
		this.saveNumber = saveNumber;
	}

     
 	public void  clear(List<Creature> table, List<Card> hand){
 		int size = hand.size();
 		for(int i=0;i<size;i++){
 			if(hand.get(i)!=null&&hand.get(i).isDead()){
 				hand.remove(i);
 				size=hand.size();
 			}
 		}
 		size = table.size();
 		for(int i =0;i<size;i++){
 			if(table.get(i)!=null&&table.get(i).isDead()){
 				   table.remove(i);
 				   size = table.size();
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
		clear(player1.getTable(),player1.getHand());
		clear(player2.getTable(),player2.getHand());
	}
	//***********************************  Main  *********************************************
	
	
	public static void main(String[] args)  throws IOException, ClassNotFoundException{		
		GameRoom G = new GameRoom();
		
		
		// TEST board TODO(delete next string)
		player2.getTable().add(new C_Crow());
		
		
		G.returnDeck(player1);
		G.prepareGame();
		System.out.println("Wellcome to Grand Tournament!!!!!!");
		while(true){
			if(player1.getHealth()==0||player2.getHealth()==0){
				System.out.println("Game Over");
				break;
			}
		currentPlayer.takeFromDeck();
		

		try{
		do{
		currentPlayer.printHandCards();
		System.out.println("\r\nPlease select card");		
			String userInput = new UI().userInput();
			if(userInput.equalsIgnoreCase("p"))
				throw new Exception();
			for(int i =0;i<currentPlayer.getHand().size();i++){//for1
				
				
				//**************    IF SPELL     ****************/
				
			if(	currentPlayer.getHand().get(i).getName().equalsIgnoreCase(userInput)&&currentPlayer.getHand()
					.get(i)instanceof Spell){//if_spell
				System.out.println("Make choise: ");
				System.out.println("1) Apply to face  "+"  2) Apply to creature  "
				+"  \r\np) Skip ");
				
				
				Cast Cast = (Cast)currentPlayer.getHand().get(i);
				userInput = new UI().userInput();				
				switch(userInput){

				
				case "p":/*     Skip    */
					throw new Exception();
					
					
				case "1":/*     Apply to FACE    */
					currentPlayer.modifyCrystals(currentPlayer.getCrystals()-currentPlayer.getHand().get(i).getCost());					
					Cast.useCast(opponent);
					System.out.println("opponent current hp is - "+opponent.getHealth()+"\r\n");
					G.clear(currentPlayer.getHand());
					break; 
					
					
				case "2":/*     Apply to Creature (recreate table like collection inside Class Player as hand and deck)   */
					System.out.println("Select creature");
					currentPlayer.modifyCrystals(currentPlayer.getCrystals()-currentPlayer.getHand().get(i).getCost());
					int count =0;
					for(int t =0;t<opponent.getTable().size();t++){
						if(opponent.getTable().get(t)!=null){
							count++;
							
						System.out.println(t+") "+opponent.getTable().get(t).getName() +"   "+"health points - "+ opponent.getTable().get(t).getHealth()+"    "+"attack power - "+ opponent.getTable().get(t).getAttack());
						}
					}
					if(count == 0){
						currentPlayer.modifyCrystals(currentPlayer.getCrystals()+currentPlayer.getHand().get(i).getCost());
						System.out.println("Enemy table is empty");						
					}else{
					userInput =  new UI().userInput();
					int num = Integer.parseInt(userInput);
					Cast.useCast(opponent.getTable().get(num));	
			//		System.out.println(opponent.getTable().get(num).isDead()+" "+opponent.getTable().get(num).getName());
					G.clear(opponent.getTable(),player1.getHand());
					G.clear(currentPlayer.getTable(),player2.getHand());
					}

					break;				
				}//switch1
				
				
		    	//*******************         IF CREATURE      *****************
				
			
			}else if(currentPlayer.getHand().get(i).getName().equalsIgnoreCase(userInput)&&currentPlayer.getHand()
					.get(i)instanceof Creature){
				System.out.println("Make choise: ");
				System.out.println("1) Put on the Table  "
				+"  \r\np) Skip ");
				
				
				userInput = new UI().userInput();
				switch(userInput){
				
				case "p":/*     Skip    */
					throw new Exception();
				case "1":/* On The Table   */
					currentPlayer.putOnTable(currentPlayer.getHand().indexOf(currentPlayer.getHand().get(i)), currentPlayer.getTable());			
				}
			}
		
	}	//for1
			
		}while(currentPlayer.getCrystals()>0);
		}catch(Exception e){
		//	e.printStackTrace();
		}
			G.changeTurn();
}//while_true
		
	
	
	
	}}//class+main
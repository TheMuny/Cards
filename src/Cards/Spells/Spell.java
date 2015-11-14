package Cards.Spells;

import java.util.Random;

import Cards.Card;
import Cards.Creatures.Creature;
import Models.Player;


public class Spell  extends Card implements S_BindingHeal,S_ChainLighting,S_FireBall,S_FireWall,
S_FrostBall,S_FrostNova,S_HandOfGod,S_HellFire,S_HolyRain,S_LightningStrike
{

	
	//______________________________________________________________
	public void BindingHeal(Creature creature) {
		// TODO Auto-generated method stub
		//**************************
	}

	//______________________________________________________________
	public void chainLighting(Card[] table) {

		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				Random r = new Random();
				int rand = r.nextInt(2)+2;
				m.modifyHealth(m.getHealth()-rand);}}
	}
	//______________________________________________________________
	public void fireBToFace(Player player) {	
		player.modifyHealth(player.getHealth()-6);
		
	}
	//______________________________________________________________
	public void fireBToCreature(Creature creature) {
		creature.modifyHealth(creature.getHealth()-6);
	}
	//______________________________________________________________
	public void fireWall(Card[] table) {
	
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				m.modifyHealth(m.getHealth()-4);
			}
		}
	}
	//______________________________________________________________
	public void frostBToFace(Player player) {
		// TODO Auto-generated method stub
		player.modifyHealth(player.getHealth()-3);
		
	}
	//______________________________________________________________
	public void frostBToCreature(Creature creature) {
		// TODO Auto-generated method stub
		creature.modifyHealth(creature.getHealth()-3);
		creature.freez(1);
	}
	//______________________________________________________________
	public void frostNova(Card[] table) {
		// TODO Auto-generated method stub
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];
				m.freez(1);
			}
     	}
    }
	//______________________________________________________________
	public void handOfGod(Creature creature) {		
		creature.modifyHealth(creature.getHealth()+6);
	}
	//______________________________________________________________
	public void hellFire(Card[] table, Card[] table1) {
		
		for(int i =0;i<table.length;i++){
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];				
				m.modifyHealth(m.getHealth()-3);
		}
	}
		for(int i =0;i<table.length;i++){
			if(table1[i]instanceof Creature){
				Creature n = (Creature)table1[i];
				n.modifyHealth(n.getHealth()-3);
		}
	}
}
	//______________________________________________________________
	public void Rain(Card[] table) {
		// TODO Auto-generated method stub
		for(int i =0;i<table.length;i++){
			
			if(table[i]instanceof Creature){
				Creature m = (Creature)table[i];				
				m.modifyHealth(m.getHealth()+2);
		}		
	}
}		
	//______________________________________________________________

	public void lightningStrike(Creature creature) {
		Random r =new Random();
	    int rand = r.nextInt(4)+3;
		creature.modifyHealth(creature.getHealth()-rand);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	


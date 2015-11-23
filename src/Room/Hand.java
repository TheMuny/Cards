package Room;

import Cards.Card;
public class Hand{
   
    private Card [] Array = new Card [1];

	public Card getValue(int index) {
		return Array[index];
	}

	public void addElement(Card value) {
		Array[Array.length-1]=value;	
		Card[] b = new Card[Array.length+1];
		System.arraycopy(Array,0,b,0,Array.length);
		Array=b;
		/*Add element to storage*/
	}


	public int length(){
		return Array.length;
	}
	public void removeValue(Card value) {
		int count = 0;
		
		for(int i=0;i<Array.length;i++){
			if(value==Array[i]){
				count++;			
			}
		}		
		Card[] b = new Card[Array.length-count];
		int s=0;
		for(int i=0;i<Array.length;i++){
			if(value!=Array[i]&&s<b.length){			
				b[s]=Array[i];
				s++;
			}			
		}	
		Array=b;
	}	
	
}

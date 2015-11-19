package Models;

import Room.Player;

public interface GameRoom {

	
	void prepareGame();
	void changeTurn(Player player);
}

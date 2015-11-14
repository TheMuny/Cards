package Models;

public interface Card {

    void toFace(Player player);
    void toCreatures(Card creatures);
	void turnSide();
}

package game;

import javafx.scene.image.Image;

public class Card {
    private final Rank rank;
    private final Suit suit;
    private final Image img;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        img = new Image("resources/deck/" + toString());
    }

    public Rank getRank() {
        return rank;
    }

    public Image getImg() {
        return img;
    }

    @Override
    public String toString() {
        return rank + "_of_" + suit + ".png";
    }
}

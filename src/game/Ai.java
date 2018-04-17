package game;

public class Ai extends Player {

    Ai(String name) {
        super(name);
    }

    @Override
    public void takeCard(Deck deck) {
        super.takeCard(deck);
        if (this.getPoints() > 17) this.setFull();
    }
}

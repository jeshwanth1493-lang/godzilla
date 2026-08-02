package SystemDesign.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        initialize();
    }

    private void initialize() {

        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {

        if (cards.isEmpty()) {
            return null;
        }

        return cards.remove(0);
    }

    public int remainingCards() {
        return cards.size();
    }

    public void reset() {
        initialize();
    }

}

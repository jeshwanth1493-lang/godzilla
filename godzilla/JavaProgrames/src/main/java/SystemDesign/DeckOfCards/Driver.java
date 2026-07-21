package SystemDesign.DeckOfCards;

public class Driver {

    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println("Total Cards : " + deck.remainingCards());

        deck.shuffle();

        System.out.println(deck.drawCard());
        System.out.println(deck.drawCard());
        System.out.println(deck.drawCard());

        System.out.println("Remaining : " + deck.remainingCards());
    }
}

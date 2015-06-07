package blackJackPackage;
import java.util.*;

public class Deck {

    private Card[] cards = new Card[52];
    private int index = -1;

    public Deck() {
        // build deck
        for (int i=0; i<52; ++i) {
            if (i<13) cards[i] = new Card('s',i);
            else if (i<26) cards[i] = new Card('c',i-13);
            else if (i<39) cards[i] = new Card('d',i-26);
            else if (i<52) cards[i] = new Card('h',i-39);
        }
        // shuffle deck
        Collections.shuffle(Arrays.asList(cards));
    }

    public Card drawCard() {
        ++index;
        cards[index].drawn();
        return cards[index];
    }
}

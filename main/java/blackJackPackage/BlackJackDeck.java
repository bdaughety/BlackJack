/**
 * 
 */
package blackJackPackage;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Benjamin Daugety
 * need to create a black jack deck to use BlackJackCard
 */
public class BlackJackDeck {
	private BlackJackCard[] cards = new BlackJackCard[52];
    private int index = -1;

    public BlackJackDeck() {
        // build deck
        for (int i=0; i<52; ++i) {
            if (i<13) cards[i] = new BlackJackCard('s',i);
            else if (i<26) cards[i] = new BlackJackCard('c',i-13);
            else if (i<39) cards[i] = new BlackJackCard('d',i-26);
            else if (i<52) cards[i] = new BlackJackCard('h',i-39);
        }
        // shuffle deck
        Collections.shuffle(Arrays.asList(cards));
    }

    public BlackJackCard drawCard() {
        ++index;
        cards[index].drawn();
        return cards[index];
    }
}

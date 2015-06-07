package blackJackPackage;

public class Card {
	private char suit;
    protected int value;
    private boolean drawn = false;

    Card(char s, int v)
    {
        suit = s;
        value = v;
    }

    void drawn()
    {
		drawn = true;
	}

    boolean isDrawn()
    {
		return drawn;
	}

    String getCardName()
    {
		String cardName = "", cardValue = "", cardSuit = "";

		switch (value)
		{
			case 0:
				cardValue = "Ace";
				break;
			case 1:
				cardValue = "Two";
				break;
			case 2:
				cardValue = "Three";
				break;
			case 3:
				cardValue = "Four";
				break;
			case 4:
				cardValue = "Five";
				break;
			case 5:
				cardValue = "Six";
				break;
			case 6:
				cardValue = "Seven";
				break;
			case 7:
				cardValue = "Eight";
				break;
			case 8:
				cardValue = "Nine";
				break;
			case 9:
				cardValue = "Ten";
				break;
			case 10:
				cardValue = "Jack";
				break;
			case 11:
				cardValue = "Queen";
				break;
			case 12:
				cardValue = "King";
				break;
		}
		switch (suit)
		{
			case 's':
				cardSuit = "Spades";
				break;
			case 'c':
				cardSuit = "Clubs";
				break;
			case 'd':
				cardSuit = "Diamonds";
				break;
			case 'h':
				cardSuit = "Hearts";
				break;
		}
		cardName = cardValue + " of " + cardSuit;
		return cardName;
	}

    public String toString()
    {
		return getCardName();
	}
}

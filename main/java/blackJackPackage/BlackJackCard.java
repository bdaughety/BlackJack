package blackJackPackage;

public class BlackJackCard extends Card{
	private int cardValue = 0;

	public BlackJackCard(char newSuit, int newValue)
    {
        super(newSuit, newValue);
    }

	public int getCardValue()
	{
		switch (value)
		{
			case 0:
				cardValue = 11;
				break;
			case 1:
				cardValue = 2;
				break;
			case 2:
				cardValue = 3;
				break;
			case 3:
				cardValue = 4;
				break;
			case 4:
				cardValue = 5;
				break;
			case 5:
				cardValue = 6;
				break;
			case 6:
				cardValue = 7;
				break;
			case 7:
				cardValue = 8;
				break;
			case 8:
				cardValue = 9;
				break;
			case 9:
			case 10:
			case 11:
			case 12:
				cardValue = 10;;
				break;
		}

		return cardValue;
	}
}

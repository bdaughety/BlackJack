package blackJackPackage;

import java.awt.event.*;

public class BlackJackWindow {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6169167571604187021L;

	private boolean GAME_OVER = true;


	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private int playerHandTotal = 0, 
				dealerHandTotal = 0;
	private BlackJackCard currentCard = new BlackJackCard('s', 0);
	private BlackJackCard playersFirstCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersFirstCard = new BlackJackCard('s', 0);
	private BlackJackCard playersSecondCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersSecondCard = new BlackJackCard('s', 0);
	private BlackJackCard playersThirdCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersThirdCard = new BlackJackCard('s', 0);
	private BlackJackCard playersFourthCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersFourthCard = new BlackJackCard('s', 0);
	private BlackJackCard playersFifthCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersFifthCard = new BlackJackCard('s', 0);
	private BlackJackCard playersSixthCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersSixthCard = new BlackJackCard('s', 0);
	private BlackJackCard playersSeventhCard = new BlackJackCard('s', 0);
	private BlackJackCard dealersSeventhCard = new BlackJackCard('s', 0);
	
	private class HitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private class StandButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private class DoubleButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
	private class SplitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	/**
	 * Private inner class that handles the event when the user
	 * clicks the Hit button.
	 */
//	private class DealButtonListener implements ActionListener
//	{
//		public void actionPerformed(ActionEvent e)
//		{
//			playerHandTotal = 0;
//			dealerHandTotal = 0;
//
//			// New deck is created and shuffled.
//			BlackJackDeck blackJackDeck = new BlackJackDeck();
//
//			// 1. Player is dealt first card.
//			currentCard = blackJackDeck.drawCard();
//			playerHandTotal += currentCard.getCardValue();
//			playersFirstCard = currentCard;
//			playerFirstLabel.setText(playersFirstCard.toString());
//			playerTotalLabel.setText(Integer.toString(playerHandTotal));
//			if(playersFirstCard.getCardValue() == 1)
//				playerTotalLabel.setText(Integer.toString(playerHandTotal) + "(11)");
//
//			// 2. Dealer is dealt first card.
//			currentCard = blackJackDeck.drawCard();
//			dealerHandTotal += currentCard.getCardValue();
//			dealersFirstCard = currentCard;
//			dealerFirstLabel.setText(dealersFirstCard.toString());
//			dealerTotalLabel.setText(Integer.toString(dealerHandTotal));
//			if(dealersFirstCard.getCardValue() == 1)
//				dealerTotalLabel.setText(Integer.toString(dealerHandTotal) + "(11)");
//
//			// 3. Player is dealt second card.
//			currentCard = blackJackDeck.drawCard();
//			playerHandTotal += currentCard.getCardValue();
//			playersSecondCard = currentCard;
//			playerSecondLabel.setText(playersSecondCard.toString());
//			playerTotalLabel.setText(Integer.toString(playerHandTotal));
//			if(playersSecondCard.getCardValue() == 1 || playersFirstCard.getCardValue() == 1)
//				playerTotalLabel.setText(Integer.toString(playerHandTotal) + "(" + Integer.toString(playerHandTotal + 10) + ")");
//
//			// 4. Dealer is dealt hidden second card.
//			currentCard = blackJackDeck.drawCard();
//			dealersSecondCard = currentCard;
//			dealerHandTotal += currentCard.getCardValue();
//			dealersSecondCard = currentCard;
//			dealerSecondLabel.setText("Hidden Card");
//
//			dealButton.setEnabled(false);
//			GAME_OVER = false;
//		}
//	}
	public static void main(String[] args) {
		
//		new BlackJackWindow();

		

	/* 	// Print entire deck
		for(int i = 0; i < 52; ++i)
		{
			currentCard = blackJackDeck.drawCard();
			System.out.println(currentCard);
		}
	*/
	}
}

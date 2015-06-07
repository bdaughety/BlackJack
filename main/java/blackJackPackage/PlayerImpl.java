package blackJackPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Daughety on 6/6/2015.
 */
public class PlayerImpl implements Player {
    private Integer score;
    private Integer handSize;
    private List<BlackJackCard> playerHand;
    private boolean isStanding = false;
    private boolean blackJack;
    private boolean busted;

    public void hit(BlackJackCard newCard) {
        if (playerHand == null || playerHand.isEmpty()) {
            playerHand = new ArrayList<BlackJackCard>();
        }
        if (!isStanding && !hasBlackJack() && !hasBusted()) {
            playerHand.add(newCard);
        }
        calculateScore();
    }

    public boolean stand() {
        isStanding = true;
        return isStanding;
    }

    public Integer calculateScore() {
        score = 0;
        if (playerHand != null && !playerHand.isEmpty()) {
            for (BlackJackCard blackJackCard : playerHand) {
                score += blackJackCard.getCardValue();
            }
        }
        return score;
    }

    public boolean hasBlackJack() {
        blackJack = false;
        if (playerHand != null && playerHand.size() == 2) {
            if (calculateScore() == BLACK_JACK_SCORE) {
                blackJack = true;
                stand();
            }
        }
        return blackJack;
    }

    public void resetHand() {
        playerHand.clear();
        calculateScore();
        hasBlackJack();
        isStanding = false;
    }

    public boolean hasBusted() {
        busted = false;
        score = calculateScore();
        if (score > BLACK_JACK_SCORE) {
            if ((handContainsAnAce() && score > PERFECT_SCORE_WITH_ACE)
                    || !handContainsAnAce()) {
                busted = true;
            }
        }
        return busted;
    }

    public boolean handContainsAnAce() {
        for (BlackJackCard blackJackCard : getPlayerHand()) {
            if (blackJackCard.getCardName().equalsIgnoreCase("ace")) {
                return true;
            }
        }
        return false;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getHandSize() {
        handSize = 0;
        if (playerHand != null) {
            handSize = playerHand.size();
        }
        return handSize;
    }

    public List<BlackJackCard> getPlayerHand() {
        if (playerHand == null || playerHand.isEmpty()) {
            playerHand = new ArrayList<BlackJackCard>();
        }
        return playerHand;
    }

}

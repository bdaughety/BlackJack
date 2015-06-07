package blackJackPackage;

/**
 * Created by Ben Daughety on 6/6/2015.
 */
public interface Player {
    Integer BLACK_JACK_SCORE = 21;
    Integer PERFECT_SCORE_WITH_ACE = 31;

    void hit(BlackJackCard blackJackCard);
    boolean stand();
    Integer calculateScore();
    boolean hasBlackJack();
    void resetHand();
    boolean hasBusted();
    boolean handContainsAnAce();
}

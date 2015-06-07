package blackJackPackage;

import org.junit.Test;
import sun.rmi.runtime.Log;

import java.io.Console;
import java.util.DoubleSummaryStatistics;

import static org.junit.Assert.*;

/**
 * Created by Ben Daughety on 6/7/2015.
 */
public class PlayerImplUnitTest {

    @Test
    public void testHit() throws Exception {
        PlayerImpl player = new PlayerImpl();

        assertTrue(player.getHandSize() == 0);

        BlackJackCard sixOfClubs = new BlackJackCard('c', 5);
        player.hit(sixOfClubs);
        assertTrue(player.getHandSize() == 1);

        player.resetHand();
        BlackJackCard aceOfHearts = new BlackJackCard('h', 0);
        BlackJackCard tenOfDiamonds = new BlackJackCard('d', 9);
        player.hit(aceOfHearts);
        player.hit(tenOfDiamonds);
        assertTrue(player.getHandSize() == 2);

        player.hit(sixOfClubs);
        assertTrue(player.getHandSize() == 2);

        player.resetHand();
        System.out.println(player.getScore());
        player.hit(tenOfDiamonds);
        player.hit(sixOfClubs);
        player.hit(aceOfHearts);
        System.out.println(player.getScore());
        assertTrue(player.getHandSize() == 3);
    }

    @Test
    public void testStand() throws Exception {

    }

    @Test
    public void testCalculateScore() throws Exception {

    }

    @Test
    public void testHasBlackJack() throws Exception {

    }
}
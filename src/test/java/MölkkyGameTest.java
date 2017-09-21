import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MölkkyGameTest {

    @Test
    public void canKnockOutPin() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(3);

        assertEquals(game.score(), 3);
   }
    @Test
    public void canKnockOutThe5thPin() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(5);

        assertEquals(game.score(), 5);
    }

    @Test
    public void canKnockOutTwoPins() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(3, 4);

        assertEquals(game.score(), 2);

    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MölkkyGameTest {

    @Test
    public void canKnockOutPin() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(3);

        assertEquals(3, game.score());
   }
    @Test
    public void canKnockOutThe5thPin() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(5);

        assertEquals(5, game.score());
    }

    @Test
    public void canKnockOutTwoPins() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(3, 4);

        assertEquals(2, game.score());

    }

    @Test
    public void canKnockOutTwice() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(3, 4);
        game.knockOut(3, 4);

        assertEquals(4, game.score());

    }
    @Test
    public void canKnockOutTwice2() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(3, 4);
        game.knockOut(3);

        assertEquals(5, game.score());

    }
}

public class MölkkyGame {
    public void knockOut(int... pins) {
        score = notOnlyOnePin(pins) ? number(pins) : value(pins);
    }

    private int value(int[] pins) {
        return pins[0];
    }

    private int number(int[] pins) {
        return pins.length;
    }

    private boolean notOnlyOnePin(int[] pins) {
        return pins.length != 1;
    }

    public int score() {
       return score;
    }

    private int score = 0;
}

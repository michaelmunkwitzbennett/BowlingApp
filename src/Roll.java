/**
 * This class simulates a roll from a player
 * @author Michael Munkwitz-Bennett
 */
public class Roll {
    private int pinCount;

    /**
     * This creates a roll object with an amount of pins knocked over
     * @param pinCount
     */
    public Roll(int pinCount) {
        this.pinCount = pinCount;
    }

    /**
     * This returns the number of pins knocked over for this roll
     * @return pinCount
     */
    public int getPinCount() {
        return pinCount;
    }


}

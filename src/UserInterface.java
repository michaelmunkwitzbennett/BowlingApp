import java.util.Scanner;

public class UserInterface {
    private static UserInterface instance = null;
    private static Scanner keyboard = null;

    private UserInterface() {
        keyboard = new Scanner(System.in);
    }

    public int getPlayerRoll() {
        System.out.println("How many pins did you knock down?");
        int pinCount = keyboard.nextInt();

        return pinCount;
    }
}

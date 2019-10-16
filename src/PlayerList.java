import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    List<Player> players = new ArrayList<Player>();

    public PlayerList() {

    }

    public void doRound() {
        for (Player p: players) {
            p.takeTurn();
        }
    }
}

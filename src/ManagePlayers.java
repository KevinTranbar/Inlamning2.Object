import java.util.ArrayList;
import java.util.Collections;

public class ManagePlayers {

    ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(String name, String team, String pos, int goals){
        Player player = new Player(name, team, pos, goals);
        players.add(player);

    }

    public void removePlayer(String name){
        players.removeIf(hej -> hej.getName().equalsIgnoreCase(name));

    }

    public void searchPlayer(String name){
        for (Player p : players){
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Player: " + p.getName() + " " + p.getTeam() + " " + p.getPosition() + " " + p.getNumOfGoals());
                return;

            }
        }
    }

    public void showPlayersByNumOfGoals(){
        Collections.sort(players);
        Collections.reverse(players);

        players.forEach(e -> System.out.println("Player: " + e.getName() + " " + e.getTeam() + " " + e.getPosition() + " " + e.getNumOfGoals()));

    }
}
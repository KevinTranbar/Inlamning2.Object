import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagePlayers {

    ArrayList<Player> players = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void playerInterface(){
        System.out.println("1. Add Player");
        System.out.println("2. Remove Player");
        System.out.println("3. Search Player");
        System.out.println("4. List Players by goals");
        System.out.println("5. Exit");
        String selection = scanner.nextLine();
        switch (selection){
            case "1" -> addPlayer();
            case "2" -> removePlayer();
            case "3" -> searchPlayer();
            case "4" -> showPlayersByNumOfGoals();
            case "5" -> System.exit(0);
            default -> System.out.println("Invalid selection");
        }
    }

    public void addPlayer(){
        System.out.println("Name: " );
        String name = scanner.nextLine();

        System.out.println("Team: " );
        String team = scanner.nextLine();

        System.out.println("Position: " );
        String pos = scanner.nextLine();

        System.out.println("Goals: " );
        int goals = Integer.parseInt(scanner.nextLine());

        Player player = new Player(name, team, pos, goals);
        players.add(player);

        System.out.println("Add another Player? (Y/N):");
        if (!scanner.nextLine().equalsIgnoreCase("Y")) {
            playerInterface();
        } else
            addPlayer();

    }

    public void removePlayer(){
        System.out.println("Name: " );
        String name = scanner.nextLine();

        players.removeIf(hej -> hej.getName().equalsIgnoreCase(name));

        System.out.println("Remove another Player? (Y/N):");
        if (!scanner.nextLine().equalsIgnoreCase("Y")) {
            playerInterface();
        } else
            removePlayer();

    }

    public void searchPlayer() {
        System.out.println("Name: ");
        String name = scanner.nextLine();

        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Player: " + p.getName() + " " + p.getTeam() + " " + p.getPosition() + " " + p.getNumOfGoals());
                return;
            }
        }
        System.out.println("Player: " + name + " not found");
    }

    public void showPlayersByNumOfGoals(){
        Collections.sort(players);
        Collections.reverse(players);

        players.forEach(e -> System.out.println("Player: " + e.getName() + " " + e.getTeam() + " " + e.getPosition() + " " + e.getNumOfGoals()));

        System.out.println("Go back? (Y/N):");
        if (!scanner.nextLine().equalsIgnoreCase("Y")) {
            showPlayersByNumOfGoals();
        } else
            playerInterface();

    }
}
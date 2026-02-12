public class Test {

    public static void main(String[] args) {

        ManagePlayers managePlayers = new ManagePlayers();

        managePlayers.addPlayer("Kevin","Barcelona","Right",23);
        managePlayers.addPlayer("Deja", "Barcelona","Left",40);
        managePlayers.addPlayer("Kevin","Barcelona","Left",75);
        managePlayers.addPlayer("Deja", "Barcelona","Left",2231);
        managePlayers.addPlayer("Kevin","Barcelona","Left",90);
        managePlayers.addPlayer("Deja", "Barcelona","Left",7);
        managePlayers.addPlayer("Kevin","Barcelona","Left",23);
        managePlayers.addPlayer("Deja", "Barcelona","Left",5412);
        managePlayers.addPlayer("Deja", "Barcelona","Left",21);

        managePlayers.showPlayersByNumOfGoals();


    }
}
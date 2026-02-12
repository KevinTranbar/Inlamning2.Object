public class Player {

    private String name;
    private String team;
    private String position;
    private int numOfGoals;

    public Player(String name, String team, String position, int numOfGoals) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.numOfGoals = numOfGoals;

    }

    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public String getPosition() {
        return position;
    }
    public int getNumOfGoals() {
        return numOfGoals;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setNumOfGoals(int numOfGoals) {
        this.numOfGoals = numOfGoals;
    }
}
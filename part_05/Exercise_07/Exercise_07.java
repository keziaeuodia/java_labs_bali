package part_05.Exercise_07;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class BaseballTeams {

    private String league; //instance variable 1
    private char division; //instance variable 2
    static int numOfPlayers; //static instance variable

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public static int getNumOfPlayers() {
        return numOfPlayers;
    }

    public static void setNumOfPlayers(int numOfPlayers) {
        BaseballTeams.numOfPlayers = numOfPlayers;
    }
}


class TeamConstructor {

    public static void main(String[] args) {

        BaseballTeams blueJays = new BaseballTeams(); //instance of class2 1
        BaseballTeams indians = new BaseballTeams(); //instance of class2 2
        BaseballTeams reds = new BaseballTeams(); //instance of class2  3
        BaseballTeams rockies = new BaseballTeams(); //instance of class2 4


        blueJays.setDivision('E'); //set instance variable of class 2
        blueJays.setLeague("AL");

        indians.setLeague("AL");
        indians.setDivision('C');

        reds.setLeague("NL");
        reds.setDivision('C');

        rockies.setLeague("NL");
        rockies.setDivision('W');

        BaseballTeams.numOfPlayers=32; //set static variable

        System.out.println("The Blue Jays have " + " " + BaseballTeams.numOfPlayers + " " + "players");
        System.out.println("The Blue Jays are in the" + " " + blueJays.getLeague());


    }

}
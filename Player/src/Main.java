public class Main {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is: " + newScore);
        calculateScore(75);

    }

    public static int calculateScore(String playerName,int score){

        System.out.println("Player " + playerName+" scored: "+ score+" Points.");
        return score*1000;

    }

    public static int calculateScore(int score){

        System.out.println( "New score is: "+ score+" Points.");
        return score*1000;

    }
}
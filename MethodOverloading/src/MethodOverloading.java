public class MethodOverloading {

    public static void main(String[] args) {
        int newSocre = calculateScore("Tim", 500);
        System.out.println("New score is " + newSocre);

        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName,  int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }
}


/*
    Method Overloading is when you use the same method name with different
    parameters

    must change the amount of parameters to make the method unique

 */
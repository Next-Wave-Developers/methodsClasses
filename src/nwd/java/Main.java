package nwd.java;

public class Main {

    public static void main(String[] args) {
        /*int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score was " + highScore);*/
         int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Kenai", position );
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Aliyah", position );
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Xolani", position );
       position = calculateHighScorePosition(50);
        displayHighScorePosition("Kevin", position );



    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        //display players name with a message of "Player is in # position on the high score table"
        String positionSuffix = "th";
        if (position == 1) {
             positionSuffix = "st";
        } else if (position == 2) {
            positionSuffix = "nd";
        } else if (position == 3) {
           positionSuffix = "rd";
        }
        System.out.println(playerName + " is in " + position + positionSuffix + " on the leader table");
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;

        } else if (score >= 500 && score < 1000) {
            return 2;

        } else if (score >= 100 && score < 500) {
            return 3;

        } else {
            return 4;

        }


        //return data should be
        //1 if score is >1000
        //2 if score is >500 and <1000
        //3 if score is >100 and <500
        //4 for anything else
    }

}
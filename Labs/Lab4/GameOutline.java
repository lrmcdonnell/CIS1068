
//import scanner
//import random

public class GameOutline {
    //define moves as global variables
    //ex. public static final int MELLTORP = 1;

    public static void main(String[] args) {
        //set up scanner
        // set up random

        //Print game rules
        //Initialize counters, e.g., numRoundsPlayed, numUserWins

        //ask the user if they want to play a round
        //use scanner to read the input

        //if no, quit and give game summary
        //if yes, then play game:
        /* GAME:
         * get user move
         * get computer move
         * determineWinner()
         * numUserWins++ or numComputerWins++
         * increment numRoundsPlayed
         * prompt to play another round
         */
    }
    public static void displayGameRules() {
        //prints rules
    }
    public static int getRandomComputerMove(random Random) {
        //use random.nextInt(5) + 1 -- gives num between [1,5] inclusive
        //return randomInt
    }
    public static int getUserMove(scanner Scanner) {
        //use scanner to take in user move
        //if user move matches one of the move names, assign an int, and return it
        //otherwise, reprompt for invalid input
    }
    public static int determineWinner(int userMove, int computerMove) {
        //use default winner as computer, assign ints
        //go through cases/ conditionals where the user can win
        //return an int for whoever won
    }
    public static void displayRoundResults(int userMove, int computerMove, int winner) {
        //use array to convert moves (ints) to strings
        //read back moves (userMove = _ and computerMove = _)
        //print winner
    }
    public static void displayGameResults(int roundsPlayed, int numUserWins, int numComputerWins) {
        //print the info passed into the function
    }
}

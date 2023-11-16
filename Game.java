// Laura McDonnell
// CIS 1068 section 006
// Sep 29, 2023
//
// Assignment 4
// This program is a game! The user plays against the computer.

import java.util.*; //imports Random & Scanner

public class Game {
    // POSSIBLE MOVES
    public static final int MELLTORP = 1;
    public static final int OLSEROD = 2;
    public static final int KNARREVIK = 3;
    public static final int YNGVAR = 4;
    public static final int UTESPELARE = 5;

    // MAIN METHOD
    public static void main(String[] args) {
        //Initialize scanner & random object
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Initialize game
        displayGameRules();
        int roundsPlayed = 0;
        int userWins = 0;
        int computerWins = 0;
        System.out.print("Do you want to play a round? (y/n): ");
        String response = scanner.nextLine();

        //Handle bad input
        while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
            System.out.print("Please enter a valid input: ");
            response = scanner.nextLine();
        }
        //While loop to keep playing as long as user wants to play
        while (response.equalsIgnoreCase("y")) {
            // Play Game
            int userMoveInt = getUserMove(scanner);
            int computerMoveInt = getRandomComputerMove(random);
            int winner = determineWinner(userMoveInt, computerMoveInt); //determine winner & increments wins count
            if (winner == 1) {
                userWins++;
            } else {
                computerWins++;
            }
            displayRoundResults(userMoveInt, computerMoveInt, winner);
            roundsPlayed++;

            // Prompt for next round
            System.out.print("Do you want to play a round? (y/n): ");
            response = scanner.nextLine();
        }
        // When done playing, display results
        displayGameResults(roundsPlayed, userWins, computerWins);
        scanner.close();
    }

    //GAME RULES
    public static void displayGameRules() {
        System.out.print("Game Rules:\nMelltorp beats Utespelare, Olserod\n" +
                "Utespelare beats Knarrevik, Yngvar \nKnarrevik beats Melltorp, Olserod\n" +
                "Olserod beats Yngvar, Utespelare \nYvngar beats Melltorp, Knarrevik\n");
    }

    //COMPUTER MOVE
    public static int getRandomComputerMove(Random random) {
        return(random.nextInt(5) + 1);
    }

    //USER MOVE
    public static int getUserMove(Scanner scanner) {
        System.out.print("Enter your move (Olserod, Knarrevik, Utespelare, Yngvar, Melltorp): ");
        String userMove = scanner.nextLine();
        int userMoveInt = 0;

        while (userMoveInt == 0) {
            //MELLTORP = 1
            if (userMove.equalsIgnoreCase("Melltorp")) {
                userMoveInt = MELLTORP;
            }
            //OLSEROD = 2
            else if (userMove.equalsIgnoreCase("Olserod")) {
                userMoveInt = OLSEROD;
            }
            //KNARREVIK = 3
            else if (userMove.equalsIgnoreCase("Knarrevik")) {
                userMoveInt = KNARREVIK;
            }
            //YNGVAR = 4
            else if (userMove.equalsIgnoreCase("Yngvar")) {
                userMoveInt = YNGVAR;
            }
            //UTESPELARE = 5
            else if (userMove.equalsIgnoreCase("Utespelare")) {
                userMoveInt = UTESPELARE;
            }
            //INVALID MOVE
            else {
                System.out.print("Please enter a valid move: ");
                userMove = scanner.nextLine();
            }
        }
        return(userMoveInt);
    }

    //WINNER
    public static int determineWinner(int userMove, int computerMove) {
        //COMPUTER = 0
        //USER = 1
        int winner = 0; //Default winner is computer

        //Cases in which the user can win
        if ((userMove == MELLTORP ) && ((computerMove == OLSEROD) || computerMove == UTESPELARE)) {
            winner = 1;
        }
        else if ((userMove == UTESPELARE) && ((computerMove == KNARREVIK) || computerMove == YNGVAR)) {
            winner = 1;
        }
        else if ((userMove == KNARREVIK) && ((computerMove == MELLTORP) || computerMove == OLSEROD)) {
            winner = 1;
        }
        else if ((userMove == OLSEROD) && ((computerMove == UTESPELARE) || computerMove == YNGVAR)) {
            winner = 1;
        }
        else if ((userMove == YNGVAR) && ((computerMove == MELLTORP) || computerMove == KNARREVIK)) {
            winner = 1;
        }
        else {
            winner = 0;
        }
        return(winner);
    }
   //ROUND RESULTS
    public static void displayRoundResults(int userMove, int computerMove, int winner) {
        //Initialize arrays
        int[] moves = {MELLTORP, OLSEROD, KNARREVIK, YNGVAR, UTESPELARE};
        String[] names = {"Melltorp", "Olserod", "Knarrevik", "Yngvar", "Utespelare"};
        //User move
        System.out.print("Your move: ");
        for (int i = 0; i < moves.length; i++) {
            if (userMove == moves[i]) {
                System.out.println(names[i]);
            }
        }
        //Computer move
        System.out.print("Computer move: ");
        for (int i = 0; i < moves.length; i++) {
            if (computerMove == moves[i]) {
                System.out.println(names[i]);
            }
        }
        if (winner == 1) {
            System.out.println("You win this round!");
        }
        else {
            System.out.println("Computer wins this round!");
        }
    }

    //GAME RESULTS
    public static void displayGameResults(int rounds, int numUserWins, int numComputerWins) {
        System.out.print("Game over! \nRounds played: " + rounds + "\n");
        System.out.print("User wins: " + numUserWins + "\nComputer wins: " + numComputerWins);
    }
}


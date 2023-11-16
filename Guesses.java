import java.util.Random;

public class Guesses {
    public static void main(String[] args) {
        System.out.println("Number of guesses: " + makeGuesses());
    }
    public static int makeGuesses() {
        //Initialize Random & first guess
        Random num = new Random();
        int randomGuess = num.nextInt(50) + 1;
        System.out.println("guess = " + randomGuess);

        //Initialize guesses counter
        int num_guesses = 0;

        //While loop | breaks when guess is at least 48
        while (randomGuess <= 48) {
            randomGuess = num.nextInt(50) + 1;
            System.out.println("guess = " + randomGuess);
            num_guesses++;
        }

        return(num_guesses);
    }
}

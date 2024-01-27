import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) {
        String wiseSaying = "There's always money in the banana stand.";

        Scanner in = new Scanner(wiseSaying);

        while(in.hasNext()) {
            String word = in.next();
            System.out.println(word);
        }

        String examScores = "100 90 95 100";
        Scanner scoreParser = new Scanner(examScores);

        int sumScores = 0;
        int numScores = 0;

        while(scoreParser.hasNextDouble()) {
            sumScores += scoreParser.nextDouble();
            numScores++;
        }
        if (numScores > 0) {
            System.out.println("the average is " + sumScores/(double)numScores);
        }
    }
}

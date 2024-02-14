import java.io.*;
import java.util.*;

public class TestMain {

    static final int MIN_DIFFICULTY = 1;
    static final int MAX_DIFFICULTY = 10;

    public static void main(String[] args) throws FileNotFoundException {

        ObjectiveQuestion Q1 = new ObjectiveQuestion(1, 1, 2,
                "How many essential amino acids are there?",
                "9 essential amino acids");

        FillInTheBlankQuestion Q2 = new FillInTheBlankQuestion(1, 3, 2,
                " is the capital of the state of Pennsylvania.",
                "Harrisburg");

        String possibleAnswers[] = {"Banana", "Blueberry", "Strawberry", "Tomato"};

        MultipleChoiceQuestion Q3 = new MultipleChoiceQuestion(1, 5, 1,
                "Which of the following is not botanically classified as a berry?",
                "Strawberry", possibleAnswers);

        Question[] questionList = new Question[3];

        questionList[0] = Q1;
        questionList[1] = Q2;
        questionList[2] = Q3;

        //print test and answer keys to console
        Test test = new Test(questionList);
        System.out.println(test.toString());

        System.out.println("---------Answer key---------");
        for (int i = 0; i < questionList.length; i++) {
            System.out.println(questionList[i].getCorrectAnswer());
        }

        // EXTRA CREDIT:
        // Write test file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name with .txt extension, ex: \"[FILENAME].txt\": ");
        PrintStream p1 = new PrintStream(new File(scanner.next()));

        p1.println(test.toString());
        p1.close(); //done with writing to a file

        // Write answer key file
        System.out.print("Enter file name with .txt extension, ex: \"[FILENAME].txt\" ");
        PrintStream p2 = new PrintStream(new File(scanner.next()));

        p2.println("-------Answer key-------");
        for (int i = 0; i < questionList.length; i++) {
            p2.println(questionList[i].getCorrectAnswer());
        }
    }
}



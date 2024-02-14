// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 10: Test Papers
// This program constructs a 'FillInTheBlankQuestion' class

public class FillInTheBlankQuestion extends ObjectiveQuestion {

    // Constructor
    public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText, correctAnswer);
    }
    public String toString() {
        String s = "________";
        s += questionText + " (" + points + " points)\n";
        s += answerLines(answerSpace);
        return s;
    }

    public String getCorrectAnswer() {
        return "____" + correctAnswer + "____" + questionText + "\n";
    }
}

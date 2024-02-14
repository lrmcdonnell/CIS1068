// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 10: Test Papers
// This program constructs an 'ObjectiveQuestion' class
public class ObjectiveQuestion extends Question {

    protected String correctAnswer;

    // Constructor
    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }

    // Get the question with the correct answer
    public String getCorrectAnswer() {
        return questionText + "\nAnswer: " + correctAnswer + "\n";
    }
}

// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 10: Test Papers
// This program constructs a 'MultipleChoiceQuestion' class

public class MultipleChoiceQuestion extends ObjectiveQuestion {

    protected String[] possibleAnswers;

    // Constructor
    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer, String[] possibleAnswers) {
        super(points, difficulty, answerSpace, questionText, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    public String toString() {
        String s = "";
        s += questionText + " (" + points + " points)\n";
        for (int i = 0; i < possibleAnswers.length; i++) {
            s += (i+1) + "." + possibleAnswers[i] + "\n";
        }
        s += answerLines(answerSpace);
        return s;
    }

    public String getCorrectAnswer() {
        String s = "";
        s += questionText + "\n";
        for (int i = 0; i < possibleAnswers.length; i++) {
            if (possibleAnswers[i].equals(correctAnswer)) {
                s += (i+1) + ". ***" + possibleAnswers[i] + "***\n";
            } else {
                s += (i+1) + ". " + possibleAnswers[i] + "\n";
            }
        }
        return s;
    }
}



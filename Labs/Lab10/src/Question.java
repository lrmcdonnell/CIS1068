// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 10: Test Papers
// This program constructs a 'Question' class
public class Question {

    protected final int MIN_DIFFICULTY = 1;
    protected final int MAX_DIFFICULTY = 10;
    protected int points, difficulty, answerSpace;
    protected String questionText;

    // Constructor
    public Question(int points, int difficulty, int answerSpace, String questionText) {
        this.points = points;
        this.difficulty = difficultyRange(difficulty);
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }
    // To string method
    public String toString() {
        String s = "";
        s += questionText + " (" + points + " points)\n";
        s += answerLines(answerSpace);
        return s;
    }

    // Answer Lines: gets the correct amount of answer space
    public String answerLines(int answerSpace) {
        return "\n".repeat(Math.max(0, answerSpace));
    }

    // Difficulty Range: makes sure the question difficulty is within range
    public int difficultyRange(int difficulty) {
        if (difficulty < MIN_DIFFICULTY) {
            return MIN_DIFFICULTY;
        } else if (difficulty > MAX_DIFFICULTY) {
            return MAX_DIFFICULTY;
        } else {
            return difficulty;
        }
    }

    public int getPoints() {
        return points;
    }

    public String getCorrectAnswer() {
        return toString();
    }
}

// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 10: Test Papers
// This program constructs a 'Test' class

public class Test {

    protected Question[] questions;
    protected int totalPoints;

    // Constructor
    public Test(Question[] questions) {
        this.questions = questions;
        for (int i = 0; i < questions.length; i++) {
            this.totalPoints += questions[i].getPoints();
        }
    }

    // To String method
    public String toString() {
        String s = "";
        s += "----------------TEST----------------\n";
        s += "Instructions: read each question and supply the correct answer. Good luck! \n\n";
        for (int i = 0; i < questions.length; i++) {
            s += questions[i];
        }
        s += "--------------END OF TEST--------------";
        return s;
    }

}

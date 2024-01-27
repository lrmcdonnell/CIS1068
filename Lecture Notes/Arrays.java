public class Arrays {
    public static void main(String[] args) {
        int []grades = {100, 90, 95};

        double sum = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        System.out.println("avg = " + sum/grades.length);
    }
    public static int []makeArray(int length, int initialValue) {
        int[] A = new int[length];
        for (int i = 0; i < A.length; i++) {
            A[i] = initialValue; }
        return A;
    }
    //2D array
    double [][]quizScores = new double[8][10]

    //double [][]A = new double[numRows][numColumns]

    int numRows = quizScores.length;
    int numCols = quizScores[0].length;


}

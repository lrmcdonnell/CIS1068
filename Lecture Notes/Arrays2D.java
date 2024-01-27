public class Arrays2D {
    public static int[] getCol(int[][] A, int colNum) {
        int[] col = new int[A[0].length];
        if (colNum > A[0].length) {
            return null;
        }
        for (int i = 0; i < A.length; i++) {
            col[i] = A[i][colNum];
        }
        for(int i = 0; i < col.length; i++) {
            System.out.println(col[i]);
        }
        return col;
    }

    public static void main(String[] args) {
        int[][] A2D = {
                {10, 11, 1},
                {20, 12, 2},
                {30, 13, 3}};
        getCol(A2D, 1);
    }
}

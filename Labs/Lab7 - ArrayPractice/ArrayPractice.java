package arraypractice;

/**
 *
 * @author jfiore
 */
public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
    //loop through each item, set to initialValue
    for (int i = 0; i < A.length; i++) {
      A[i] = initialValue;
    }
    return;
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  public static double average(int A[]) {
    //initialize sum
    double sum = 0;
    //loop through each item and add to sum
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
    }
    //calculate average
    double avg = sum/A.length;
    return avg;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
    //initialize counter
    int occurrences = 0;
    //loop through A, check whether each item equals 'x'
    for (int i = 0; i < A.length; i++) {
      if (A[i] == x) {
        occurrences++;
      }
    }
    return occurrences;
  }

  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
    //loop through A, check whether each item equals x
    for (int i = 0; i < A.length; i++) {
      if (A[i] == x) {
        //get index
        return i;
      }
    }
    return -1;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
    //loop through A (backwards), check whether each item equals x
    for (int i = A.length - 1; i >= 0; i--) {
      if (A[i] == x) {
        //get index
        return i;
      }
    }
    return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
    //set temporary max to a low number
    int max = Integer.MIN_VALUE;
    //loop through A, update max
    for (int i = 0; i < A.length; i++)
      if (A[i] > max) {
        max = A[i];
      }
    return max;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
    //get the largest item by calling the largest() function
    int maxValue = largest(A);
    //initialize index var
    int maxIndex = -1;
    //find the index at which the max value is found
    for (int i = 0; i < A.length; i++) {
      if (A[i] == maxValue) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  /* returns true if x is odd or false otherwise
   * add a JUnit test to test this method in the
   * file ArrayPracticeTest.java  */
  public static boolean isOdd(int x) {
    if (x % 2 == 0) {
      return false;
    }
    return true;
  }
  
  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers
   *
   * include a call to your isOdd(int) method in
   * your solution */
  public static int indexOfLargestOdd(int A[]) {
    //initialize index and arbitrary max value
    int largestOddIndex = -1;
    int maxOdd = Integer.MIN_VALUE + 1;
    //loop through each element
    for (int i = 0; i < A.length; i++) {
      //check if the element is odd & greater than the current max
      if (isOdd(A[i]) && (A[i] > maxOdd)) {
        //update max & max index
         maxOdd = A[i];
         largestOddIndex = i;
      }
    }
    return largestOddIndex;
  }

  /* inserts n into A[] at A[index] shifting all */
  /* the previous items one place to the right. For example */
  /* if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */
  public static void insert(int A[], int n, int index) {
    //if index is out of bounds, do nothing
    if (index < 0 || index >= A.length - 1) {
      return;
    }
    //start at last index and shift elements to the right
    for (int i = A.length - 1; i >= index; i--) {
      A[i] = A[i-1];
    }
    //update value at desired index
    A[index] = n;
    return;
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
    int i, j;
    //create new array of length A + length B
	int []C = new int[A.length + B.length];
    //loop through A, add each element to new array
    for (i = 0; i < A.length; i++) {
      C[i] = A[i];
     }
    //loop through B, add each element to new array
    for (j = 0; j < B.length; j++) {
      C[i+j] = B[j];
     }
    return C;
    }

  /* exchanges the elements found at A[i] and A[j].
   * Does nothing if i or j is invalid
   *
   * Add a JUnit test to test this method to the
   * file ArrayPracticeTest.java */
  public static void swap(int []A, int i, int j) {
    //store the elements at each index
    int valAti = A[i];
    int valAtj = A[j];
    //swap the values
    A[i] = valAtj;
    A[j] = valAti;
  }
  
  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10}
   * 
   * use your swap() method in your solution
   *
   * Note that this method sorts the array "in place", i.e.,
   * the original array is changed. No new array is created.
   */
  public static void reverse(int A[]) {
    //loop through the first half of the array & swap
    for (int i = 0; i < A.length/2; i++) {
      swap(A, i, (A.length - 1) - i);
    }
    return;
  }
  
  /* returns the specified column from [][]A as a single-dimensional
   * array, or null if colNum is invalid.
   *
   * for example, if A is
   * |---+----+----+----+----|
   * |   |  0 |  1 |  2 |  3 |
   * |---+----+----+----+----|
   * | 0 | 10 | 20 | 30 | 40 |
   * | 1 | 11 | 21 | 31 | 41 |
   * | 2 | 12 | 22 | 32 | 42 |
   * |---+----+----+----+----|
   *
   * and colNum is 1, the array returned is:
   *
   * |----+----+----|
   * |  0 |  1 |  2 |
   * |----+----+----|
   * | 20 | 21 | 22 |
   * |----+----+----|
   *
   * Extra credit: add a JUnit test for this method
   * to the file ArrayPracticeTest.java
   */
  public static int[] getCol(int [][]A, int colNum) {
    //if numCol is out of bounds, do nothing
    if (colNum > A[0].length) {
      return null;
    }
    //create column array
    int[] col = new int[A[0].length];
    //loop through each row of the 2D array
    for (int i = 0; i < A.length; i++) {
      //get the element in the desired column
      col[i] = A[i][colNum];
    }
    return col;
  }
}

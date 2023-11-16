/* Laura McDonnell
 * CIS 1068
 * Sep 13, 2023
 *
 * Assignment 3
 * This program calculates the course grade for a student */

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //Initialize Scanner object
        Scanner input = new Scanner(System.in);

        //--WEIGHTS--
        System.out.println( "This program accepts your homework and two exam scores as " +
                            "input and computes your grade in the course.");
        //I. Homework weight
        System.out.print("Homework weight?: ");
        int HOMEWORK_WEIGHT = input.nextInt();
        while (HOMEWORK_WEIGHT < 0) {
            System.out.print("Please enter a valid weight: ");
            HOMEWORK_WEIGHT = input.nextInt();
        }

        //II. Exam 1 weight
        System.out.print("Exam 1 weight?: ");
        int EXAM1_WEIGHT = input.nextInt();
        while (EXAM1_WEIGHT < 0) {
            System.out.print("Please enter a valid weight: ");
            EXAM1_WEIGHT = input.nextInt();
        }

        //III. Exam 2 weight
        int EXAM2_WEIGHT = 100 - (HOMEWORK_WEIGHT + EXAM1_WEIGHT);
        System.out.println( "Using weights of " + HOMEWORK_WEIGHT + " (homework), " +
                EXAM1_WEIGHT + " (exam 1), and " + EXAM2_WEIGHT + " (exam 2).");


        //--HOMEWORK--
        System.out.println("\n--Homework--");

        //Number of assignments
        System.out.print("Number of assignments?: ");
        int numAssignments = input.nextInt();

        //Average Homework (Hw) grade
        System.out.print("Average Homework grade?: ");
        double avgHomeworkGrade = input.nextDouble();

        //Number of late days
        System.out.print("Number of late days used?: ");
        int numLateDays = input.nextInt();

        //Number of labs
        System.out.print("Labs attended?: ");
        int numLabs = input.nextInt();

        //Calculate score & weighted score
        double homeworkPoints = calculateHwPoints(numAssignments, avgHomeworkGrade, numLateDays, numLabs);
        System.out.println("Total points = " + homeworkPoints + "/ 140");
        double weightedHwScore = calculateWeightedHwScore(homeworkPoints,HOMEWORK_WEIGHT);
        System.out.printf("Weighted score = %.2f\n", weightedHwScore);


        //--EXAM 1--
        System.out.println("\n--Exam 1--");

        //Get score, curve
        System.out.print("Score?: ");
        int exam1Score = input.nextInt();
        System.out.print("Curve?: ");
        int exam1Curve = input.nextInt();

        //Calculate score & weighted score
        int examOnePoints = calculateExam1Score(exam1Score, exam1Curve);
        double weightedExamOneScore = calculateWeightedExam1Score(examOnePoints, EXAM1_WEIGHT);
        System.out.println("Total points = " + examOnePoints + " / 100");
        System.out.printf("Weighted score = %.2f\n", weightedExamOneScore);


        //--EXAM 2--
        System.out.println("\n--Exam 2--");

        //Get score, curve
        System.out.print("Score?: ");
        int exam2Score = input.nextInt();
        System.out.print("Curve?: ");
        int exam2Curve = input.nextInt();

        //Calculate score & weighted score
        int examTwoPoints = calculateExam2Score(exam2Score, exam2Curve);
        double weightedExam2Score = calculateWeightedExam2Score(examTwoPoints, EXAM2_WEIGHT);
        System.out.println("Total points = " + examTwoPoints + " / 100");
        System.out.printf("Weighted Score = %.2f\n", weightedExam2Score);


        //--COURSE GRADE--
        double courseGrade = calculateCourseGrade(weightedHwScore, weightedExamOneScore, weightedExam2Score);
        System.out.printf("\nCourse Grade = %.2f\n", courseGrade);

        //Close Scanner
        input.close();
    }

    // 1. HOMEWORK POINTS
    public static double calculateHwPoints(int numAssignments, double avgHwGrade, int lateDaysUsed, int labsAttended) {
        double homeworkPoints = (avgHwGrade * 10) + (labsAttended * 4);

        //--Conditionals--
        //No late days | +5
        if (lateDaysUsed == 0) {
            homeworkPoints += 5;
        }
        //Too many late days | -10%
        else if (lateDaysUsed > (numAssignments/2)) {
            homeworkPoints = 0.9 * homeworkPoints;
        }
        //Max points cap
        else if ((homeworkPoints > 140) || (numAssignments <= 0)) {
            homeworkPoints = 100;
        }
        //Negative input | set to 0
        else if (avgHwGrade < 0) {
            homeworkPoints = 0;
        }
        //Do nothing
        else {
            homeworkPoints += 0;
        }
        return(homeworkPoints);
    }

    // 2. HOMEWORK WEIGHTED
    public static double calculateWeightedHwScore(double homeworkScore, int homeworkWeight) {
        return((homeworkScore / 140) * homeworkWeight);
    }
    // 3. EXAM 1 SCORE
    public static int calculateExam1Score(int examOneRawScore, int examOneCurve) {
        int examOneScore = examOneRawScore + examOneCurve;

        //Max points cap
        if (examOneScore > 100) {
            examOneScore = 100;
        }
        //Negative score | set to 0
        else if (examOneRawScore < 0) {
            examOneScore = 0;
        }
        //Do nothing
        else {
            examOneScore += 0;
        }
        return(examOneScore);
    }

    // 4. EXAM 1 WEIGHTED
    public static double calculateWeightedExam1Score(int examOneScore, int examOneWeight) {
        return(((double) examOneScore / 100) * examOneWeight);
    }

    // 5. EXAM 2 SCORE
    public static int calculateExam2Score(int examTwoRawScore, int examTwoCurve) {
        int examTwoScore = examTwoRawScore + examTwoCurve;

        // Max Score Cap
        if (examTwoScore > 100) {
            examTwoScore = 100;
        }
        //Negative score | set to 0
        else if (examTwoRawScore < 0) {
            examTwoScore = 0;
        }
        return(examTwoScore);
    }

    // 6. EXAM 2 WEIGHTED
    public static double calculateWeightedExam2Score(int examTwoScore, int examTwoWeight) {
        return(((double) examTwoScore / 100) * examTwoWeight);
    }

    // 7. COURSE GRADE
    public static double calculateCourseGrade(double homeworkScore, double exam1Score, double exam2Score) {
        return(homeworkScore + exam1Score + exam2Score);
    }
}

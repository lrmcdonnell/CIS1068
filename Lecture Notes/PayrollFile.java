import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;


public class PayrollFile {

//    //123 Kim 12.0 9.8 7.0
//    //456 Eric 4.0 3.8 12
//    //789 Stef 8.0 8.0 8.0 7.8

    public static String procEmployee(String empData) {
        Scanner in = new Scanner(empData);
        int ID = in.nextInt();
        String name = in.next();
        String hours = in.nextLine();
    }

    public static String payrollString(int ID, String name, double numHours, int numDays) {
        String start = name + "(ID# " + ID + ")";

        if (numDays == 0) {
            return start + "didn't work this week.";
        }
        double average = numHours/ numDays;
        return start + "worked" + numHours + "(" + average;

    }
    public static void main (String[] args) throws FileNotFoundException {
        String fileName = "payroll.txt";

        Scanner in = new Scanner(fileName);
        while (in.hasNextLine()) {
            System.out.println(payrollString());
        }

    }

}

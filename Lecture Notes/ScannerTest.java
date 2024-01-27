
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        int x = 5;

        // Scanner for taking inputs
        Scanner inFromKBD = new Scanner(System.in);

        // 'print' command keeps cursor on same line;
        // 'println' command moves cursor to next line
        System.out.print("What is your name? ");
        String name = inFromKBD.nextLine();

        System.out.println("Hi, " + name + ". Very nice to meet you.");

        System.out.print("How old are you?: ");
        int age = inFromKBD.nextInt();

        System.out.println("Wow. Next year you'll be " + (age + 1));

        inFromKBD.close();
    }
}

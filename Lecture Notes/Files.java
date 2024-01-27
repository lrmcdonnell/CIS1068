import java.util.Scanner;
import java.io.*;

public class Files {
    public static void main(String[] args)
            //throws clause (handles exceptions)
            throws FileNotFoundException {
        String filename = "input.txt";
        Scanner in = new Scanner(new File(filename));
        for (int i = 0; i < 5; i++) {
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}

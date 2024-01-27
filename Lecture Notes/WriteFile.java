import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outToFile = new PrintWriter(new File("wisdom.txt"));

        outToFile.println("There's always money in the banana stand");
        outToFile.close();
    }
}

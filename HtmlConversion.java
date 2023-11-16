import java.util.*;
import java.io.*;
import java.util.regex.*;

public class HtmlConversion {
    public static void main(String[] args) throws FileNotFoundException {

        // 1. GET .TXT FILE NAME, CREATE .HTML FILE

        //Initialize scanner to get file name from user
        Scanner scanner = new Scanner(System.in);
        //Get file name (.txt extension)
        System.out.print("Please enter the name of your .txt file: ");
        String inputName = scanner.nextLine();
        //Check for bad input
        while (!inputName.endsWith(".txt")) {
            System.out.print("Invalid name. \nPlease enter the name of your .txt file: "); //reprompt user
            inputName = scanner.nextLine(); //update file name
        } //Create output file name (.html extension)
        String outputName = inputName.replace("txt", "html");


        // 2. INITIALIZE FILE READING & WRITING TOOLS

        //Initialize PrintWriter, file Scanner
        PrintWriter htmlWriter = new PrintWriter(new File(outputName));
        Scanner fileScanner = new Scanner(new File(inputName));
        //Regex pattern for URLs: [[X][Y]]
        Pattern urlText = Pattern.compile("\\[\\[(.*?)\\]\\]");
        //This helps with recognizing lists
        int hyphens = 0;
        boolean lineStartWithHyphen = false;


        // 3. LOOP THROUGH INPUT FILE & WRITE OUTPUT FILE

        //Write output file header tags
        htmlWriter.println("<html>");
        htmlWriter.println("<body>");

        //Loop through each line of the file
        while (fileScanner.hasNextLine()) {
            //Get current line
            String line = fileScanner.nextLine();
            //Set up regex matcher object
            Matcher urlMatch = urlText.matcher(line);

            //while URL is present
            /* I was unsure on where to put this in the code */
            while (urlMatch.find()) {
                //matched pattern: [[X][Y]]
                String url = urlMatch.group(1); // X][Y
                //replace bracket with uncommon string (to avoid splitting issues in next step)
                url = url.replace("[", "-----");
                url = url.replace("]", ""); // X-----Y
                //split X-----Y into X, Y
                String[] urls = url.split("-----"); // {X, Y}
                url = urls[0]; //X
                String linkText = urls[1]; //Y
                htmlWriter.println("<a href=\"" + url + "\">" + linkText + "</a>");
            }

            //line begins with hyphen: " - line "
            if (line.startsWith("-")) {
                lineStartWithHyphen = true;
                //first item in list: precede with "<ul">
                if (hyphens == 0) {
                    htmlWriter.println("<ul>");
                }
                htmlWriter.println(hyphen(line));
                hyphens++;

            //line begins & ends with underscores: " _line_ "
            } else if (line.startsWith("_") && line.endsWith("_")) {
                htmlWriter.println(underscores(line));
                lineStartWithHyphen = false;

            //blank line: ""
            } else if (line.equals("")) {
                if (lineStartWithHyphen) {
                    htmlWriter.println("</ul>");
                }
                htmlWriter.println(blank());
                lineStartWithHyphen = false;

            //regular line of text
            } else {
                htmlWriter.println(regularLine(line));
                lineStartWithHyphen = false;
            }
        }
        //Write output file end tags
        htmlWriter.println("</body>");
        htmlWriter.println("</html>");

        //close scanners & writers
        scanner.close();
        fileScanner.close();
        htmlWriter.close();
    }

    // UNDERSCORES: " _LINE_ "
    public static String underscores(String line) {
        line = line.replace("_", "");
        String newLine = "<h1>" + line + "</h1>";

        return newLine;
    }

    // HYPHEN: " - LINE "
    public static String hyphen(String line) {
        line = line.replace("-", "");
        String newLine = "<li>" + line + "</li>";

        return newLine;
    }

    // BLANK LINE: ""
    public static String blank() {
        String newLine = "<p>";

        return newLine;
    }

    // REGULAR TEXT
    public static String regularLine(String line) {
        String newLine = line + "<br />";

        return newLine;
    }

}

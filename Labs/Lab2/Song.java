/* Laura McDonnell
 * Sept 6, 2023
 * CIS 1068 Section 006
 *
 * Assignment 2
 * This Program prints the song 'Bought Me a Cat' */

public class Song {
    public static void main(String[] args) {
        verseOneCat();
        verseTwoHen();
        verseThreeDuck();
        verseFourGoose();
        verseFiveSheep();
        verseSixPig();
    }

    // VERSES --------------------------------------------------------

    public static void verseOneCat() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
        catEnding();
    }
    public static void verseTwoHen() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
        henEnding();
    }
    public static void verseThreeDuck() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
        duckEnding();
    }
    public static void verseFourGoose() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
        gooseEnding();
    }
    public static void verseFiveSheep() {
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
        sheepEnding();
    }
    public static void verseSixPig() {
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
        pigEnding();
    }

    // ENDINGS FOR EACH VERSE ------------------------------------------

    public static void catEnding() {
        System.out.println("Cat goes fiddle-i-fee.");
        System.out.println();
    }
    public static void henEnding() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        catEnding();
    }
    public static void duckEnding() {
        System.out.println("Duck goes quack, quack,");
        henEnding();
    }
    public static void gooseEnding() {
        System.out.println("Goose goes hissy, hissy,");
        duckEnding();
    }
    public static void sheepEnding() {
        System.out.println("Sheep goes baa, baa,");
        gooseEnding();
    }
    public static void pigEnding() {
        System.out.println("Pig goes oink, oink,");
        sheepEnding();
    }
}


public class CharStuff {
    public static void main(String[] args) {
        char c1, c2;

        c1 = 'A';
        c2 = 'B';

        System.out.println(c1);
        System.out.println(c2);

        //compare (equality)
        if (c1 == c2) {
            System.out.println("same");
        }
        else {
            System.out.println("different");
        }

        //compare (greater than)
        if (c2 > c1) {
            System.out.println("bigger");
        }
        else {
            System.out.println("not bigger");
        }

        //goes to next letter (A -> B)
        c1 += 1;
        System.out.println(c1);


        //prints alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
        System.out.println();

        // 'a' :: the char which is just the letter a
        // "a" :: the string which consists of just the letter a

        //everything in a computer is stored as a number

        for (int i = 65;  i <= 90; i++) {
            System.out.println(i + "-> " + (char)i);
        }
    }
}

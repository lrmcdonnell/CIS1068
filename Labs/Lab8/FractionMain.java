// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 8: Fractions
// This program is a test for the Fraction Class

public class FractionMain {

    public static void main(String[] args) {
        Fraction frac = new Fraction(10, 20); //make fraction: 10/20 (1/2)
        System.out.println(frac.toString());
        System.out.println(frac.equals(new Fraction(1, 2))); //if 1/2 == 1/2
        frac.setNum(1);
        frac.setDenom(2);
        System.out.println(frac.add(new Fraction(5, 6))); //adding fractions
    }
}

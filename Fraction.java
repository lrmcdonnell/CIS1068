// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 8: Fractions
// This program constructs a 'Fraction' class

public class Fraction {
    private int n, d;

    //Constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException();
        }
        int gcd = gcd(numerator,denominator);
        n = numerator/gcd;
        d = denominator/gcd;
    }

    //get GCD
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //Getter: numerator
    public int getNum() {
        return n;
    }
    //Getter: denominator
    public int getDenom() {
        return d;
    }
    //Setter: numerator
    public void setNum(int newN) {
        n = newN;
    }
    //Setter: denominator
    public void setDenom(int newD) {
        if (newD == 0) {
            throw new ArithmeticException();
        }
        int gcd = gcd(n, newD);
        d = newD/gcd;
    }
    //Adding fractions
    public Fraction add(Fraction a) {
        return new Fraction(n * a.d + d * a.n, d * a.d);
    }
    //Equals method
    public boolean equals(Fraction a) {
        if ((n == a.n) && (d == a.d)) {
            return true;
        }
        return false;
    }
    //To string method
    public String toString() {
        return(n + "/" + d);
    }
}

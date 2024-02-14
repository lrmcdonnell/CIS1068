// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 8: Cars
// This program is a test for the Car Class

public class CarMain {
    public static void main(String[] args) {
        Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8);
        oldJunker.drive(5); // drive the car 5 miles
        oldJunker.fillTank(1); // put in 1 gallon
        System.out.println(oldJunker.getFuelRemaining()); // amount of fuel left
        System.out.println(oldJunker); // attributes
    }
}

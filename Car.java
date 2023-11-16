// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 8: Cars
// This program constructs a 'Car' class

public class Car {
    //private: can't use outside these curly braces
    private String make, model;
    private int year;
    private double MPG, milesDriven, fuelCapacity, fuelRemaining;

    //Constructor
    public Car(String newMake, String newModel, int newYear, double newMPG, double newMilesDriven, double newFuelCapacity, double newFuelRemaining) {
        make = newMake;
        model = newModel;
        year = newYear;
        MPG = newMPG;
        milesDriven = newMilesDriven;
        fuelCapacity = newFuelCapacity;
        fuelRemaining = newFuelRemaining;
    }

    //Fill Tank
    public void fillTank(double g) {
        fuelRemaining += g;
        if (fuelRemaining > fuelCapacity) {
            this.fuelRemaining = fuelCapacity;
         }
    }

    //Drive
    public void drive(double m) {
        double fuel = m / this.MPG;
        if (fuel <= fuelRemaining) {
            fuelRemaining -= fuel;
            milesDriven += m;
        }
    }

    //To String
    public String toString() {
        return("Make: " + make + ", Model: " + model + ", Year: " + year + ", MPG: " + MPG + ", Miles Driven: " + milesDriven + ", Fuel Capacity: " + fuelCapacity + ", Fuel Remaining: " + fuelRemaining);
    }

    //Getter: Fuel Remaining
    public double getFuelRemaining() {
        return fuelRemaining;
    }
}

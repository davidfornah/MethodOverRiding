package com.sapunka;
//OVERRIDING METHOD
public class Main {
    static class Vehicle{
        void run()
        {
            System.out.println("\nThe Vehicle is running!");
        }
    }
    static class Bike extends Vehicle
    {
        void run()
        {
            System.out.println("The bike is running safely");
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();
        Bike bike = new Bike();
        bike.run();

    }
}

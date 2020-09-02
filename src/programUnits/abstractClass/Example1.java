/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 10:23 AM
 *  File Name : Example1.java
 * */
package programUnits.abstractClass;

public class Example1 {
    public static void main(String[] args) {

    }
}

abstract class Vehicle {
    abstract public void accelerate();

    public void display() {
        System.out.println("Vehicle class.");
    }
}

class Car extends Vehicle {
    // implementing the abstract method of an abstract class.
    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }
}

class Bike extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bike accelerating...");
    }
}

class AutoRickshaw extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("AutoRickshaw accelerating...");
    }
}
/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 3:04 PM
 *  File Name : Vehicle.java
 * */
package definitions;

/**
 * This class will define a Vehicle object.
 * */
public class Vehicle {

    // public, private, protected, <default>

    // helper methods: created to help other methods of this class
    private void startVehicle() {
        checkEngine();
        System.out.println("Vehicle is starting...");
    }

    private void testVehicleStart() {
        startVehicle();
    }

    protected void checkEngine() {
        System.out.println("Engine is ok for now.");
    }

    public void commute() {
        startVehicle();
        System.out.println("commuting...");
    }

    // overloaded commute() method
    public void commute(String destination) {
        System.out.println("commuting to " + destination + "...");
    }

}
// SuperClass/ParentClass: is the class whose properties can be inherited.
// In our example, the Vehicle.java class is the super class.
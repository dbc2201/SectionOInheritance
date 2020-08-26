/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 10:10 AM
 *  File Name : Truck.java
 * */
package definitions;

public class Truck extends Vehicle {
    public void refillWaterInEngine() {
        System.out.println("Water refilled...");
        checkEngine();
    }
}

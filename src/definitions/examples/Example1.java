/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 3:04 PM
 *  File Name : Example1.java
 * */
package definitions.examples;

public class Example1 {
    public static void main(String[] args) {
        Bus miniBus = new Bus();
    }
}
class Vehicle {
    float speed;
    float mileage;

    void methodA() {
        System.out.println("Vehicle class method.");
    }
}
class Bus extends Vehicle {
    // method overriding
    @Override
    void methodA() {
        System.out.println("Bus class method.");
    }
}







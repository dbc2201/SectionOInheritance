/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 3:06 PM
 *  File Name : FourWheeler.java
 * */
package definitions;

public class FourWheeler extends Vehicle {

    // overloaded commute() method
    public void commute(String source, String destination) {
        checkEngine();
        System.out.println("Commuting from " + source + " to " + destination + "...");
    }

    // overridden commute() method
    @Override // to check the signature of the method we want to override.
    // if the signature is wrong, the compiler will give us an error.
    public void commute() {
        System.out.println("FourWheeler is commuting...");
    }

    public void move() {
        commute();
    }

}

// Hierarchy
// Vehicle --> (FourWheeler && Car)
// super   --> sub
// parent  --> child(ren), simple inheritance

// FourWheeler IS A TYPE of Vehicle.
// SubClass/ChildClass: is the class that will inherit the data and behaviour.
// data -> fields, variables
// behaviour -> methods, functions
// In our example, the FourWheeler.java class is the sub class.

// <visibilityModifier> class <ClassName1> extends <ClassName2> {}
// public               class FourWheeler  extends Vehicle      {}
// <ClassName2> is the super class of <ClassName1>.
// Vehicle class is the super class of FourWheeler class.
// FourWheeler class is the sub class of Vehicle class.
/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 10:44 AM
 *  File Name : Circle.java
 * */
package programUnits.abstractClass;

public class Circle extends Shape {

    public Circle(double length, int numberOfSides) {
        super(length, numberOfSides);
        // super is a keyword that can access the members of the parent class.
        // super() <- this will call the constructor of the parent class.
        // super.methodName() <- this will call the methodName() method of the parent class.
    }

    @Override
    double findArea() {
        return Math.PI * Math.pow(getLength(), 2.0);
    }
}

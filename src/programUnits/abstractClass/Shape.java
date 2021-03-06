/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 10:34 AM
 *  File Name : Shape.java
 * */
package programUnits.abstractClass;

abstract public class Shape {
    private double length;
    private int numberOfSides;

    public Shape(double length, int numberOfSides) {
        this.length = length;
        this.numberOfSides = numberOfSides;
    }

    public double getLength() {
        return length;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    abstract double findArea();
}

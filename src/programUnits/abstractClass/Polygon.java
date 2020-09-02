/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 10:39 AM
 *  File Name : Polygon.java
 * */
package programUnits.abstractClass;

public class Polygon extends Shape {
    public Polygon(double length, int numberOfSides) {
        super(length, numberOfSides);
    }

    // Formula for finding the area of a polygon?

    // number of sides * side ^ 2 / (tan (PI / number of sides))

    @Override
    double findArea() {
        return (getNumberOfSides() * Math.pow(getLength(), 2.0))
                / (Math.tan(Math.PI / getNumberOfSides()));
    }
}

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

    @Override
    double findArea() {
        return 0;
    }
}

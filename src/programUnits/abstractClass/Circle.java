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
    }

    @Override
    double findArea() {
        return 0;
    }
}

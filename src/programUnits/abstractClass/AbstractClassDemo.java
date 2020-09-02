/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 10:12 AM
 *  File Name : AbstractClassDemo.java
 * */
package programUnits.abstractClass;

public class AbstractClassDemo {
    public static void main(String[] args) {

    }
}

// abstract is something that is not properly defined.
abstract class Demo {
    abstract public void display();

    public int sum(int x, int y) {
        return x + y;
    }
}

class Adder extends Demo {
    @Override
    public void display() {
        System.out.println("Adder class (child).");
    }

    @Override
    public int sum(int x, int y) {
        return x + y + 1;
    }
}

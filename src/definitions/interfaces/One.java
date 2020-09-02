/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 3:04 PM
 *  File Name : One.java
 * */
package definitions.interfaces;

public interface One {
    // For Fields of the Interface.
    public final double PI = 3.14;
    // Because, all the fields declared inside an interface are
    // are automatically declared as public and final by the compiler.

    // For Methods of the Interface.
    // The methods will not have any body.
    // All the methods declared inside an interface are
    // automatically declared as public and abstract by the compiler.
    public abstract void method();
}

class Example {
    public int number = 4;
    private double radius = 2.05;
    protected float marks = 6.1f;
    char gender = 'M';
}

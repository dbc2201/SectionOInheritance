/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 3:03 PM
 *  File Name : SingleInheritance.java
 * */
package definitions.examples;

public class SingleInheritance {
    public static void main(String[] args) {
        DemoA objectA = new DemoA();
        objectA.display();
        DemoB objectB = new DemoB();
        objectB.display();
    }
}
class DemoA { // Parent Class
    public void display() {
        System.out.println("Display Method of the Super Class.");
    }
}

class DemoB extends DemoA { // Child Class
//    public void display() { // Method Overriding ??
//        System.out.println("Display Method of the Sub Class.");
//    }
}
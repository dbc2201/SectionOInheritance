/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 3:17 PM
 *  File Name : MultipleInheritance.java
 * */
package definitions.examples;

public class MultipleInheritance {
    public static void main(String[] args) {
        D objectD = new D();
        objectD.methodD(4);
        objectD.methodB();
        objectD.methodA(5);
    }
}
class A {
    int j = 0; // is a field.

    public void methodA(int k) { // k is called a parameter
        j = k;
    }
}
class B extends A {
    // This methodA() is overridden.
    public void methodA(int k) { // method overriding
        j = k * k;
        System.out.println("j = " + j);
    }

    public void methodB() {
        System.out.println("Method of Class B.");
    }
}
class C extends A {
    public void methodA(int k) { // method overriding
        j = k * 5;
        System.out.println("j = " + j);
    }
    public void methodC() {
        System.out.println("Method of Class C.");
    }
}
class D extends B {
    public void methodD(int k) {
        System.out.println("Method of Class D.");
    }
}
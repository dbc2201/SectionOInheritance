/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 3:13 PM
 *  File Name : Example2.java
 * */
package definitions.examples;

public class Example2 {
    public static void main(String[] args) {
        A1 objectA1 = new A1();
        B1 objectB1 = new B1();
    }
}
class A1 {
    int j, k;
    void displayA() {
        System.out.println("j = " + j + ", k = " + k);
    }
}
class B1 extends A1 {
    int m;
    void displayB() {
        System.out.println("j = " + j + ", k = " + k + ", m = " + m);
    }
}

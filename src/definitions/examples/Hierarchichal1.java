/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 3:39 PM
 *  File Name : Hierarchichal1.java
 * */
package definitions.examples;

public class Hierarchichal1 {
    public static void main(String[] args) {
        B objectB = new B();
        objectB.setValues(10, 9);
        System.out.println("product = " + objectB.product(10, 9));
        C objectC = new C();
        objectC.setValues(35, 7);
        System.out.println("division = " + objectC.division(35, 7));
    }
}
class A {
    public int i, j;

    public void setValues(int x, int y) {
        i = x;
        j = y;
    }

    public int sum(int x, int y) {
        int sum = i + j;
        return sum;
    }
}
class B extends A {
    public int product(int x, int y) {
        int product = i * j;
        return product;
    }
}
class C extends A {
    public int division(int x, int y) {
        int division = i / j;
        return division;
    }

    public int difference(int x, int y) {
        int difference = i - j;
        return difference;
    }
}
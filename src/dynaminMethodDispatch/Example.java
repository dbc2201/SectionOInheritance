/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 3:09 PM
 *  File Name : Example.java
 * */
package dynaminMethodDispatch;

public class Example {
    public static void main(String[] args) {

    }
}

class Human {
    public void talk() {
        System.out.println("I am a human.");
    }
}

// Student IS A type of Human.
class Student extends Human {
    @Override
    public void talk() {
        System.out.println("I am a Human, and also a Student.");
    }
}

// TopperStudent IS A type of Student.
class TopperStudent extends Student {
    @Override
    public void talk() {
        System.out.println("I am a Human, a Student, and also a TopperStudent.");
    }
}

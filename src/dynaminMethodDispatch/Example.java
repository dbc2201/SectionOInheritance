/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 3:09 PM
 *  File Name : Example.java
 * */
package dynaminMethodDispatch;

public class Example {
    public static void main(String[] args) {
        Human human = new Human();
        // We have created an object of the Human class, and
        // we are storing the reference value of the object in a
        // reference variable of the Human class.
        Student student = new Student();
        TopperStudent topperStudent = new TopperStudent();

        Human human1 = human;
        human1.talk();
    }
}

class Human {
    public void talk() {
        System.out.println("I am a Human.");
    }
}

// Student IS A type of Human.
class Student extends Human {
    @Override
    public void talk() {
        super.talk();
        System.out.println("I am also a Student.");
    }
}

// TopperStudent IS A type of Student.
class TopperStudent extends Student {
    @Override
    public void talk() {
        super.talk();
        System.out.println("I am also a TopperStudent.");
    }
}

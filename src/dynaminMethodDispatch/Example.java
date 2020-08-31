/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 3:09 PM
 *  File Name : Example.java
 * */
package dynaminMethodDispatch;

public class Example {
    public static void main(String[] args) {
        // We have created an object of the Human class, and
        // we are storing the reference value of the object in a
        // reference variable of the Human class.
        Human human = new Human();
        Student student = new Student();
        TopperStudent topperStudent = new TopperStudent();

        // First, the reference variable of the superclass is created,
        // then it was assigned the value of its subclass.
        // The appropriate method version is selected by the compiler
        // at runtime, i.e it selects the correct version of the method in
        // the subclass of the object reference value, which was assigned to the
        // superclass reference variable.

        Human human1 = topperStudent;
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

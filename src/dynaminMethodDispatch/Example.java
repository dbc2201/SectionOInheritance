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
        human.talk();
        Student student = new Student();
        student.talk();
        TopperStudent topperStudent = new TopperStudent();
        topperStudent.talk();
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

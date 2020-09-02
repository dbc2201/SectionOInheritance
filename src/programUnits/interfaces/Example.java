/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 3:15 PM
 *  File Name : Example.java
 * */
package programUnits.interfaces;

interface Human {
    /**
     * This method allows a Human to talk.
     */
    void talk();
}

interface Student {
    /**
     * This method helps a Student to study.
     */
    void study();
}

abstract class Teacher {
    abstract public void teach();
}

class Divyansh extends Teacher implements Human, Student {

    @Override
    public void talk() {

    }

    @Override
    public void study() {

    }

    @Override
    public void teach() {

    }
}

public class Example {
    public static void main(String[] args) {

    }
}

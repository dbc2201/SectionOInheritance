/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 3:20 PM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {

    }
}
class Bike {
    private int idNumber;
    private String modelName;

    public void setValues(int idNumber, String modelName) {
        this.idNumber = idNumber;
        this.modelName = modelName;
    }

    public double price;

    void displayBikeInformation() {
        System.out.println("idNumber = " + idNumber);
        System.out.println("modelName = " + modelName);
        System.out.println("price = " + price);
    }
}







/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 3:20 PM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        SuperBike mySuperBike = new SuperBike();
        myBike.setValues(1, "Passion");
        myBike.displayBikeInformation();
        mySuperBike.price = 1_20_000.0;
        mySuperBike.displayBikeInformation();
        mySuperBike.setValues(2, "Bullet");
        mySuperBike.displayBikeInformation();
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

    public int getIdNumber() {
        return idNumber;
    }

    public String getModelName() {
        return modelName;
    }
}
class SuperBike extends Bike {
    int maxSpeed;

    void displayMaxSpeed() {
        System.out.println(this.maxSpeed);
    }
}













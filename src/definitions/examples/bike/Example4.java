/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 3:29 PM
 *  File Name : Example4.java
 * */
package definitions.examples.bike;

public class Example4 {
    public static void main(String[] args) {
        Bike myBike = new Bike(123, 50_000.0);
        myBike.displayBikeInfo();
        SuperBike mySuperBike = new SuperBike(456, 60_000.0, 120.0);
        mySuperBike.displaySuperBikeInfo();
    }
}
class Bike {
    private int modelNumber;
    public double price;

    public Bike(int modelNumber, double price) {
        this.modelNumber = modelNumber;
        this.price = price;
    }

    public void displayBikeInfo() {
        System.out.println("modelNumber = " + modelNumber);
        System.out.println("price = " + price);
    }
}
class SuperBike extends Bike {
    private double maxSpeed;
    public SuperBike(int modelNumber, double price, double maxSpeed) {
        super(modelNumber, price);
        this.maxSpeed = maxSpeed;
    }
    public void displaySuperBikeInfo() {
        super.displayBikeInfo();
        System.out.println("maxSpeed = " + maxSpeed);
    }
}

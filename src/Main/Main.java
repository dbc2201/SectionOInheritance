/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 10:47 AM
 *  File Name : Main.java
 * */
package Main;

import definitions.FourWheeler;
import definitions.MobilePhone;
import definitions.Phone;
import definitions.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.commute("Delhi");
        // Since, FourWheeler is the child of Vehicle, it can access the commute() method.
        FourWheeler myFourWheeler = new FourWheeler();
        myFourWheeler.commute("Delhi", "Goa");
    }
}

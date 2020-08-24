/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 10:47 AM
 *  File Name : Main.java
 * */
package Main;

import definitions.MobilePhone;
import definitions.Phone;

public class Main {
    public static void main(String[] args) {
        Phone myLandlinePhone = new Phone();
        myLandlinePhone.setOwnContactNumber(1234567890L);
        System.out.println(myLandlinePhone.getOwnContactNumber());
        MobilePhone noika11 = new MobilePhone();
        noika11.printOwnContactNumber();
    }
}

/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 10:42 AM
 *  File Name : MobilePhone.java
 * */
package definitions;

public class MobilePhone extends Phone {
    // We have "inherited" the fields and methods of the Phone class
    // from teh MobilePhone class.
    public void printOwnContactNumber() {
        System.out.println(super.getOwnContactNumber());
    }
}
// We have created a Phone, that has its own contact number.
// fields:
// 1. ownContactNumber

// We have created a MobilePhone, so this should also have its contact number.
// MobilePhone is a type of Phone.
// We do not have to create a new field for the contact number again.
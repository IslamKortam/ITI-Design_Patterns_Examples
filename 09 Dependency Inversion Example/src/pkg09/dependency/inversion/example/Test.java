/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.dependency.inversion.example;

import com.sun.javafx.geom.Vec2d;
import java.util.Vector;

/**
 *
 * @author imkor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Phone> availablePhones = new Vector<Phone>();
        OnlinePhoneStore store = new OnlinePhoneStore(availablePhones);
        store.addPhone(new ApplePhone("1", "Iphone X"));
        store.addPhone(new SamsungPhone("2", "S21"));
        store.addPhone(new HuaweiPhone("3", "Huawei X"));
        store.printPhones();
        store.removePhone("2");
        System.out.println("Phones after removing phone 2:");
        store.printPhones();
    }
    
}

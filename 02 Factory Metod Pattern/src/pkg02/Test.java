/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02;

import java.lang.reflect.Array;

/**
 *
 * @author imkor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhoneFactory pFactory = PhoneFactory.getInstance();
        
        Phone[] phones = {  pFactory.getPhone("Samsung"),
                            pFactory.getPhone("Apple"),
                            pFactory.getPhone("Huawei")
                            };
        
        for(Phone phone : phones){
            phone.makeCall();
            System.out.println("Type of the Phone Object: (" + phone.getClass() + ")");
            System.out.println("_____________________________");
        }
        
    }
    
}

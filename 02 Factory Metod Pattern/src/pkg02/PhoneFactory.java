/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02;

/**
 *
 * @author imkor
 */
public class PhoneFactory {
    //We need only one instance of the phoneFactory, so I will use the Singleton Design Pattern to implement it
    private static PhoneFactory instance = null;
    
    private PhoneFactory(){
        
    }
    
    public Phone getPhone(String phoneType){
        Phone phone;
        //TO Normalize the type to lower case to reduce typing errors
        phoneType = phoneType.toLowerCase();
        switch(phoneType){
            case "samsung":
                phone = new SamsungPhone();
                break;
            case "apple":
                phone = new ApplePhone();
                break;
            case "huawei":
                phone = new HuaweiPhone();
                break;
            default:
                phone = null;
                break;
        }
        
        return phone;
    }
    
    public static PhoneFactory getInstance(){
        if(instance == null){
            instance = new PhoneFactory();
        }
        return instance;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.dependency.inversion.example;

import java.util.Vector;

/**
 *
 * @author imkor
 */
public class OnlinePhoneStore {
    private Vector<Phone> phones;
    
    public OnlinePhoneStore(Vector<Phone> phones){
        this.phones = phones;
    }
    
    public void addPhone(Phone phone){
        this.phones.add(phone);
    }
    
    public void removePhone(String id){
        Phone toBeRemovedphone = null;
        for(Phone phone : phones){
            if(id.equalsIgnoreCase( phone.getID() ) ){
                toBeRemovedphone = phone;
                break;
            }
        }
        if(toBeRemovedphone != null)
            this.phones.remove(toBeRemovedphone);
    }
    
    public void printPhones(){
        System.out.println("Available Phones: ");
        for(Phone phone : phones){
            System.out.println("Phone ID: " + phone.getID());
            System.out.println("Model Name: " + phone.getModelName());
        }
        System.out.println("______________________________-");
    }
}

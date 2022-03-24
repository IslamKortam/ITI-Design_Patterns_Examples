/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.dependency.inversion.example;

/**
 *
 * @author imkor
 */
public class HuaweiPhone extends Phone{

    public HuaweiPhone(String id, String modelName) {
        super(id, modelName);
    }
    
    
    @Override
    public void makeCall() {
        System.out.println("Making a call from a Huawei Phone");
    }
    
}

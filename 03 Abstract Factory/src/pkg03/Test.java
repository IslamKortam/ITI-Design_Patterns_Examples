/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03;

import devices.ICall;
import devicesFactory.AbstractDeviceFactory;
import devicesFactory.DeviceFactoryProducer;

/**
 *
 * @author imkor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractDeviceFactory phoneFactory = DeviceFactoryProducer.getFactory("Phone");
        AbstractDeviceFactory tabletFactory = DeviceFactoryProducer.getFactory("Tablet");
        
        ICall[] devices = { phoneFactory.getDevice("samsung"),
                            phoneFactory.getDevice("huawei"),
                            phoneFactory.getDevice("Apple"),
                            tabletFactory.getDevice("Ipad"),
                            tabletFactory.getDevice("samsung"),
                            tabletFactory.getDevice("huawei")
        };
        
        for(ICall device : devices){
            device.makeCall();
        }
    }
    
}

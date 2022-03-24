/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicesFactory;

/**
 *
 * @author imkor
 */
public class DeviceFactoryProducer {
    public static AbstractDeviceFactory getFactory(String factoryType){
        factoryType = factoryType.toLowerCase();
        AbstractDeviceFactory factory;
        switch(factoryType){
            case "phone":
                factory = new PhoneFactory();
                break;
            case "tablet":
                factory = new TabletFactory();
                break;
            default:
                factory = null;
                break;
        }
        return factory;
    }
}

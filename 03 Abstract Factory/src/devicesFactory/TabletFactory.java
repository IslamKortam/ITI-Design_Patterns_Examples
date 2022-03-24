/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicesFactory;

import devices.HuaweiTablet;
import devices.ICall;
import devices.IPad;
import devices.SamaungTab;
import devices.SamsungPhone;

/**
 *
 * @author imkor
 */
public class TabletFactory extends AbstractDeviceFactory{

    @Override
    public ICall getDevice(String deviceType) {
        ICall device;
        deviceType = deviceType.toLowerCase();
        switch(deviceType){
            case "samsung":
                device = new SamaungTab();
                break;
            case "ipad":
                device = new IPad();
                break;
            case "huawei":
                device = new HuaweiTablet();
                break;
            default:
                device = null;
                break;
        }
        return device;  
    }
    
}

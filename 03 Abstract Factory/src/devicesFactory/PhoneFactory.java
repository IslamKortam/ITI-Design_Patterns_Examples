/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicesFactory;

import devices.ApplePhone;
import devices.HuaweiPhone;
import devices.ICall;
import devices.SamsungPhone;

/**
 *
 * @author imkor
 */
public class PhoneFactory extends AbstractDeviceFactory{

    @Override
    public ICall getDevice(String deviceType) {
        ICall device;
        deviceType = deviceType.toLowerCase();
        switch(deviceType){
            case "samsung":
                device = new SamsungPhone();
                break;
            case "apple":
                device = new ApplePhone();
                break;
            case "huawei":
                device = new HuaweiPhone();
                break;
            default:
                device = null;
                break;
        }
        return device;
    }
    
}

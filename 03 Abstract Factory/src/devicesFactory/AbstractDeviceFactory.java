/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicesFactory;

import devices.ICall;

/**
 *
 * @author imkor
 */
public abstract class AbstractDeviceFactory {
    public abstract ICall getDevice(String deviceType);
}

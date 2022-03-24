/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;

/**
 *
 * @author imkor
 */
public class HuaweiTablet implements ICall{
    @Override
    public void makeCall() {
        System.out.println("Making a call from a Huawei Tablet");
    }
}

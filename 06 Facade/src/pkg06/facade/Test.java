/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.facade;

import engineComponents.AirFlowController;
import engineComponents.CoolingController;
import engineComponents.FuelInjector;
import engineComponents.Starter;

/**
 *
 * @author imkor
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EngineFacade engineFacade = new EngineFacade(new AirFlowController(), 
                                    new CoolingController(),
                                    new FuelInjector(), 
                                    new Starter());
        engineFacade.startEngine();
        System.out.println("_________________________");
        engineFacade.stopEngine();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.facade;

import engineComponents.*;

/**
 *
 * @author imkor
 */
public class EngineFacade {
    AirFlowController airFlowController;
    CoolingController coolingController;
    FuelInjector fuelInjector;
    Starter starter;

    public EngineFacade(AirFlowController airFlowController, CoolingController coolingController, FuelInjector fuelInjector, Starter starter) {
        this.airFlowController = airFlowController;
        this.coolingController = coolingController;
        this.fuelInjector = fuelInjector;
        this.starter = starter;
    }
    
    public void startEngine(){
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.inject();
        starter.start();
        coolingController.start();
    }
    
    public void stopEngine(){
        fuelInjector.off();
        coolingController.stop();
        airFlowController.off();
    }
}

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
public abstract class Phone {
    private String ID;
    private String modelName;

    public Phone(String ID, String modelName) {
        this.ID = ID;
        this.modelName = modelName;
    }
    
    public abstract void makeCall();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    
    
    
}

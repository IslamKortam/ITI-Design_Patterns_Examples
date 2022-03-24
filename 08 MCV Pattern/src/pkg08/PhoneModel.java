/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08;

/**
 *
 * @author imkor
 */
public class PhoneModel {
    private String id;
    private String type;
    private String modelName;

    public PhoneModel(String id, String type, String modelName) {
        this.id = id;
        this.type = type;
        this.modelName = modelName;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    
}

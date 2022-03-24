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
public class PhoneController {
    private PhoneModel model;
    private PhoneView view;

    public PhoneController(PhoneModel model, PhoneView view) {
        this.model = model;
        this.view = view;
    }
    
    

    public String getPhoneId() {
        return model.getId();
    }

    public void setPhoneId(String id) {
        model.setId(id);
    }

    public String getPhoneType() {
        return model.getType();
    }

    public void setPhoneType(String type) {
        model.setType(type);
    }

    public String getPhoneModelName() {
        return model.getModelName();
    }

    public void setPhoneModelName(String modelName) {
        model.setModelName(modelName);
    }
    
    public void updateView(){
        view.showPhoneData(model.getId(), model.getType(), model.getModelName());
    }
}

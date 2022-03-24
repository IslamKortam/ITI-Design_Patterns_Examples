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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhoneModel model = new PhoneModel("12321", "Samsung", "S21");
        PhoneView view = new PhoneView();
        PhoneController phoneController = new PhoneController(model, view);
        phoneController.updateView();
        phoneController.setPhoneModelName("S20");
        phoneController.setPhoneType("Apple");
        phoneController.updateView();
    }
    
}

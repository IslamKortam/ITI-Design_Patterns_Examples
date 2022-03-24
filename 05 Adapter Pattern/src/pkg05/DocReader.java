/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05;

/**
 *
 * @author imkor
 */
public class DocReader extends WordFileReader{

    @Override
    public void readDoc(String fileName) {
        System.out.println("Reading file: " + fileName + " in Doc Format");
    }

    @Override
    public void readDocx(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
